package fileIO;

import org.junit.jupiter.api.Test;
import randomArray.RandomArray;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileIOTest {

    @Test
    void writeArray() throws IOException {
        String file =  new String("test1.txt");
        int [] array = RandomArray.getRandomArray();
        FileIO.writeArray(array,file);
    }
}