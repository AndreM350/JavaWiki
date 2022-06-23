package TestesGerais;

import java.util.ArrayList;

public class comparandoStrings {

    public static void main(String[] args) {

        ArrayList<String> arrayString = new ArrayList<>();

        arrayString.add("Andre");
        arrayString.add("Andre");

        System.out.println(arrayString.contains("Andre"));

        String a = "Andre";
        String b = "Andre";

        if (a.equals(b)){
            System.out.println("iguais");
        } else {
            System.out.println("são diferentes");
        }



    }

}
