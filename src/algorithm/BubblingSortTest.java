package algorithm;

import org.junit.jupiter.api.Test;

class BubblingSortTest {

    @Test
    void solution() {
        BubblingSort bubblingSort = new BubblingSort();
//        bubblingSort.solution(RandomArray.getRandomArray());
        int [] array = new int[]{34,61,67,10,62,79,21,63,62,29,3,39,6,85,18,52,88,84,22,99};
        bubblingSort.solution(array);
    }

    @Test
    void testSolution() {
    }

    @Test
    void improveSolution() {
        BubblingSort bubblingSort = new BubblingSort();
        int [] array = new int[]{34,61,67,10,62,79,21,63,62,29,3,39,6,85,18,52,88,84,22,99};
//        bubblingSort.improveSolution(RandomArray.getRandomArray());
        bubblingSort.improveSolution1(array);
    }

    @Test
    void testSolution1() {
    }

    @Test
    void improveSolution1() {
    }

    @Test
    void improveSolution2() {
        BubblingSort bubblingSort = new BubblingSort();
        int [] array = new int[]{34,61,67,10,62,79,21,63,62,29,3,39,6,85,18,52,88,84,22,99};
//        bubblingSort.improveSolution(RandomArray.getRandomArray());
        bubblingSort.improveSolution2(array);
    }
}