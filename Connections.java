package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Connections {
	
	public static ArrayList<Object> connections () throws IOException {
		System.err.println("Beginning connection attempts.........");
		
    	ArrayList<Object> connectionss = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectt = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectg = new ArrayList<>();
    	ArrayList<ArrayList<Object>> connectr = new ArrayList<>();
    	Map<Integer, ArrayList<Object>> mapped_volume = new HashMap<>(Simple_Neural_Network.getVolume());
    	System.err.println("Checking mapped volume is present...." + mapped_volume);
    	
    	//before and after to check any modifications
    	Logger_Writer.setMapped_volume(mapped_volume);
    	Logger_Writer.Logger_Printer(PrinterState.MAVOL);
    	
    	System.err.println("Getting scale factor from Scale()...");
    	Map<Integer, Integer> volmap = new HashMap<>(Scale.getVolumeMap());
    	
    	//for n compare to entry set r, g, t and connect accordingly
    	for (Entry<Integer, ArrayList<Object>> bees : mapped_volume.entrySet()) {
    		
    		for (int v = 0; v <= mapped_volume.size()-1; v++) {
    			
    			if (bees.getValue() != null) {
    				
    				for (Entry<Integer, Integer> hive : volmap.entrySet()) {
    				
    					if(hive.getKey() == bees.getValue().get(1)) {
    						System.err.println("Adding connection in touch proximity of neuron...");
        					connectt.add(new ArrayList<Object>(hive.getKey()));
        					System.err.println("Data added from hive: " + connectt);
        					
        					System.err.println(connectt);
        					Logger_Writer.setConnectt(connectt);
        					Logger_Writer.Logger_Printer(PrinterState.TOUCH);

    					} else if (hive.getKey() == bees.getValue().get(2)) {
    						System.err.println("Adding connection in green proximity of neuron...");
        					connectg.add(new ArrayList<Object>(hive.getKey()));
        					System.err.println("Data added from hive: " + connectg);
        					
        					System.err.println(connectg);
        					Logger_Writer.setConnectg(connectg);
        					Logger_Writer.Logger_Printer(PrinterState.GREEN);
        					
    					} else if (bees.getValue().get(3) == hive.getKey()) {
    						System.err.println("Adding connection in red proximity of neuron...");
        					connectr.add(new ArrayList<Object>(hive.getKey()));
        					System.err.println("Data added from hive: " + connectr);
        					System.err.println(connectr);
        					Logger_Writer.setConnectr(connectt);
        					Logger_Writer.Logger_Printer(PrinterState.RED);
    					}
    				}
    				
    			} else {
    				continue;
    			}
    			System.err.println("Storing lists to connections");
    			connectionss.addAll(connectt);
    			connectionss.addAll(connectg);
    			connectionss.addAll(connectr);
			}
    		Simple_Neural_Network.setConnections(connectionss);
    		System.err.println("Connections are: " + connectionss);
    		Logger_Writer.setConnectionss(connectionss);
    		Logger_Writer.Logger_Printer(PrinterState.CONN);
    	}
    	
        /**Else try for the entry set if any of n are within the r, g, t of any other n primm connect?
    	for (Entry<Integer, ArrayList<Object>> de : mapped_volume.entrySet()) {
    		
    	}*/
    	Logger_Writer.setMapped_volume(mapped_volume);
    	Logger_Writer.Logger_Printer(PrinterState.MAVOL);

    	return connectionss;}
}
