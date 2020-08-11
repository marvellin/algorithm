//冒泡排序
package algorithm;

import fileIO.FileIO;

public class BubblingSort implements Solution{

	/*
	* 传统冒泡排序
	* */
	@Override
	public int[] solution(int [] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length - 1; i++){
			for (int j = 0; j < array.length-i-1; j++){
				if (array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
			FileIO.writeArray(array,"bubbling.txt");
		}
		return array;
	}

	/*
	* 利用pos记录最后一次交换的记录位置，下次比较进行到该位置结束
	* */
	public int[] improveSolution1(int [] array){
		int i = array.length - 1;
		while (i > 0){
			int pos = 0;
			for (int  j = 0; j < i; j++){
				if (array[j] > array[j+1]){
					pos = j;
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
			i = pos;
			FileIO.writeArray(array,"improveBubbling1.txt");
		}
		return array;
	}

	/*
	*将传统冒泡一次比较确定一个最大或最小值的解决方法改为，一次比较确定最大与最小值
	* */
	public int[] improveSolution2(int [] array){
		int low = 0;
		int high = array.length - 1;
		int tmp,j;
		while (low < high){
			//正向冒泡查找最大值
			for (j = low; j < high; j++){
				if (array[j] > array[j+1]){
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
			high--;
			//反向冒泡查找最小值
			for (j = high; j > low; j--){
				if (array[j] < array[j-1]){
					tmp = array[j];
					array[j] = array[j-1];
					array[j-1] = tmp;
				}
			}
			low++;
			FileIO.writeArray(array,"improveBubbling2.txt");
		}
		return array;
	}
}
