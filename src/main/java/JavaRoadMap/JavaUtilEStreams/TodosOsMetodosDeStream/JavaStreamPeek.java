package JavaRoadMap.JavaUtilEStreams.TodosOsMetodosDeStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamPeek {

    public static void main(String[] args) {

        List<String> result = Stream.of("EURO/INR", "USD/AUD", "USD/GBP", "USD/EURO")
                .filter(e -> e.length() > 7)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toLowerCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .toList();


        List<String> versions = new ArrayList<>();
        versions.add("Lollipop");
        versions.add("KitKat");
        versions.add("Jelly Bean");
        versions.add("Ice Cream Sandwidch");
        versions.add("Honeycomb");
        versions.add("Gingerbread");

        // filtering all vaersion which are longer than 7 characters

        Set<String> h = versions.stream()
                .filter(s -> s.length() > 7)
                .peek(e -> System.out.println("After the first filter: " + e))
                .filter(s -> s.startsWith("H"))
                .peek(e -> System.out.println("After the second filter: " + e))
                .collect(Collectors.toSet());


    }


}
