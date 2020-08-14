//简单选择排序
package algorithm;

import fileIO.FileIO;

public class SimpleSelectionSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"simpleSelectionSort.txt");
		int key, tmp;
		for (int i = 0; i < array.length; i++){
			key = getMinKey(array, i);
			if (key != i){
				tmp = array[i];
				array[i] = array[key];
				array[key] = tmp;
				FileIO.writeArray(array,"simpleSelectionSort.txt");
			}
		}
		return null;
	}

	/*
	* 获取start下标以后序列的最小值，并返回该最小值小标
	* */
	private int getMinKey(int[] array, int start){
		int result = start;
		for (int i = start + 1; i < array.length; i++){
			if (array[result] > array[i]){
				result = i;
			}
		}
		return result;
	}
}
