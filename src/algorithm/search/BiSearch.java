/*
* 折半查找
* */
package algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;

public class BiSearch implements SearchSolution{
    @Override
    public int solution(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int  mid = low + (high - low) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] > target) high = mid - 1;
            if (array[mid] < target) low = mid + 1;
        }

        return -1;
    }
}
