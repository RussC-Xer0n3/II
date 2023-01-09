package javatestfiles;

import java.util.ArrayList;
import java.util.Map;

public class Distribute {

	public static void send_synaptic () {
		int x;
		
		ArrayList<Object> conns = new ArrayList<>(Simple_Neural_Network.getConnections());
		int myID = Training.getIdentifier();
		
		
        for (x = 0; x < Simple_Neural_Network.getConnections().size()-1; x++) {
        	
        }
	}
	
}
