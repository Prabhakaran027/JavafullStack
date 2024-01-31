package IOStreams;


import java.io.*;
import java.util.Scanner;

public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        try
        {
            FileOutputStream fileOutputStream=new FileOutputStream("D:\\test.txt");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

            String st;

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a lines : ");
            int lines = scanner.nextInt();
            for(int i = 0; i<= lines; i++){
                st=scanner.nextLine();
                byte[] ar =st.getBytes();

                bufferedOutputStream.write(ar);
            }

            
            bufferedOutputStream.close();
            fileOutputStream.close();
            System.out.println("Write operation completed!!");
        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        catch (IOException e) {

            e.printStackTrace();
        }

    }

}
