package javatestfiles;

import java.util.ArrayList;

public class Sigmoid {

	/**
     * The sigmoid function required for weight adjustments
     * and outputs the adjustments to an ArrayList
     * @param 
     */
    public static ArrayList<Object> sigmoid (ArrayList<Object> x) { 
    	ArrayList<Object> adjusted = new ArrayList<>();
    	
    	System.err.println("The Value assigned to sigmoid is: " + x);
    	
    	for(int i = 0; i <= x.size()-1; i++) {
    		int a = (Integer) x.get(i);
    		if (a == 0) {
    			a = 1;
    		}
    		adjusted.add(1 / (1 * (-a)));}
    	
    	System.err.println("Adjusted Sigmoid:" + adjusted);
    	return adjusted;}
	
}
