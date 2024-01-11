package OOPs;

import java.util.Scanner;

public class PalindromeWordsCount {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a string:");
        String st=scanner.nextLine();

        String[] words =st.split(" ");
        //String rev="";
        int count=0;

        for(String word:words)
        {
            String rev="";
            for(int i=word.length()-1;i>=0;i--)
            {
                rev=rev+word.charAt(i);
            }

            if(rev.equals(word))
            {
                System.out.println(word);

                count=count+1;
            }
        }

        System.out.println("Number od Palindrome words: "+count);

    }

}
