package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

/**
 * The purpose of the class is to map a cubic calculation to
 * a multidimensional ArrayList as the partials iterate over
 * the cubic sum of n in the key to value mappings.
 * 
 * Help from : https://www.javatpoint.com/java-map
 * 			   https://www.baeldung.com/java-multi-dimensional-arraylist
 *             https://www.w3schools.com/java/java_hashmap.asp
 *             https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
 *              
 * @author devel - Rachel. J. Clarke & Russell. A. E. Clarke
 */

public class Cubic_Mapping_4 {

	static Map<Integer, ArrayList<Object>> map = new HashMap<>();
	static ArrayList<ArrayList<ArrayList<Object>>> c = new ArrayList<>();

	/**
	 * Populate an ArrayList with n indices cubed.
	 * 
	 * @param n
	 * @return Three dimensional ArrayList c
	 */
	public static ArrayList<ArrayList<ArrayList<Object>>> three_d_list(int n) {

		int i, j;
		int x_axis = n;
		int y_axis = n;
		int z_axis = n;

		ArrayList<ArrayList<ArrayList<Object>>> c = new ArrayList<>(x_axis);

		for (i = 0; i <= x_axis; i++) {
			c.add(new ArrayList<ArrayList<Object>>(z_axis));

			for (j = 0; j < z_axis; j++) {
				c.get(i).add(new ArrayList<Object>(y_axis));
			}
		}

		return c;}

	/**
	 * Randomly populate the mapped volumetrics with Neurons
	 * @param neuron
	 * @param qty - Quantity of neurons
	 * @param v - Received autonomously from mapping()
	 * @throws IOException 
	 */
	public static void populate(ArrayList<Object> neuron, int qty, double v) throws IOException {
		System.err.println("Populating volume with Neurons...");
		Random rand = new Random();

		int i;
		ArrayList<Object> connections = new ArrayList<>();
		
		for (i = 0; i <= qty; i++) { int m = rand.nextInt((int) v); Training.setIdentifier(m); map.put(m, neuron); 
		
		System.err.print("Original mapping after first generation: " + map.hashCode() + "\n");
		Logger_Writer.Logger_Generic("Original mapping after first generation: " + map.hashCode() + "\n");}
		Simple_Neural_Network.setVolume(map);
		
		for (Entry<Integer, ArrayList<Object>> be : map.entrySet()) {
			System.err.println("Mapped Volume keys: " + be.getKey() + "\tValues: " + be.getValue());
		}
		
		System.err.println("Call to Distribute from cubic mapping to get connections allocated...");
		connections = Distribute.send_synaptic();
		
		System.err.println("Settings connections into simple neural network interface...");
		Simple_Neural_Network.setConnections(connections);
	}

	/**
	 * Maps the cubic index length to the ArrayList c and calls the populate()
	 * autonomously to populate the list and the mapping with the Neurons
	 * 
	 * @param neuron - An Objectified ArrayList comprising the AI and areas / proximities
	 * @param qty - The quantity of Neurons to deploy randomly in your mapped volumetrics
	 * @param n - The index to be used to calculate the cubic size of the volume
	 * @return 
	 * @throws IOException 
	 */
	public static Map<Integer, ArrayList<Object>> mapping(ArrayList<Object> neuron, int qty, int n) throws IOException {
		System.err.println("Mapping out a hash map of " + n + " cubed...");
		int v = (int) Math.pow(n, 3);

		System.err.println("Creating Volume cubic size: " + v + "...");
		Logger_Writer.Logger_Generic("Creating Volume cubic size: " + v + "\n");

		ArrayList<ArrayList<ArrayList<Object>>> c = Cubic_Mapping_4.three_d_list(v);
		System.err.println("Created " + v + " indices in a cubinc Map...");
		
		Cubic_Mapping_4.populate(neuron, qty, v);

		return map;}

	/**
	 * Clear the data in memory store after use.
	 * @throws IOException 
	 */
	public static void clearall() throws IOException {
		Logger_Writer.Logger_Generic("HashMap before clearance: " + map.hashCode() + "\n");
		map.clear();
		c.clear();
	}
}