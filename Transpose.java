package javatestfiles;

import java.io.IOException;
import java.util.ArrayList;

public class Transpose {

	/**
     * Transpose method from : https://www.javatpoint.com/java-program-to-transpose-matrix
     * 						   https://stackoverflow.com/questions/28057683/transpose-arraylistarrayliststring-in-java
     * MODDED
     * 						
     * @param arrayList
	 * @throws IOException 
     */
    public static ArrayList<Object> transpose (ArrayList<Object> arrayList) throws IOException {
        
        int i, j;

        Logger_Writer.setTranspose_before(arrayList);
        Logger_Writer.Logger_Printer(PrinterState.TRANSB4);
        
        ArrayList<Object> transpose = new ArrayList<>();

        int count = arrayList.size();
        
        for (i = 0; i < count; i++) {

        	ArrayList<Object> temp = new ArrayList<>();
        	temp.add(arrayList.get(i));

            for (j = 0; j < temp.size()-1; j++) {
                ArrayList<Object> transpose_row = new ArrayList<>();
                transpose_row.add(temp.get(i));
                transpose.set(j, transpose_row.get(0));
                transpose_row.clear();}}

        Logger_Writer.setTranspose_after(transpose);
        Logger_Writer.Logger_Printer(PrinterState.TRANSFTR);
        
        return transpose;}
	
}
