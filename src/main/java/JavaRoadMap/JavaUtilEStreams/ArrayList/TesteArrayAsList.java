package JavaRoadMap.JavaUtilEStreams.ArrayList;

import java.util.Arrays;
import java.util.List;

public class TesteArrayAsList {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("String1", "String2", "String3");
        String s = strings.get(1);
        System.out.println(strings);
        System.out.println(s);

    }

}
