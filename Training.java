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

    	int a = 0;
    	float b = 0;
    	float sum = 0;
    	float a_sum = 0;
    	int t, e, u, r, h, k, q, x;
    	float inputsY, sigdiv, inputsN, inputsA;
    	int t_qty = Simple_Neural_Network.getT_qty();
    	
    	float synaptics = synaptic;
    	
    	if (synaptics == 0) {
    		synaptics = Simple_Neural_Network.getSynaptic();
    	}
    	
    	System.err.println("Synaptic value is" + synaptics);

        ArrayList<Object> error = new ArrayList<>();
        ArrayList<Object> mplex = new ArrayList<>();
        ArrayList<Object> adjustment = new ArrayList<>();
        ArrayList<Object> loaded = new ArrayList<>(Situation.situation());
        System.err.println("New Situation: " + loaded);
        ArrayList<Object> training = new  ArrayList<>(Training_Set.training_set());
        System.err.println("Training set: " + training);
        ArrayList<Object> output = Think.think(training);
        System.err.println("Output from sigmoid of the dot product of our training set and Auto generated Synaptics: " + output);
        float sds = Sigmoid_derivative.sigmoid_derivative(output);
        System.err.println("Sigmoid derivatives are of our Output are: " + sds);
        
        System.err.println("Assessing the error margins of synaptic input from the received synaptic value...");
        Logger_Writer.Logger_Generic("Beginning to assess the nucleus output in the think method: " + synaptic + "\n");
        for (t = 0; t <= t_qty; t++) {
        	//here is where we get the think() to consider the float synaptic value as it changes
            for (e = 0; e < loaded.size()-1; e++) {
            	for (int hh = 0; hh <= output.size()-1; hh++) {
            		a = (int) loaded.get(e);
            		b = (float) output.get(hh);

            	}
            	sum = a - b;
            	error.add(sum);
    		}
            
        float erro = 0;
        for (int err = 0; err <= error.size()-1; err++) {
        	erro += (float) error.get(err);
        }
        float err = erro / error.size();
        Logger_Writer.setErrors(error);
        Logger_Writer.Logger_Printer(PrinterState.ERRORS);
        System.err.println("Errors are: " + err);

        System.err.println("Gathering the sigmoid derivatives of our errors...");
        //Get sigmoid derivatives of the errors
        for(q = 0; q < error.size()-1; q++) {
            inputsY = (float) error.get(q);
            for(r = 0; r < q; r++) {
            	sigdiv = sds;
            	float m = inputsY *= sigdiv;
            	if (m == 0.0) {
            		m = 1;
            	} else if (m == -0.0) {
            		m = -1;
            	}
                mplex.add(m);}}
        float adj = err / sds;
        System.err.println("Surmising the sigmoid derivatives and getting a mean average");
        float sumun = 0;
        for (int y = 0; y <= mplex.size()-1; y++) {
        	float dd = (float) mplex.get(y);
        	sumun += dd;
        }
        sumun /= mplex.size()-1;
        mplex.clear();
        mplex.add((float) sumun);
        
        System.err.println("The Mean average sigmoid derivative is: " + mplex);
        
        System.err.println("Getting a dot product of mean average of sigoid derivatives and a transposition of our training data...");
        //Get a dot product of the matrix transposition and the error multiples of the sigmoid derivatives
        ArrayList<Object> m = new ArrayList<>(Dot.dot(mplex, Transpose.transpose(training)));
        
        System.err.println("Adding the adjustments required to update our synaptic value...");
        System.err.println("Adding: " + adjustment.add(adj));

        System.err.println("Surmising the adjustments to get a mean average...");
    	//Take the adjustment values and surmise them ready for mean average
    	for(k = 0; k <= adjustment.size()-1; k++) {
    		a_sum += adjustment.indexOf(k);}

    	System.err.println("The surmised values of the adjustments are: " + a_sum);
    	Logger_Writer.setAdjustment(a_sum);
        Logger_Writer.Logger_Printer(PrinterState.ADJUSTMENT);
        
        a_sum /= adjustment.size();
        System.err.println("The mean average adjustment required is: " + a_sum);
    	Logger_Writer.Logger_Generic("The adjustment sum after adjustment is: " + a_sum);
    	Logger_Writer.setAdjustment(a_sum);
        Logger_Writer.Logger_Printer(PrinterState.ADJUSTMENT);

        System.err.println("Aadding the adjustment to the synaptic value...");
    	//Add the mean average adjustment to the synaptic value
    	synaptics += a_sum;
    	
    	System.err.println("New Synaptic Value is: " + synaptics);

    	a_sum = 0;
    	
    	Logger_Writer.setSynaptic(synaptics);
    	Logger_Writer.Logger_Generic("Final synaptic output  from nucleus is: " + synaptics + "\n");
        System.err.println("Final synaptic output  from nucleus is: " + synaptics);
        Logger_Writer.Logger_Printer(PrinterState.SYNAP);
        }
        //Get current ID in the indices
        int myID = identifier;
        
        ArrayList<Object> c = new ArrayList<>(Simple_Neural_Network.getConnections());
        
        for (x = 0; x <= c.size()-1; x++) {
        	while (c.contains(myID) && x == myID) {        		
        		return synaptics;
        	}
        }
		return synaptics;
    }
	
}
