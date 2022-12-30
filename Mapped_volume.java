package javatestfiles;

import java.util.ArrayList;
import java.util.Map;

public class Mapped_volume {
	/**
     * returns the mapped volume of neurons when called
     * @param neuron_qty
     * @param vol
     * @return Map<Integer, Object> mapped_volume
     */
    public static Map<Integer, ArrayList<Object>> mapped_volume (int neuron_qty, int vol) { return Cubic_Mapping_4.mapping(Neuron.neuron, neuron_qty, vol);}
	
}
