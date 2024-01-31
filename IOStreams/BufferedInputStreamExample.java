package IOStreams;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {

        try
        {
            FileInputStream fileInputStream=new FileInputStream("D:\\test.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

            int data;

            while((data=bufferedInputStream.read())!=-1)
            {
                System.out.print((char)data);
            }


            fileInputStream.close();
            bufferedInputStream.close();


        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
