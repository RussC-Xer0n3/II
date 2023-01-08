package javatestfiles;

import java.util.ArrayList;
import java.util.ListIterator;

public class Dot {

	/**
     * Perform the dot matrix operation on the I/O similar to .T in python
     * @param in
     * @param out
     */
    //https://stackoverflow.com/questions/40434418/how-to-make-my-dot-product-method-in-java-faster-or-more-efficient#:~:text=I%20have%20a%20small%20Java%20method%20that%20is,%5Bi%5D%3B%20%7D%20outputs%20%5Bj%5D%20%3D%20sum%3B%20%7D%20%7D
    
    public static ArrayList<Object> dot (ArrayList<Object> in, ArrayList<Object> out) {
    	System.err.println("Dot Product Hit");
    	ArrayList<Object> outputs = new ArrayList<>();

    	ListIterator<Object> itn = in.listIterator();
    	System.err.println("In: " + in);
    	ListIterator<Object> ito = out.listIterator();
    	System.err.println("Out: " + out);
    	
    	float e = 0;
    	
    	for (int r = 0; r <= out.size()-1; r++) {
    		float d = (float) out.get(r);
    		e = e + d;
    	}
    	
    	float sum = e / out.size();
    	
    	for(int r = 0; r <= in.size()-1; r++) {
	    		float z = sum;
	    		int o = (Integer) in.get(r);
	    		outputs.add(o *= z);
	    }
    	
    	System.err.println("DotProd Outputs: " + outputs);
        return outputs;
    }}
