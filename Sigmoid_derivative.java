package javatestfiles;

import java.util.ArrayList;

public class Sigmoid_derivative {
	
	/**
     * The derivative of the sigmoid function per iteration of x
     * @param output
     */
    public static float sigmoid_derivative (ArrayList<Object> output) { 
    	float a = 0;
    	//ArrayList<Object> derivative = new ArrayList<>();

    	for(int i = 0; i <= output.size()-1; i++) {
    		a = (float) output.get(i);}
    	//System.err.println(derivative);
    		return a * (1 - a);
    	}

}
