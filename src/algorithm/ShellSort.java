//希尔排序
package algorithm;

import fileIO.FileIO;

public class ShellSort implements Solution {

	@Override
	public int[] solution(int [] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"shellSort.txt");
		for (int dk = array.length / 2; dk > 0; dk/=2){
			for (int i = dk; i < array.length; i++){
				for (int j = i; j > dk - 1; j-=dk){
					if (array[j] < array[j-dk]){
						int tmp = array[j];
						array[j] = array[j-dk];
						array[j-dk] = tmp;
						FileIO.writeArray(array,"shellSort.txt");
					}
				}
			}
		}
		/*int dk = array.length / 2;
		while (dk >= 1){
			shellSort(array, dk);
			dk /= 2;
		}*/
		return array;
	}

	private void shellSort(int [] array, int dk){
		for (int i = dk; i < array.length; i++){
			if (array[i] < array[i - dk]) {
				int j = i - dk;
				int x = array[i];
				while (j >= 0 && x < array[j]) {
					array[j + dk] = array[j];
					j -= dk;
				}
				array[j + dk] = x;
				FileIO.writeArray(array,"shellSort.txt");
			}
		}
	}
}
