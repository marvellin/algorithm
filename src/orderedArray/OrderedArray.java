package orderedArray;

import algorithm.QuickSort;

public class OrderedArray {

    private final static int LENGTH = 20;

    public static int[] getOrderedArray(){
        int [] array = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++){
            array[i] = (int)(Math.random()*100);
        }

        QuickSort quickSort = new QuickSort();

        array = quickSort.solution(array);

        for (int a : array){
            System.out.print(a + " ");
        }

        return array;
    }
}
