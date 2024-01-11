package OOPs;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String st = scanner.nextLine();

        int alphabets = 0, digits = 0, spaces = 0, special = 0;
        int vowels = 0, consonants = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                if ((st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u')
                        || (st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U')) {
                    vowels += 1;
                } else {
                    consonants += 1;
                }
                alphabets += 1;

            } else if (ch >= '0' && ch <= '9') {
                digits += 1;
            } else if (ch == ' ') {
                spaces += 1;
            } else {
                special += 1;
            }
        }

            System.out.println("Alphabets = " + alphabets);
            System.out.println("Digits = " + digits);
            System.out.println("Spaces = " + spaces);
            System.out.println("Special Characters = " + special);


            System.out.println("vowels : " + vowels + "\n" + "consonants : " + consonants);
        }

    }


