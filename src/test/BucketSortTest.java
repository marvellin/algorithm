package test;

import algorithm.BucketSort;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class BucketSortTest {

    @Test
    void solution() {
        BucketSort bucketSort = new BucketSort();
        bucketSort.solution(RandomArray.getRandomArray());
    }
}