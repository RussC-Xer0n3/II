package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Distribute {

	public static ArrayList<Object> send_synaptic () throws IOException {
		System.err.println("Call to connections method from distribute...");
		ArrayList<Object> conns = new ArrayList<>();
		
		conns.addAll(Connections.connections());
		
		return conns;
	}
	
}
