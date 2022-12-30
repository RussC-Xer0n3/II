package javatestfiles;

import java.util.ArrayList;

public class Think {

	/**
     * rewritten nd ported synaptics for th epurposes of the new model
     * @param in
     */
    public static ArrayList<Object> think (ArrayList<Object> in) {return Sigmoid.sigmoid(Dot.dot(in, Synaptics.synaptics()));}
	
}
