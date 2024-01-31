package IOStreams;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriterExample {

    public static void main(String[] args) {

        try
        {
            FileWriter fileWriter=new FileWriter("demo1.txt");
            fileWriter.write("Welcome to filewriter");
            fileWriter.close();


            FileReader fileReader=new FileReader("demo1.txt");
            int data;
            while((data=fileReader.read())!=-1)
            {
                System.out.print((char)data);
            }

            fileReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
