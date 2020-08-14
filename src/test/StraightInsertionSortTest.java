package test;

import algorithm.StraightInsertionSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class StraightInsertionSortTest {

    @Test
    void solution() {
        StraightInsertionSort straightInsertionSort = new StraightInsertionSort();
        straightInsertionSort.solution(RandomArray.getRandomArray());
    }
}