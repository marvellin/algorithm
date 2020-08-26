package test;

import algorithm.search.InsertionSearch;
import orderedArray.OrderedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSearchTest {

    @Test
    void solution() {
        InsertionSearch insertionSearch = new InsertionSearch();

        int result = insertionSearch.solution(OrderedArray.getOrderedArray(), 50);

        System.out.println(result);
    }
}