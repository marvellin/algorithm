//基数排序
package algorithm;

import fileIO.FileIO;

import java.util.ArrayList;

public class RadixSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"radixSort.txt");
		sort(array);
		return array;
	}

	private int[] sort(int[] array){
		//如果待排数组长度不足，则原路返回
		if (array.length < 2) return array;

		//获取待排队列中的最大值
		int max = array[0];
		for (int i = 0; i < array.length; i++){
			if (array[i] > max) max = array[i];
		}

		//获取最大值的最大位
		int maxDigit = 0;
		while (max != 0){
			max /= 10;
			maxDigit++;
		}

		//定义与初始化辅助空间二维数组
		ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++){
			bucketList.add(new ArrayList<Integer>());
		}

		int mod = 10;
		int div = 1;

		//对待排数组进行maxDigit次的分配排序
		for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10){
			//对待排数组进行该次分配
			for (int j = 0; j < array.length; j++){
				int num = (array[j] % mod) /div;
				bucketList.get(num).add(array[j]);
			}

			int index = 0;

			//收集该次分配后的结果，收集回原待排数组空间中,以便进行下次分配排序
			for (int j = 0; j < bucketList.size(); j++){
				for (int k = 0; k < bucketList.get(j).size(); k++){
					array[index++] = bucketList.get(j).get(k);
				}
				bucketList.get(j).clear();
			}

			FileIO.writeArray(array,"radixSort.txt");
		}

		return array;
	}
}
