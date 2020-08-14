package test;

import algorithm.ShellSort;
import jdk.nashorn.tools.Shell;
import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void solution() {
        ShellSort shellSort = new ShellSort();
        shellSort.solution(RandomArray.getRandomArray());
    }
}