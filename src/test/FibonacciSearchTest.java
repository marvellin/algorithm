package test;

import algorithm.search.FibonacciSearch;
import orderedArray.OrderedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSearchTest {

    @Test
    void solution() {
        FibonacciSearch fibonacciSearch = new FibonacciSearch();

        int result = fibonacciSearch.solution(OrderedArray.getOrderedArray(), 50);

        System.out.println(result);
    }
}