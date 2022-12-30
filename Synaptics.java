package javatestfiles;

import java.util.ArrayList;
import java.util.Random;

public class Synaptics {

	private static int neuron_qty = 32;
	
	public int getNeuron() {
		return neuron_qty;
	}

	public int setNeuron(int neurons) {
		return neuron_qty = neurons;
	}

	/**
     * A very quick rewrite of the synaptic_weights call in the source
     * We need to generate a single synaptic value to be assigned to each neuron
     * nucleus as opposed to each connection since we are unaware initially of 
     * the quantity of connections within the three dimensional space between each neuron
     * 
     * Thus we simply add the synaptic weights to the nucleus and when they reach an optimum
     * the nucleus updates it's value to the surrounding neurons. In theory.
     * 
     * @return float synaptic - A starting value to be updated later
     */
    public static ArrayList<Object> synaptics () {

        float max = (float) 1.0;
        float min = (float) -1.0;
        
        Synaptics syn = new Synaptics();
        
        int n = syn.getNeuron();

        Random rand_neuron = new Random();

        rand_neuron.setSeed((long) 0.47562549720928529);

        ArrayList<Object> synaptics = new ArrayList<>();

        for (int y = 0; y <= n; y++) {synaptics.add(2 * rand_neuron.nextFloat(min) - max);}

        System.out.println("Weights: " + synaptics + "\n");

        return synaptics;}
	
}
