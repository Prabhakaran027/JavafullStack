package IOStreams;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {

    public static void main(String[] args) {

        try
        {

            FileOutputStream fileOutputStream=new FileOutputStream("D:\\test.txt");
            fileOutputStream.write(97);

            String st="Hello world";
            byte[] data =st.getBytes();
            fileOutputStream.write(data);


            fileOutputStream.close();
            System.out.println("write operation completed");

        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        catch (IOException e) {

            e.printStackTrace();
        }

    }

}
