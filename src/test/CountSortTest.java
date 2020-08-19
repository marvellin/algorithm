package test;

import algorithm.CountSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class CountSortTest {

    @Test
    void solution() {
        CountSort countSort = new CountSort();
        countSort.solution(RandomArray.getRandomArray());
    }
}