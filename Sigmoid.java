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

    	for(int i = 0; i <= x.size(); i++) {
    		float a = (float) x.get(i);
    		adjusted.add(1 / (1 * (-a)));}

    	return adjusted;}
	
}
