//桶排序
package algorithm;

import fileIO.FileIO;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BucketSort implements Solution {

	@Override
	public int[] solution(int[] array) {
		// TODO Auto-generated method stub
		FileIO.writeArray(array,"bucketSort.txt");
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
		sort(list, 10);
		return null;
	}

	private ArrayList<Integer> sort(ArrayList<Integer> array, int bucketSize){
		//数组为空或者长度不足，返回原数组
		if (array == null || array.size() < 2) return array;

		//初始化最大最小值
		int max;
		int min = max = array.get(0);

		//查找最大最小值
		for (int i = 0; i < array.size(); i++){
			if (array.get(i) < min) min = array.get(i);
			if (array.get(i) > max) max = array.get(i);
		}

		//获取桶数bucketCount，通过最大值-最小值得知数据大致分布，再除以桶的大小bucketSize,得到桶数
		int bucketCount = (max - min) / bucketSize + 1;

		//定义桶数组
		ArrayList<ArrayList<Integer>> bucketArray = new ArrayList<>(bucketCount);

		//定义结果数组
		ArrayList<Integer> result = new ArrayList<>();

		//初始化桶数组
		for (int i = 0; i < bucketCount; i++){
			bucketArray.add(new ArrayList<Integer>());
		}

		//待排数组首次分配
		for (int i = 0; i < array.size(); i++){
			bucketArray.get((array.get(i) - min) / bucketSize).add(array.get(i));
		}

		//初次分配后再次进行桶内排序
		for (int i = 0; i < bucketCount; i++){
			//递归到桶尺寸最小即为1时，直接将桶中元素加入结果数组中
			if (bucketSize == 1){
				for (int j = 0; j < bucketArray.get(i).size(); j++){
					result.add(bucketArray.get(i).get(j));
				}
			} else {
				if (bucketCount ==  1){
					bucketSize--;
				}
				ArrayList<Integer> tmp = sort(bucketArray.get(i), bucketSize);
				for (int j = 0; j < tmp.size(); j++){
					result.add(tmp.get(j));
				}
			}
			/*int[] array_result = result.stream().mapToInt(Integer::valueOf).toArray();
			FileIO.writeArray(array_result, "bucketSort.txt");*/
		}
		for (int a : result) {
			System.out.print(a + " ");
		}
		System.out.println();
		return result;
	}

	/*private int[] sort(int[] array, int bucketSize) {
		if (array.length < 2) return array;

		//初始化最大最小值
		int max;
		int min;
		max = min = array[0];

		//获取最大最小值
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) min = array[i];
			if (array[i] > max) max = array[i];
		}

		//获取桶数
		int buckCount = (max - min) / bucketSize + 1;

		//创建bucketCount个桶，用于存放待排元素
		int [] bucketArray = new int[buckCount];

		//创建结果数组，存放排序后序列
		int[] result = new int[];

		for (int i = 0; i < buckCount; i++){
			bucketArray[i] = new int[];
		}


	}*/
}
