//简单选择排序
package algorithm;

import fileIO.FileIO;

import java.io.File;

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
		return array;
	}

	public int[] improvedSolution(int[] array){
		FileIO.writeArray(array,"improvedSelectionSort.txt");
		int i, j, tmp, min, max;
		boolean chgFlag = false;
		for (i = 0; i < array.length / 2; i++){
			min = max = i;
			chgFlag = false;
			for (j = i + 1; j <= array.length-1-i; j++){
				/*
				* 分别记录下标i之后最大和最小值
				* */
				if (array[j] > array[max]){
					max = j;
					continue;
				}
				if (array[j] < array[min]){
					min = j;
				}
			}

			/*
			* 针对不同情况进行交换操作，提高效率
			* */
			if (min != i){
				tmp = array[min];
				array[min] = array[i];
				array[i] = tmp;
				chgFlag = true;
			}
			if (min == array.length-1-i && max == i){
				continue;
			}
			if (max == i){
				max = min;
			}
			if (max != array.length-1-i){
				tmp = array[max];
				array[max] = array[array.length-1-i];
				array[array.length-1-i] = tmp;
				chgFlag = true;
			}
			if(chgFlag) {
				FileIO.writeArray(array,"improvedSelectionSort.txt");
			}
		}
		return array;
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
