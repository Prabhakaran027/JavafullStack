package IOStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader("test.txt");

            FileWriter fileWriter = new FileWriter("test1.txt");


            while((fileReader.read())!=-1)
            {
                fileWriter.write("j");
            }
            fileWriter.close();
            fileReader.close();

        }
        catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        }
        catch (IOException e) {

            throw new RuntimeException(e);
        }


    }
}
