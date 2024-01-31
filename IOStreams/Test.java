package IOStreams;

import java.io.*;
import java.io.File;

public class Test{

    public static void main(String[] args) {
        try {

            FileInputStream fileInputStream = new FileInputStream("demo.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("test1.txt");

            int value;
            while((value = fileInputStream.read())!=-1){
                fileOutputStream.write(value);
            }
            fileInputStream.read();
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}