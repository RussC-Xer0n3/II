package javatestfiles;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class Connections {

	@SuppressWarnings("unchecked")
	public static ArrayList<Object> connections (Map<Integer, ArrayList<Object>> mapped_volume) {
    	ArrayList<Object> n = new ArrayList<>();
    	ArrayList<Object> connectionss = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectt = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectg = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectr = new ArrayList<>();

    	//before and after to check any modifications
    	System.out.println(mapped_volume.hashCode());

    	for (Entry<Integer, ArrayList<Object>> me : mapped_volume.entrySet()) {
    		if (me.getValue() == Neuron.neuron) {
    			n.add(me.getValue());
    		}
    	}

    	//for n compare to entry set r, g, t and connect accordingly
    	for (Entry<Integer, ArrayList<Object>> be : mapped_volume.entrySet()) {
    		
    		while (be.getValue() == Neuron.neuron) {
    			
    			for (int v = 0; v <= n.size(); v++) {
    				
    				if (((ArrayList<Object>) n.get(1)).contains(be.getValue())) {
    					ArrayList<ArrayList<Object>> value = new ArrayList<>();

    					connectt.add(new ArrayList<Object>(be.getValue()));
    					
    					//build a collection on one value from n and set
    					value.add(n);
    					value.addAll(connectt);
    					
    					//add
    					connectionss.addAll(value);
    					
    					//clear
    					connectt.clear();
    					value.clear();
    					
    				} else if (((ArrayList<Object>) n.get(2)).contains(be.getValue())) {
    					ArrayList<ArrayList<Object>> value2 = new ArrayList<>();
    					
    					connectg.add(new ArrayList<Object>(be.getValue()));
    					value2.add(n);
    					value2.addAll(connectg);
    					connectionss.addAll(value2);
    					connectg.clear();
    					value2.clear();
    					
    				} else if (((ArrayList<Object>) n.get(3)).contains(be.getValue())){
    					ArrayList<ArrayList<Object>> value3 = new ArrayList<>();
    					
    					connectr.add(new ArrayList<Object>(be.getValue()));
    					value3.add(n);
    					value3.addAll(connectr);
    					connectionss.addAll(value3);
    					connectr.clear();
    					value3.clear();
    				}
    			}
    		}
    		System.out.println(connectionss);
    	}
    	
        /**Else try for the entry set if any of n are within the r, g, t of any other n primm connect?
    	for (Entry<Integer, ArrayList<Object>> de : mapped_volume.entrySet()) {
    		
    	}*/
    	
    	System.out.println(mapped_volume.hashCode());

    	return connectionss;}

	
}