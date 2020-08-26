/*
* 差值查找
* */
package algorithm.search;

public class InsertionSearch implements SearchSolution{
    @Override
    public int solution(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        return search(array, target, low, high);
    }

    private int search(int [] array, int target, int low, int high){
        if (low > high) return -1;

        int mid = low + (target - array[low]) / (array[high] - array[low]) * (high - low);

        if (array[mid] == target) return mid;

        if (array[mid] > target) return search(array, target, low, mid - 1);

        if (array[mid] < target) return search(array, target, mid + 1, high);

        return -1;
    }
}
