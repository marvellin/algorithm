package test;

import algorithm.HeapSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void solution() {
        HeapSort heapSort = new HeapSort();
        heapSort.solution(RandomArray.getRandomArray());
    }
}