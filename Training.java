package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;

public class Training {

	private static int identifier = 0;
	
	public static int getIdentifier() {
		return identifier;
	}
	
	public static int setIdentifier(int id) {
		return identifier = id;
	}

	/**
     * Training protocols according to source code which is our nucleus to our neuron
     * The synaptical output into think, is the call to think on the new outputs of the
     * synaptical weights as inputs to other neurons.
     * 
     * @param ArrayList<Object> - Our training set / data set object
     * @param Float synaptic_value - Our initial and subsequent synaptic values as inputs
     * @throws IOException 
     */
    @SuppressWarnings("unused")
	public float training(float synaptic) throws IOException {
    	System.err.println("Training hit");
    	//TODO: Add timers
    	//TODO: Call to connection checks for I/O

    	int a, b;
    	int sum = 0;
    	float a_sum = 0;
    	int t, e, u, r, h, k, q, x;
    	float inputsY, sigdiv, inputsN, inputsA;
    	int t_qty = Simple_Neural_Network.getT_qty();
    	
    	float synaptics = synaptic;
    	
    	if (synaptics == 0) {
    		synaptics = Simple_Neural_Network.getSynaptic();
    	}
    	
    	System.err.println("Synaptic is" + synaptics);

        ArrayList<Object> error = new ArrayList<>();
        ArrayList<Object> mplex = new ArrayList<>();
        ArrayList<Object> adjustment = new ArrayList<>();
        ArrayList<Object> loaded = new ArrayList<>(Situation.situation());
        System.err.println("Loaded: " + loaded);
        ArrayList<Object> training = new  ArrayList<>(Training_Set.training_set());
        System.err.println("Training set: " + training);
        ArrayList<Object> output = Think.think(training);
        System.err.println("Output from think: " + output);
        ArrayList<Object> sds = new ArrayList<>(Sigmoid_derivative.sigmoid_derivative(output));
        System.err.println("Sigmoid derivatives are: " + sds);
        
        for (t = 0; t <= t_qty; t++) {
        	//here is where we get the think() to consider the float synaptic value as it changes
        	Logger_Writer.Logger_Generic("Beginning to assess the nucleus output in the think method: " + synaptic + "\n");
            for (e = 0; e < output.size()-1; e++) {
            	for (int hh = 0; hh <= loaded.size()-1; hh++) {
            		a = (int) loaded.get(hh);
            		b = (int) output.get(e);

	            	if (a == b) {
	            		sum += 1;}}
	            	}
            error.add(((output.size()-1 - sum) / 100) * output.size()-1);
            Logger_Writer.setErrors(error);
            Logger_Writer.Logger_Printer(PrinterState.ERRORS);}     
        System.err.println("Sum of errors is:" + sum);
        sum = 0;

        //Get sigmoid derivatives of the errors
        for(q = 0; q < error.size()-1; q++) {
            inputsY = (Integer) error.get(q);
            for(r = 0; r < sds.size()-1; r++) {
            	sigdiv = (Integer) sds.get(r);
            	double m = inputsY *= sigdiv;
            	if (m == 0.0) {
            		m = 1;
            	} else if (m == -0.0) {
            		m = -1;
            	}
                mplex.add(m);}}
        //surmise them
        double sumun = 0.0;
        for (int y = 0; y <= mplex.size()-1; y++) {
        	double un = (Double) mplex.get(y);
        	sumun += un;
        }
        sumun /= mplex.size()-1;
        mplex.clear();
        mplex.add(sumun);
        
        System.err.println("sig div: " + sds);
        System.err.println("mplex of sig div" + mplex);
        Logger_Writer.Logger_Generic("The sigmoid derivatives are: " + sds + "\n");
        
        
        //Get a dot product of the matrix transposition and the error multiples of the sigmoid derivatives
        ArrayList<Object> m = new ArrayList<>(Dot.dot(mplex, Transpose.transpose(training)));
    	adjustment.add(m);

    	System.err.println("The multiples of the errors to sigmoid derivatives are: " + mplex);
    	Logger_Writer.Logger_Generic("The multiples of the errors to sigmoid derivatives are: " + mplex + "\n");

    	//Take the adjustment values and surmise them ready for mean average
    	for(k = 0; k <= adjustment.size()-1; k++) {
    		a_sum += adjustment.indexOf(k);}

    	Logger_Writer.Logger_Generic("The adjustment sum before adjustment is: " + a_sum);
    	Logger_Writer.setAdjustment(a_sum);
        Logger_Writer.Logger_Printer(PrinterState.ADJUSTMENT);
        
    	a_sum /= adjustment.size();
    	System.err.println("The adjustment sum after adjustment is: " + a_sum);
    	Logger_Writer.Logger_Generic("The adjustment sum after adjustment is: " + a_sum);
    	Logger_Writer.setAdjustment(a_sum);
        Logger_Writer.Logger_Printer(PrinterState.ADJUSTMENT);

    	//Add the mean average adjustment to the synaptic value
    	synaptic += a_sum;

    	a_sum = 0;
    	
    	Logger_Writer.setSynaptic(synaptic);
    	Logger_Writer.Logger_Generic("Final synaptic output  from nucleus is: " + synaptic + "\n");
        System.err.println("New Synaptics: " + synaptic);
        Logger_Writer.Logger_Printer(PrinterState.SYNAP);
        
        //Get current ID in the indices
        int myID = identifier;
        
        Distribute.send_synaptic();
        
        return synaptic;
    }
	
}
