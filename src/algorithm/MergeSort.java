//归并排序
package algorithm;

import fileIO.FileIO;

import java.util.Arrays;

public class MergeSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"mergeSort.txt");
		mergeSort(array);
		return array;
	}

	private int[] mergeSort(int [] array){
		if (array.length < 2) return array;
		int mid = array.length / 2;
		int [] left = Arrays.copyOfRange(array, 0, mid);
		int [] right = Arrays.copyOfRange(array, mid, array.length);
		int [] result_l = mergeSort(left);
		int [] result_r = mergeSort(right);
		return merge(result_l, result_r);
	}

	private int[] merge(int [] left, int [] right){
		int[] result = new int[left.length + right.length];
		for (int index = 0, i = 0, j = 0; index < result.length; index++){
			if (i >= left.length) result[index] = right[j++];
			else if (j >= right.length) result[index] = left[i++];
			else if (left[i] > right[j]) result[index] = right[j++];
			else result[index] = left[i++];
		}
		FileIO.writeArray(result,"mergeSort.txt");
//		int[] test = null;
		return result;
	}
}
