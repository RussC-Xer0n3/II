package javatestfiles;

import java.util.ArrayList;

public class Sigmoid_derivative {
	
	/**
     * The derivative of the sigmoid function per iteration of x
     * @param output
     */
    public static ArrayList<Object> sigmoid_derivative (ArrayList<Object> output) { 

    	ArrayList<Object> derivative = new ArrayList<>();

    	for(int i = 0; i <= output.size()-1; i++) {
    		int a = (int) output.get(i);
    		derivative.add(a * (1 - a));}
    	System.err.println(derivative);
    	return derivative;}

}
