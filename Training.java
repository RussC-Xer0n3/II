package javatestfiles;

import java.io.IOException;
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
	 * @throws IOException 
     */
    public static float training(float synaptic) throws IOException {
    	//TODO: Add timers
    	//TODO: Call to connection checks for I/O

    	Object a, b;
    	int sum = 0;
    	float a_sum = 0;
    	int t, e, u, r, h, k, q;
    	float inputsY, sigdiv, inputsN, inputsA;
    	int t_qty = Simple_Neural_Network.getT_qty();
    	
    	float synaptics = synaptic;
    	
    	if (synaptics == 0) {
    		synaptics = Simple_Neural_Network.getSynaptic();
    	}

        ArrayList<Object> error = new ArrayList<>();
        ArrayList<Object> mplex = new ArrayList<>();
        ArrayList<Object> adjustment = new ArrayList<>();
        ArrayList<Object> loaded = new ArrayList<>(Situation.situation());
        ArrayList<Object> training = new  ArrayList<>(Training_Set.training_set());
        ArrayList<Object> output = Think.think(training);
        ArrayList<Object> sds = new ArrayList<>(Sigmoid_derivative.sigmoid_derivative(output));

        for (t = 0; t <= t_qty; t++) {
        	//here is where we get the think() to consider the float synaptic value as it changes
        	Logger_Writer.Logger_Generic("Beginning to assess the nucleus output in the think method: " + synaptic + "\n");
            for (e = 0; e < output.size(); e++) {
            	a = loaded.get(e);
            	b = output.get(e);

            	if (a == b) {
            		sum += 1;}}

            error.add(((output.size()-1 - sum) / 100) * output.size()-1);
            Logger_Writer.setErrors(error);
            Logger_Writer.Logger_Printer(PrinterState.ERRORS);}     

        sum = 0;

        //Get sigmoid derivatives of the errors
        for(q = 0; q < error.size(); q++) {
            inputsY = (float) error.get(q);
            for(r = 0; r < sds.size(); r++) {
            	sigdiv = (float) sds.get(r);
                mplex.add(r, inputsY *= sigdiv);}}
        
        Logger_Writer.Logger_Generic("The sigmoid derivatives are: " + sds + "\n");
        sds.clear();
        error.clear();

        //Get a dot product of the matrix transposition and the error multiples of the sigmoid derivatives
    	for (h = 0; h <= output.size(); t++) {adjustment.add(Dot.dot(Transpose.transpose(training), mplex));}

    	Logger_Writer.Logger_Generic("The multiples of the errors to sigmoid derivatives are: " + mplex + "\n");
    	mplex.clear();

    	//Take the adjustment values and summise them ready for mean average
    	for(k = 0; k < adjustment.size(); k++) {
            inputsN = (float) adjustment.get(k);
            for(u = 0; u < adjustment.size(); u++) {
            	inputsA = inputsN;
            	a_sum += inputsA;}}

    	Logger_Writer.Logger_Generic("The adjustment sum before adjustment is: " + a_sum);
    	Logger_Writer.setAdjustment(a_sum);
        Logger_Writer.Logger_Printer(PrinterState.ADJUSTMENT);
        
    	a_sum /= adjustment.size();
    	Logger_Writer.Logger_Generic("The adjustment sum after adjustment is: " + a_sum);
    	Logger_Writer.setAdjustment(a_sum);
        Logger_Writer.Logger_Printer(PrinterState.ADJUSTMENT);

    	//Add the mean average adjustment to the synaptic value
    	synaptic += a_sum;

    	a_sum = 0;
    	
    	Logger_Writer.setSynaptic(synaptic);
    	Logger_Writer.Logger_Generic("Final synaptic output  from nucleus is: " + synaptic + "\n");
        System.err.println("New Synaptics: " + synaptic + "\n");
        Logger_Writer.Logger_Printer(PrinterState.SYNAP);

        //TODO: Making a synaptical load and output Axiom to other neurons
        return synaptic;}
	
}
