/*
* 顺序查找
* */
package algorithm.search;

public class SequenceSearch implements SearchSolution{
    @Override
    public int solution(int[] array, int target) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}
