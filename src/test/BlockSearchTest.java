package test;

import algorithm.search.BlockSearch;
import jdk.nashorn.internal.ir.Block;
import orderedArray.OrderedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockSearchTest {

    @Test
    void solution() {
        BlockSearch blockSearch = new BlockSearch();

        int result = blockSearch.solution(OrderedArray.getOrderedArray(), 50);

        System.out.println(result);
    }
}