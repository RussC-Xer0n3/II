package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;

public class Neuron {

	//public static final ArrayList<Object> neuron = neuron(null);

	/**
     * Thinking if we input the connections to think() as well as the
     * synaptic weights from the sigmoids, we will have inputs as outputs
     * and vise versa, since we need the synapses to receive the output of
     * each neuron to make use of as an input since we are working on a 
     * multi-neuron system which are all interconnected according to proximity
     * 
     * Though there will be dormant neurons if too large a volume (it's fine)
     * We still need all the neurons to talk according to their connectivity. 
	 * @throws IOException 
     */
    public static ArrayList<Object> neuron () throws IOException {

        ArrayList<Object> neuron = new ArrayList<>();
        
        neuron.add(Training.training(Simple_Neural_Network.getSynaptic()));
        neuron.add(Touch.t());
        neuron.add(Green.g());
        neuron.add(Red.r());
        System.err.println(neuron);
        return neuron;}}