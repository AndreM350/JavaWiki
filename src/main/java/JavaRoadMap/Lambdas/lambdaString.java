package JavaRoadMap.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class lambdaString {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");


        //função com lambda -------------------------------------------------

        //nomes.sort((String s1, String s2) -> s1.length() - s2.length());
        nomes.sort((s1,  s2) -> s1.length() - s2.length());



        //função sem lambda -------------------------------------------------

//        Collections.sort(nomes, new Comparator<String>() {
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        });






        System.out.println(nomes);

    }
}
