package Java8_Features;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

        String st = "Hello";

        if (st != null) {
            System.out.println(st);
            System.out.println(st.length());
        }

        Optional<String> s = Optional.ofNullable(st);

        if (s.isPresent()) {
            System.out.println(s.get());
            System.out.println(s.get().length());
        }

    }

}
