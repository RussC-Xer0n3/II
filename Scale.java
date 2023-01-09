package javatestfiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Scale {

	static Map<Integer, ArrayList<Object>> map = new HashMap<>(Simple_Neural_Network.getVolume());
	static int scale = Simple_Neural_Network.getVol();
	private final static int X = scale;
	private final static int Y = scale;
	private final static int Z = scale;
	private final static int V = X*Y*Z;
	private static final Map<Integer, Integer> volume_map = new HashMap<>(V);
	
	public static Map<Integer, Integer> volmap() {
		
		for (Entry<Integer, ArrayList<Object>> bees : map.entrySet()) {
			volume_map.put(bees.getKey(), bees.getKey());
		}
		
		return volume_map;
	}
	
	public static Map<Integer, Integer> getVolumeMap() {
		return volume_map;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public int getZ() {
		return Z;
	}
	public int getV() {
		return V;
	}
	
}
