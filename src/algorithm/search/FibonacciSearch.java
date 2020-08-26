package algorithm.search;

import java.util.Arrays;

public class FibonacciSearch implements SearchSolution{
    @Override
    public int solution(int[] array, int target) {
        int k = 0;
        int low = 0;
        int high = array.length - 1;
        int mid = 0;

        int [] f = getFib();

        while (high > f[k] - 1){
            k++;
        }

        int[] newArray = Arrays.copyOf(array, f[k]);

        for (int i = high + 1; i < newArray.length; i++){
            newArray[i] = array[high];
        }

        while (low <= high){
            mid = low + f[k - 1] - 1;

            if (target < newArray[mid]){
                high = mid - 1;
                k--;
            }
            else if (target > newArray[mid]){
                low = mid + 1;
                k -= 2;
            }
            else {
                if (mid <= high){
                    return mid;
                }
                else return high;
            }
        }

        return -1;
    }

    private int[] getFib(){
        int [] f = new int [20];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 20; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
}
