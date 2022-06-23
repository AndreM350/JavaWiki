package URI;

import java.util.Scanner;
  //area = π . raio2
public class e002areaCirculo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio =  input.nextDouble();
        double area = pi*(raio*raio);


        System.out.println("A=" + String.format("%.4f",area));




    }

}
