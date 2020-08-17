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

    @Test
    void testSolution() {
    }

    @Test
    void improvedSolution() {
        SimpleSelectionSort simpleSelectionSort = new SimpleSelectionSort();
//        simpleSelectionSort.improvedSolution(RandomArray.getRandomArray());
//        int [] array = new int[]{40,47,89,36,23,58,45,36,25,56,74,90,83,36,55,12,91,27,44,98};
        int [] array = RandomArray.getRandomArray();
        for (int a : simpleSelectionSort.improvedSolution(array)){
            System.out.print(a + " ");
        }
    }

}