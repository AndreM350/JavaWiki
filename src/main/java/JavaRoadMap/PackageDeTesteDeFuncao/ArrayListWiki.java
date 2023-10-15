package JavaRoadMap.PackageDeTesteDeFuncao;/*Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. */

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class ArrayListWiki {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Acessando um item //
        System.out.println(cars.get(0));

        // Loop em array list
        ArrayList<String> carros2 = new ArrayList<String>();
        carros2.add("Volvo");
        carros2.add("BMW");
        carros2.add("Ford");
        carros2.add("Mazda");
        for (int i = 0; i < carros2.size(); i++) {
            System.out.println(carros2.get(i));
        }

        // Loop com FOR em array list
        ArrayList<String> carros3 = new ArrayList<String>();
        carros3.add("Volvo");
        carros3.add("BMW");
        carros3.add("Ford");
        carros3.add("Mazda");
        for (String i : carros3) {
            System.out.println(i);
        }

        // Array List de Inteiros
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        /*
         * Classificiando ArrayLists Another useful class in the java.util package is
         * the Collections class, which include the sort() method for sorting lists
         * alphabetically or numerically:
         */

        ArrayList<String> cars4 = new ArrayList<String>();
        cars4.add("Volvo");
        cars4.add("BMW");
        cars4.add("Ford");
        cars4.add("Mazda");
        Collections.sort(cars4); // Sort cars
        for (String i : cars4) {
            System.out.println(i);
        }

        // Lista de ints classificadas
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(33);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(34);
        myNumbers2.add(8);
        myNumbers2.add(12);

        Collections.sort(myNumbers2); // Sort myNumbers

        for (int i : myNumbers2) {
            System.out.println(i);
        }

    }

}