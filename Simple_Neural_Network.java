/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/**
 * PORTED & MODDED FROM
 * 
 * https://medium.com/technology-invention-and-more/how-to-build-a-simple-neural-network-in-9-lines-of-python-code-cc8f23647ca1
 * 
 * The purpose is to put into practice the porting of code into Java Language and
 * to look a little closer into the I/O of Neurological networks in a safe way.
 * Using an existing python test bed as a practice script and adapting 'modding'
 * the code to suite the use case and the program component we are looking at, the 
 * code below is a complete mod from it's predecessor to test and make use of cubic_mapping_4.java
 * a fresh script from volumetric consideration in artificial neurological networks
 * 
 * Check the TODO's
 * 
 * Help from : https://www.javatpoint.com/java-map
 * 			   https://www.baeldung.com/java-multi-dimensional-arraylist
 *             https://www.w3schools.com/java/java_hashmap.asp
 *             https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
 *              
 * @author devel - R.Clarke, Et al.
 */

//TODO: Look into the linking in synaptics and neuron_qty there is an encapsulation issue there.
//TODO: Secure coding, Annotations, full deployment, all the system out, all the out to files, prelim measurements for the pycode, comparables for the code herin, All the logging and feedback to file and system out, CALL TO CONNECTIONS CHECKS TO i/o, TIMERS  


public class Simple_Neural_Network {

    private static int t_qty = 10000;
    private static int neuron_qty = 32;
    private static int vol = 4;
    
    public static int getNeuron_qty() {
		return neuron_qty;
	}

	public static void setNeuron_qty(int neuron_qty) {
		Simple_Neural_Network.neuron_qty = neuron_qty;
	}

	public static int getVol() {
		return vol;
	}

	public static void setVol(int vol) {
		Simple_Neural_Network.vol = vol;
	}

	public static int getT_qty() {
		return t_qty;
	}

	public static void setT_qty(int t_qty) {
		Simple_Neural_Network.t_qty = t_qty;
	}
	
    private static ArrayList<Object> synaptics = new ArrayList<>(Synaptics.synaptics());
    
    public static float getSynaptics() {
    	
    	Random synner  = new Random();
    	
    	int synaptic = synner.nextInt(synaptics.size());
    	
    	float syn = (float) synaptics.get(synaptic);
    	
		return syn;
	}

	static ArrayList<Object> situation = Situation.situation();
    static ArrayList<ArrayList<Object>> connections = new ArrayList<>();
    static ArrayList<Object> neuron = new ArrayList<>();
    
    /**
     * Test a method call from the neurons etc here and print some generic results
     * the particular method is for testbedding and data storage
     */
	@SuppressWarnings("unchecked")
	public static ArrayList<ArrayList<Object>> deploy () throws IOException {
	
		Synaptics.setNeuron(neuron_qty);
		
		Logger_Writer.setSynaptics(synaptics);
		Logger_Writer.setSituation(situation);
		
		Logger_Writer.Logger_Printer(PrinterState.VOID);
		Logger_Writer.Logger_Printer(PrinterState.SYNAP);
		Logger_Writer.Logger_Printer(PrinterState.SITUATION);
		
		Map<Integer, ArrayList<Object>> volume = Mapped_volume.mapped_volume(neuron_qty, vol);
		Logger_Writer.setMapped_volume(volume);
		Logger_Writer.Logger_Printer(PrinterState.MAVOL);
		
		ArrayList<Object> connections = new ArrayList<>(Connections.connections(volume));
		Logger_Writer.setConnectionss(connections);
		Logger_Writer.Logger_Printer(PrinterState.CONN);
		
		ArrayList<ArrayList<Object>> data = new ArrayList<>();

		for (Entry<Integer, ArrayList<Object>> be : volume.entrySet()) {
			System.err.println("Volume Key: " + be.getKey() + " Volume Value: " + be.getValue() + ".\n");
		}

		System.err.print("HashCode : " + volume.hashCode());
		System.err.println("The neuron Matrices are: \n" + volume);
		System.err.println("The Neurological connections are: \n" + connections);

		data.add((ArrayList<Object>) connections);
		data.add((ArrayList<Object>) volume);
		
		System.err.println("Complete data stream from connections and volume mapped: " + data + ".\n");
		
		//Activate the training module in each neuron
		for (Entry<Integer, ArrayList<Object>> activate : volume.entrySet()) {
			ArrayList<Object> neurological = new ArrayList<>(activate.getValue());
			
			for (int a = 0; a <= neurological.size(); a++) {
				neurological.get(0);
				System.err.println("Neuron: " + activate.getKey() + " - Activated!\n");
			}
		}
		
		System.err.println("Activated Neurons.\n");
		return data;}
	
    /**
     * Run the training sets and request a new situation for better optimisations
     * Main method
     * @param args
     * @throws IOException 
     */
    public static void main (String []args) throws IOException {
    	deploy();
        Think.think(situation);
        System.err.println("Considering new situation: " + situation + "\n");}
}