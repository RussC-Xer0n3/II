package javatestfiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
	 */
	public static void populate(ArrayList<Object> neuron, int qty, double v) {
		Random rand = new Random();

		int i;

		for (i = 0; i <= qty; i++) { int m = rand.nextInt((int) v); Training.setIdentifier(m); map.put(m, neuron); 
		
		System.err.print("Original mapping after first generation: " + map.hashCode());
		Logger_Writer.Logger_Generic("Original mapping after first generation: " + map.hashCode());}}

	/**
	 * Maps the cubic index length to the ArrayList c and calls the populate()
	 * autonomously to populate the list and the mapping with the Neurons
	 * 
	 * @param neuron - An Objectified ArrayList comprising the AI and areas / proximities
	 * @param qty - The quantity of Neurons to deploy randomly in your mapped volumetrics
	 * @param n - The index to be used to calculate the cubic size of the volume
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public static Map<Integer, ArrayList<Object>> mapping(ArrayList<Object> neuron, int qty, int n) {
		int j, k, l, i;

		double v = Math.pow(n, 3);

		ArrayList<ArrayList<ArrayList<Object>>> c = three_d_list(n);

		System.err.println("Creating Neuron of quantity: " + qty + "\nCreating Volume cubic size: " + n + "\n");
		Logger_Writer.Logger_Generic("Creating Neuron of quantity: " + qty + "\nCreating Volume cubic size: " + n + "\n");
		
		for (j = 0; j < n; j++) {
			for (k = 0; k < n; k++) {
				for(l = 0; l < n; l++) {
					c.get(j).get(k).add(l);
					for (i = 0; i < v; i++) {
						map.put(i, (ArrayList<Object>) c.get(j).get(k).get(l));
					}}}}

		populate(neuron, qty, v);

		return map;}

	/**
	 * Clear the data in memory store after use.
	 */
	public static void clearall() {
		System.err.println("HashMap before clearance: " + map.hashCode() + "\n");
		Logger_Writer.Logger_Generic("HashMap before clearance: " + map.hashCode() + "\n");
		map.clear();
		c.clear();
	}

	public static Map<Integer, ArrayList<Object>> main(String[] args) { return map; }
}