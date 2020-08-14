package test;

import algorithm.SimpleSelectionSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSelectionSortTest {

    @Test
    void solution() {
        SimpleSelectionSort simpleSelectionSort = new SimpleSelectionSort();
        simpleSelectionSort.solution(RandomArray.getRandomArray());
    }
}