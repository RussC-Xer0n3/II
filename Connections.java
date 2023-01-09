package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Connections {
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Object> connections () throws IOException {
    	ArrayList<Object> n = new ArrayList<>();
    	ArrayList<Object> connectionss = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectt = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectg = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectr = new ArrayList<>();
    	Map<Integer, ArrayList<Object>> mapped_volume = new HashMap<>(Simple_Neural_Network.getVolume());
    	
    	//before and after to check any modifications
    	System.err.println("Before: " + mapped_volume.hashCode());
    	Logger_Writer.setMapped_volume(mapped_volume);
    	Logger_Writer.Logger_Printer(PrinterState.MAVOL);
    	
    	for (Entry<Integer, ArrayList<Object>> me : mapped_volume.entrySet()) {
    		if (me.getValue() == null) {
    			n.add(me.getValue());
    		}
    	}
    	
    	Map<Integer, Integer> volmap = new HashMap<>(Scale.getVolumeMap());
    	
    	//for n compare to entry set r, g, t and connect accordingly
    	for (Entry<Integer, ArrayList<Object>> bees : mapped_volume.entrySet()) {
    		
    		for (int v = 0; v <= n.size()-1; v++) {
    			
    			if (bees.getValue() != null) {
    				
    				for (Entry<Integer, Integer> hive : volmap.entrySet()) {
    				
    					if(hive.getKey() == bees.getValue().get(1)) {
    						ArrayList<ArrayList<Object>> value = new ArrayList<>();

        					connectt.add(new ArrayList<Object>(bees.getKey()));
        					value.add(n);
        					value.addAll(connectt);
        					connectionss.addAll(value);
        					System.err.println(connectt);
        					Logger_Writer.setConnectt(connectt);
        					Logger_Writer.Logger_Printer(PrinterState.TOUCH);

    					} else if (hive.getKey() == bees.getValue().get(2)) {
    						ArrayList<ArrayList<Object>> value2 = new ArrayList<>();
        					
        					connectg.add(new ArrayList<Object>(bees.getKey()));
        					value2.add(n);
        					value2.addAll(connectg);
        					connectionss.addAll(value2);
        					System.err.println(connectg);
        					Logger_Writer.setConnectg(connectg);
        					Logger_Writer.Logger_Printer(PrinterState.GREEN);
        					
    					} else if (hive.getKey() == bees.getValue().get(3)) {
    						ArrayList<ArrayList<Object>> value3 = new ArrayList<>();
        					
        					connectr.add(new ArrayList<Object>(bees.getKey()));
        					value3.add(n);
        					value3.addAll(connectr);
        					connectionss.addAll(value3);
        					System.err.println(connectr);
        					Logger_Writer.setConnectr(connectt);
        					Logger_Writer.Logger_Printer(PrinterState.RED);
    					}
    				}
    				
    			} else {
    				continue;
    			}
			}
    		Simple_Neural_Network.setConnections(connectionss);
    		System.err.println(connectionss);
    		Logger_Writer.setConnectionss(connectionss);
    		Logger_Writer.Logger_Printer(PrinterState.CONN);
    	}
    	
        /**Else try for the entry set if any of n are within the r, g, t of any other n primm connect?
    	for (Entry<Integer, ArrayList<Object>> de : mapped_volume.entrySet()) {
    		
    	}*/
    	
    	System.err.println("After: " + mapped_volume.hashCode());
    	Logger_Writer.setMapped_volume(mapped_volume);
    	Logger_Writer.Logger_Printer(PrinterState.MAVOL);

    	return connectionss;}
}
