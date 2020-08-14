package test;

import algorithm.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    private int [] array = new int[]{34,61,67,10,62,79,21,63,62,29,3,39,6,85,18,52,88,84,22,99};

    @Test
    void solution() {
        QuickSort quickSort = new QuickSort();
        quickSort.solution(array);
    }

    @Test
    void improvedSolution() {
        QuickSort quickSort = new QuickSort();
        quickSort.improvedSolution(array, 4);
    }
}