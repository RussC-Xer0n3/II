package javatestfiles;

import java.util.ArrayList;

public class Transpose {

	/**
     * Transpose method from : https://www.javatpoint.com/java-program-to-transpose-matrix
     * 						   https://stackoverflow.com/questions/28057683/transpose-arraylistarrayliststring-in-java
     * MODDED
     * 						
     * @param arrayList
     */
    public static ArrayList<Object> transpose (ArrayList<Object> arrayList) {
        
        int i, j;

        ArrayList<Object> transpose = new ArrayList<>();

        int count = arrayList.size();
        
        for (i = 0; i < count; i++) {

        	ArrayList<Object> temp = new ArrayList<>();
        	temp.add(arrayList.get(i));

            for (j = 0; j < temp.size(); j++) {
                ArrayList<Object> transpose_row = new ArrayList<>();
                transpose_row.add(temp.get(i));
                transpose.set(j, transpose_row.get(0));
                transpose_row.clear();}}

        return transpose;}
	
}
