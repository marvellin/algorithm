package test;

import algorithm.search.BiSearch;
import orderedArray.OrderedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiSearchTest {

    @Test
    void solution() {
        BiSearch biSearch = new BiSearch();

        int result = biSearch.solution(OrderedArray.getOrderedArray(), 50);

        System.out.println(result);

    }
}