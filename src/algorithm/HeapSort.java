//堆排序
package algorithm;

import fileIO.FileIO;

import java.io.File;

public class HeapSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"heapSort.txt");
		buildTree(array);
		for (int i = array.length - 1; i >= 0; i--){
			FileIO.writeArray(array,"heapSort.txt");
			swap(array, i, 0);
			heapAdjust(array, i, 0);
		}
		return null;
	}

	private void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	/*
	* 初始化建堆
	* */
	private void buildTree(int[] array){
		for (int i = (array.length - 1) / 2; i >= 0; i--){
			heapAdjust(array, array.length, i);
		}
	}

	/*
	* 递归调整堆
	* */
	private void heapAdjust(int[] array, int len, int t){
		if (t > len) return;
		int max = t;
		int child_l = 2*t+1;
		int child_r = child_l + 1;
		if (child_l < len && array[child_l] > array[max]){
			max = child_l;
		}
		if (child_r < len && array[child_r] > array[max]){
			max = child_r;
		}
		if (max != t){
			swap(array, max, t);
			heapAdjust(array, len, max);
		}
	}
}
