package test;

import algorithm.MergeSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void solution() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.solution(RandomArray.getRandomArray());
    }
}