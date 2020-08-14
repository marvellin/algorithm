//快速排序
package algorithm;

import fileIO.FileIO;

import java.io.File;

public class QuickSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		quickSort(array, 0, array.length-1);
		return array;
	}

	//改进的快排算法，当序列基本有序时，调用插入排序对基本有序序列进行排序
	public int[] improvedSolution(int [] array, int k ){
		improvedQuickSort(array, 0, array.length - 1, k);

		//调用插入排序
		for (int i = 1; i <= array.length - 1; i++){
			int tmp = array[i];
			int j = i - 1;
			while (tmp < array[j]){
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j+1] = tmp;
			FileIO.writeArray(array,"improvedQuickSort.txt");
		}
		return array;
	}

	//改进的快排算法，当子序列长度不超过k时，不再进行子序列划分
	private void improvedQuickSort(int[] array, int low, int high, int k) {
		if (high - low > k){
			int privotLoc = partition(array, low, high);

			FileIO.writeArray(array,"improvedQuickSort.txt");

			improvedQuickSort(array, low, privotLoc - 1, k);

			improvedQuickSort(array, low, privotLoc + 1, k);
		}
	}

	/*
	 * 传统的快排算法，递归主函数
	 * */
	private void quickSort(int [] array, int low, int high){
		if (low < high){
			//将表一分为二
			int privotLoc = partition(array, low, high);

			FileIO.writeArray(array, "quickSort.txt");

			//递归对低子表排序
			quickSort(array, low, privotLoc - 1);

			//递归对高子表排序
			quickSort(array, privotLoc + 1, high);
		}
	}

	private void swap(int [] array, int low, int high){
		int tmp = array[low];
		array[low] = array[high];
		array[high] = tmp;
	}

	/*
	* 根据基准privotkey将待排列表分为两部分，即大于基准的元素和小于基准的元素
	* */
	private int partition(int [] array, int low, int high) {
		//挑选基准元素（通常为待排列表第一位）
		int privotkey = array[low];

		//从表的两端交替地向中间扫描
		while (low < high) {
			while (low < high && array[high] >= privotkey) --high;
			//交换
			swap(array, low, high);
			while (low < high && array[low] <= privotkey) ++low;
			//交换
			swap(array, low, high);
		}

		return low;
	}
}
