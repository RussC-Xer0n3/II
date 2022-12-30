package javatestfiles;

import java.util.ArrayList;
import java.util.Random;

public class Situation {

	/**
     * Generate a new ArrayList for the situation and insert
     * numbers 0-1 5 times.
     */
    public static ArrayList<Object> situation () {

        ArrayList<Object> situation = new ArrayList<>();

        Random num = new Random();

        for (int y = 0; y <= 5; y++) {
        	int a = num.nextInt(1);
            situation.add(a);}

        return situation;}
	
}
