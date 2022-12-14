package javatestfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Logger_Writer {
	
	//Set all the variables empty
	private static float time;
	protected static File data_doc;
	private static ArrayList<Object> synaptics;
	private static float adjustment;
	private static ArrayList<Object> errors;
	private static ArrayList<Object> situation;
	private static ArrayList<Object> connectionss;
	private static ArrayList<ArrayList<Object>> connectt;
	private static ArrayList<ArrayList<Object>> connectg;
	private static ArrayList<ArrayList<Object>> connectr;
	private static ArrayList<ArrayList<Object>> training_set;
	private static ArrayList<Object> transpose_after;
	private static ArrayList<Object> transpose_before;
	private static Map<Integer, ArrayList<Object>> mapped_volume;
	private static float synaptic;

	/**
	 * Create the file and check if it is created
	 */
	public static void Logger_Creator() {
		
		String file_name = "data_doc.txt";
		
		try {
			File data_doc = new File(file_name);
		
			if (data_doc.createNewFile()) {
				System.err.println("File " + data_doc.getAbsolutePath() + " " + data_doc.getName() + " created.\n");
			} else if (data_doc.exists()) {
				System.err.println("File " + data_doc.getAbsolutePath() + " " + data_doc.getName() + " exists, nothing done.\n");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		Logger_Checker();
	}
	
	/**
	 * Checks the existence of our data file to be written into
	 * and assess it readability and writeability with a counter
	 * 
	 * @return true is readable and writable else false
	 */
	public static boolean Logger_Checker() {
		
		int count = 0;
		File data_doc = new File("data_doc.txt");
		
		if (data_doc.exists()) {
			
			System.err.println("Can output file : " + data_doc.getName() + " is located in directory: " + data_doc.getAbsolutePath() + ".\n");
			
			if (data_doc.canWrite()) {
				System.err.println("Can write to output file : " + data_doc.getName() + ".\n");
				count += 1;
			} else {
				System.err.println("Cannot write to output file : " + data_doc.getName() + ".\n");
				return false;
			}
			
			if (data_doc.canRead()) {
				System.err.println("Can read from output file : " + data_doc.getName() + ".\n");
				count += 1;
			} else {
				System.err.println("Cannot read from output file : " + data_doc.getName() + ".\n");
				return false;
			}
		}
		
		if (count == 2) {
			return true;
		} else {
			System.err.println("Errors were encountered when trying to access and recreate " + data_doc.getAbsolutePath() + ".\n");
			System.err.println("Read back through error reports.\n");
			return false;
		}
	}

	/**
	 * Print the data from the variables in this class
	 * according to state machine triggers.
	 * 
	 * @param state
	 * @throws IOException 
	 */
	public static void Logger_Printer(PrinterState state) throws IOException {

	    FileWriter stack = new FileWriter("data_doc.txt");
		switch (state) {
			case CONN:
				stack.write("Neural Connections:\n " + Logger_Writer.getConnectionss() + ".\n");
				break;
			case TOUCH:
				stack.write("Touch Proximity Connections:\n " + Logger_Writer.getConnectt() + ".\n");
				break;
			case GREEN:
				stack.write("Green proximity Connections:\n " + Logger_Writer.getConnectg() + ".\n");
				break;
			case RED:
				stack.write("Red proximity Connections:\n " + Logger_Writer.getConnectr() + ".\n");
				break;
			case MAVOL:
				stack.write("The entire mapped volume:\n " + Logger_Writer.getMapped_volume().hashCode() + ".\n");
				break;
			case SYNAP:
				stack.write("Current synaptic:\n" + Logger_Writer.getSynaptic() + "\n");
				break;
			case SYNAPS:
				stack.write("Current synaptics:\n" + Logger_Writer.getSynaptics() + "\n");
				break;
			case TRANSB4:
				stack.write("Data fed in before the transpoition:\n" + Logger_Writer.getTranspose_before() + "\n");
				break;
			case TRANSFTR:
				stack.write("After Transposition of ArrayList:\n" + Logger_Writer.getTranspose_after() + "\n");
				break;
			case SITUATION:
				stack.write("The new situation to be assessed after training: " + Logger_Writer.getSituation() + ".\n");
				break;
			case ADJUSTMENT:
				stack.write("Synaptical adjustments made: " + Logger_Writer.getAdjustment() + "\n");
				break;
			case TRAINSET:
				stack.write("The set to be trained with:\n" + Logger_Writer.getTraining_set() + "\n");
				break;
			case ERRORS:
				stack.write("Errors before computation of synapse:\n" + Logger_Writer.getErrors() + "\n");
				break;
			case TIME:
				stack.write("Time taken (mm.ss.ms) : " + Logger_Writer.getTime() + "\n");
				break;
			default:
				state = PrinterState.VOID;
				stack.write("Neuron quantity: " + Simple_Neural_Network.getNeuron_qty() + "\n");
				stack.write("Training quantity: " + Simple_Neural_Network.getT_qty() + "\n");
				stack.write("Cubic Volume quantity: " + Simple_Neural_Network.getVol() + "\n");
				break;
		}
			stack.close();
	}
	
	public static void Logger_Generic(String message) throws IOException {
			FileWriter stack = new FileWriter("data_doc.txt");
			stack.write(message);
			stack.close();}

	//set the getters and setters
	public static ArrayList<Object> getConnectionss() {
		return connectionss;
	}

	public static void setConnectionss(ArrayList<Object> connectionss) {
		Logger_Writer.connectionss = connectionss;
	}

	public static Map<Integer, ArrayList<Object>> getMapped_volume() {
		return mapped_volume;
	}

	public static void setMapped_volume(Map<Integer, ArrayList<Object>> mapped_volume) {
		Logger_Writer.mapped_volume = mapped_volume;
	}

	public static ArrayList<ArrayList<Object>> getConnectt() {
		return connectt;
	}

	public static void setConnectt(ArrayList<ArrayList<Object>> connectt2) {
		Logger_Writer.connectt = connectt2;
	}

	public static ArrayList<ArrayList<Object>> getConnectg() {
		return connectg;
	}

	public static void setConnectg(ArrayList<ArrayList<Object>> connectt2) {
		Logger_Writer.connectg = connectt2;
	}

	public static ArrayList<ArrayList<Object>> getConnectr() {
		return connectr;
	}

	public static void setConnectr(ArrayList<ArrayList<Object>> connectt2) {
		Logger_Writer.connectr = connectt2;
	}

	public static float getTime() {
		return time;
	}

	public static void setTime(float time) {
		Logger_Writer.time = time;
	}

	public static ArrayList<Object> getSynaptics() {
		return synaptics;
	}

	public static void setSynaptics(ArrayList<Object> synaptics2) {
		Logger_Writer.synaptics = synaptics2;
	}

	public static float getAdjustment() {
		return adjustment;
	}

	public static void setAdjustment(float adjustment) {
		Logger_Writer.adjustment = adjustment;
	}

	public static ArrayList<Object> getErrors() {
		return errors;
	}

	public static void setErrors(ArrayList<Object> errors) {
		Logger_Writer.errors = errors;
	}

	public static ArrayList<Object> getSituation() {
		return situation;
	}

	public static void setSituation(ArrayList<Object> situation) {
		Logger_Writer.situation = situation;
	}

	public static ArrayList<ArrayList<Object>> getTraining_set() {
		return training_set;
	}

	public static void setTraining_set(ArrayList<ArrayList<Object>> training_set) {
		Logger_Writer.training_set = training_set;
	}

	public static ArrayList<Object> getTranspose_after() {
		return transpose_after;
	}

	public static void setTranspose_after(ArrayList<Object> transpose) {
		Logger_Writer.transpose_after = transpose;
	}

	public static ArrayList<Object> getTranspose_before() {
		return transpose_before;
	}

	public static void setTranspose_before(ArrayList<Object> arrayList) {
		Logger_Writer.transpose_before = arrayList;
	}
	
	public static float getSynaptic() {
		return synaptic;
	}

	public static void setSynaptic(float synaptic) {
		Logger_Writer.synaptic = synaptic;
	}
}
