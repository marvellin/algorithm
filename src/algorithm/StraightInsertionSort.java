//直接插入排序
package algorithm;

import fileIO.FileIO;

public class StraightInsertionSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"straightInsertSort.txt");

		for (int i = 1; i < array.length; i++){
			if (array[i] < array[i - 1]){
				int j = i - 1;
				int x = array[i];
//				array[i] = array[i-1];
				while (j >= 0 && x < array[j]){
					array[j+1] = array[j];
					j--;
				}
				array[j+1] = x;
			}
			FileIO.writeArray(array,"straightInsertSort.txt");
		}
		return array;
	}

}
