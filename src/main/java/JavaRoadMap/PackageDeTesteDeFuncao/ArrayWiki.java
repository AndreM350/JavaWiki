package JavaRoadMap.PackageDeTesteDeFuncao;

public class ArrayWiki {

    public static void main(String[] args) {

        // array de strings //
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        // mudando valores de arrays
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // array de ints
        int[] numb = { 10, 20, 30, 40 };
        System.out.println(numb[0]);

        // Array Lenght - N�mero de elementos de 1 array
        String[] cars2 = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars2.length);

        // Dando Loop em um Array
        String[] cars3 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int i = 0; i < cars3.length; i++) {
            System.out.println(cars3[i]);
        }

        // Loop com for
        String[] cars4 = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars4) {
            System.out.println(i);
        }

        /* - - - - - - - - - - - - |Arrays Multidimensionais| - - - - - - - - - - - - */

        //int[][] arrayMD = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][2]; // elemento da lista 0,1 > 0,1,2
        System.out.println(x); // Outputs 7

        int[][] myNumbers2 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers2.length; ++i) {
            for (int j = 0; j < myNumbers2[i].length; ++j) {
                System.out.println(myNumbers2[i][j]);

            }
        }
    }
}