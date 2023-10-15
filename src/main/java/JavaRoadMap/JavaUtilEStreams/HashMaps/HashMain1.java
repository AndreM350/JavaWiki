package JavaRoadMap.JavaUtilEStreams.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMain1 {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Inglaterra", "Londres");
        capitalCities.put("Alemanha", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington");
        capitalCities.put("Brasil","Brasilia");

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Item 1");
        map.put(2,"Item 2");
        map.put(3,"Item 3");
        map.put(4,"Item 4");
        map.put(5,"Item 5");

        String s = map.get(1);
        Set<Integer> integers = map.keySet();
        Integer integer = map.keySet().stream().findFirst().get();

        Integer integer1 = map.keySet().stream().findFirst().get();

        String s1 = map.values().stream().findFirst().get();

        //----------------------------------
//        System.out.println(s);
//        System.out.println(integers);
//        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(s1);


//        System.out.println("\n" + capitalCities);
//
//        String oslo = capitalCities.get("Inglaterra");
//        System.out.println(oslo);
//
//        System.out.println(capitalCities.size());
//
//        System.out.println("-------------------------------[1]");
//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }
//
//        System.out.println("-------------------------------[2]");
//        capitalCities.forEach((x, y) -> {
//            System.out.println(x.toUpperCase() + " - " + y);
//        });
//
//        System.out.println("-------------------------------[3]");
//
//        System.out.println(capitalCities.containsValue(""));
//
//        capitalCities.forEach((k,v)->{
//            if(v.contains("")){
//                v.replace("","Vazio");
//            }
//        });
//        System.out.println("-------------------------------[4]");
//        System.out.println(capitalCities);



    }
}
