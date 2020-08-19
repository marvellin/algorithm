//计数排序
package algorithm;

import fileIO.FileIO;

import java.io.File;
import java.util.Arrays;

public class CountSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub

		FileIO.writeArray(array,"countSort.txt");
		int max, min;
		max = min = array[0];
		for (int i = 0; i < array.length; i++){
			if (array[i] < min) min = array[i];
			if (array[i] > max) max = array[i];
		}

		int bias = 0 - min;

		int tmp[] = new int[max-min+1];
		Arrays.fill(tmp, 0);
		for (int i = 0; i < array.length; i++){
			tmp[array[i]+bias]++;
		}

		int index = 0;
		int i = 0;
		while (index < array.length){
			if (tmp[i] != 0){
				array[index] = i - bias;
				tmp[i]--;
				index++;
			} else {
				i++;
			}
		}
		FileIO.writeArray(array,"countSort.txt");
		return array;
	}
}
