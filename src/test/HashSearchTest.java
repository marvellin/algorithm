package test;

import algorithm.search.HashSearch;
import orderedArray.OrderedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashSearchTest {

    @Test
    void solution() {
        HashSearch hashSearch = new HashSearch();

        int result = hashSearch.solution(OrderedArray.getOrderedArray(), 50);

        System.out.println(result);
    }
}