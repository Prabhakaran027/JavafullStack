package IOStreams;



import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) {

        try
        {
            PrintWriter printWriter=new PrintWriter("sample.txt");
            printWriter.write(78);

            String st="this is a sample text";
            printWriter.write(st);
            printWriter.close();


        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
