package fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    /*
    * 记录每次排序结果
    * */
    public static boolean writeArray(int [] array, String fileName) {
        File file = new File(fileName);
        if (!file.exists() || file.isFile()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        for (int tmp : array){
            try {
                writer.write(tmp + " ");
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static boolean readArray(int [] array){
        return true;
    }
}
