package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class leet13romanToInteger {

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public int romanoPInt (String s){

        // Map to store romans numerals
        Map<Character, Integer> romanMap = new HashMap<>();

        // Fill the map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Length of the given string
        int n = s.length();

        // Variable to store result
        int num = romanMap.get(s.charAt(n - 1));

        // Loop for each character from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Check if the character at right of current character is
            // bigger or smaller
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;

    }

    public static void main(String[] args) {

        leet13romanToInteger f = new leet13romanToInteger();
        int res = f.romanoPInt("XV");
        System.out.println(res);

    }


}
