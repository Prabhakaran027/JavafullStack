package IOStreams;

import java.io.IOException;

public class IOStream {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();
        System.out.println((char)a);
        System.err.println("Error message");

    }
}
