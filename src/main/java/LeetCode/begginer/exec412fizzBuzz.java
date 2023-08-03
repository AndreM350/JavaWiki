package LeetCode.begginer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exec412fizzBuzz {

    public static void main(String[] args) {


    }

    public List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        while (n != 0) {

            String addedString = String.valueOf(n);

            if ( n % 3 == 0 && n % 5 == 0 ) {
                addedString = "FizzBuzz";
            } else if ( n % 3 == 0 ) {
                addedString = "Fizz";
            } else if ( n % 5 == 0 ) {
                addedString = "Buzz";
            }
            strings.add(addedString);
            n--;
        }
        Collections.reverse(strings);
        return strings;
    }


}
