package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Mapped_volume {
	/**
     * returns the mapped volume of neurons when called
     * @param neuron_qty
     * @param vol
     * @return Map<Integer, Object> mapped_volume
	 * @throws IOException 
     */
    public static Map<Integer, ArrayList<Object>> mapped_volume (int neuron_qty, int vol) throws IOException { return Cubic_Mapping_4.mapping(Neuron.neuron(Training_Set.training_set()), neuron_qty, vol); }
	
}
