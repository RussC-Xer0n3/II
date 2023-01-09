package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Distribute {

	public static ArrayList<Object> send_synaptic (Map<Integer, ArrayList<Object>> volume) throws IOException {
		ArrayList<Object> conns = new ArrayList<>();
		
		conns.addAll(Connections.connections());
		
		return conns;
	}
	
}
