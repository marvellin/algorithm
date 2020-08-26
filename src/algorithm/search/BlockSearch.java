package algorithm.search;

public class BlockSearch implements SearchSolution{
    @Override
    public int solution(int[] array, int target) {
        int [] indexArray = getIndexArray(array, 5);

        int low = 0;
        int high = indexArray.length - 1;

        int index = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (target < array[indexArray[mid]])
                high = mid - 1;
            else if (target > array[indexArray[mid]])
                low = mid + 1;
            else
                return indexArray[mid];

            if (low >= high)
                index = indexArray[high + 1];
        }

        for (int i = index - 5; i < index; i++){
            if (array[i] == target)
                return i;
        }

        return -1;
    }

    private int [] getIndexArray(int [] array, int n){
        int [] indexArray = new int [array.length / n];

        for (int i = 0; i < indexArray.length; i++){
            int max = i * n;
            for (int j = i * n; j < (i + 1) * n; j++){
                if (array[j] > array[max])
                    max = j;
            }
            indexArray[i] = max;
        }

        return indexArray;
    }
}
