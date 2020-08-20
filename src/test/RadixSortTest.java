package test;

import algorithm.RadixSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void solution() {
        RadixSort radixSort = new RadixSort();
        radixSort.solution(RandomArray.getRandomArray());
    }
}