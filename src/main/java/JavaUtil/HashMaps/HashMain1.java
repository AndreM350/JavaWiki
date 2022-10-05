package JavaUtil.HashMaps;

import java.util.HashMap;

public class HashMain1 {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Inglaterra", "Londres");
        capitalCities.put("Alemanha", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington");
        capitalCities.put("Brasil","Brasilia");

        System.out.println("\n" + capitalCities);

        String oslo = capitalCities.get("Inglaterra");
        System.out.println(oslo);

        System.out.println(capitalCities.size());

        System.out.println("-------------------------------[1]");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println("-------------------------------[2]");
        capitalCities.forEach((x, y) -> {
            System.out.println(x.toUpperCase() + " - " + y);
        });

        System.out.println("-------------------------------[3]");

        System.out.println(capitalCities.containsValue(""));

        capitalCities.forEach((k,v)->{
            if(v.contains("")){
                v.replace("","Vazio");
            }
        });
        System.out.println("-------------------------------[4]");
        System.out.println(capitalCities);



    }
}
