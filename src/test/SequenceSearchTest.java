package test;

import algorithm.search.SequenceSearch;
import orderedArray.OrderedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceSearchTest {

    @Test
    void solution() {
        SequenceSearch sequenceSearch = new SequenceSearch();

        int result = sequenceSearch.solution(OrderedArray.getOrderedArray(), 50);

        System.out.println(result);
    }
}