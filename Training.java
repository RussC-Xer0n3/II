package javatestfiles;

import java.util.ArrayList;

public class Training {

	/**
     * Training protocols according to source code which is our nucleus to our neuron
     * The synaptical output into think, is the call to think on the new outputs of the
     * synaptical weights as inputs to other neurons.
     * 
     * @param ArrayList<Object> - Our training set / data set object
     * @param Float synaptic_value - Our initial and subsequent synaptic values as inputs
     * @return 
     */
    public static float training(ArrayList<Object> training_set, float synaptic_value, int t_qty) {
        //TODO: All the logging and feedback to file and system out
    	//TODO: Add timers
    	//TODO: Call to connection checks for I/O

    	Object a, b;
    	int sum = 0;
    	float a_sum = 0;
    	int t, e, u, r, h, k, q;
    	float inputsY, sigdiv, inputsN, inputsA;

        ArrayList<Object> error = new ArrayList<>();
        ArrayList<Object> mplex = new ArrayList<>();
        ArrayList<Object> adjustment = new ArrayList<>();
        ArrayList<Object> loaded = new ArrayList<>(Situation.situation());
        ArrayList<Object> training = new  ArrayList<>(training_set);
        ArrayList<Object> output = Think.think(training);
        ArrayList<Object> sds = new ArrayList<>(Sigmoid_derivative.sigmoid_derivative(output));

        for (t = 0; t <= t_qty; t++) {

            for (e = 0; e < output.size(); e++) {
            	a = loaded.get(e);
            	b = output.get(e);

            	if (a == b) {
            		sum += 1;}}

            error.add(((output.size()-1 - sum) / 100) * output.size()-1);}     

        sum = 0;

        //Get sigmoid derivatives of the errors
        for(q = 0; q < error.size(); q++) {
            inputsY = (float) error.get(q);
            for(r = 0; r < sds.size(); r++) {
            	sigdiv = (float) sds.get(r);
                mplex.add(r, inputsY *= sigdiv);}}

        sds.clear();
        error.clear();

        //Get a dot product of the matrix transposition and the error multiples of the sigmoid derivatives
    	for (h = 0; h <= output.size(); t++) {adjustment.add(Dot.dot(Transpose.transpose(training), mplex));}

    	mplex.clear();

    	//Take the adjustment values and summise them ready for mean average
    	for(k = 0; k < adjustment.size(); k++) {
            inputsN = (float) adjustment.get(k);
            for(u = 0; u < adjustment.size(); u++) {
            	inputsA = inputsN;
            	a_sum += inputsA;}}

    	a_sum /= adjustment.size();

    	//Add the mean average adjustment to the synaptic value
    	synaptic_value += a_sum;

    	a_sum = 0;

        System.out.println("New Synaptics: " + synaptic_value + "\n");

        //TODO: Making a synaptical load and output Axiom to other neurons
        return synaptic_value;}
	
}
