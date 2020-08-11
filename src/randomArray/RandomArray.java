package randomArray;

import java.util.Random;

public class RandomArray {
	public static final int LENGTH = 20;

	public  static int[] getRandomArray() {
		int [] arr = new int[LENGTH];
		
		for (int i = 0; i < LENGTH; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		return arr;
	}
}
