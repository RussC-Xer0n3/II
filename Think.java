package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;

public class Think {

	/**
     * rewritten nd ported synaptics for th epurposes of the new model
     * @param in
	 * @throws IOException 
     */
    public static ArrayList<Object> think (ArrayList<Object> in) throws IOException {return Sigmoid.sigmoid(Dot.dot(in, Synaptics.synaptics()));}
	
}
