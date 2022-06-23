package TestesGerais;

import java.util.ArrayList;
import java.util.Scanner;

public class testaArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<String> listinha = new ArrayList<>();

//        int x = 0;
//
//        while (x<51){
//            listinha.add("Item " + x);
//            x++;
//        }
//
//        System.out.println(listinha);
//
//        for (String iterador: listinha) {
//            System.out.println(iterador);
//        }

        int tabu = in.nextInt();
        int total = 0;
        ArrayList<Integer> Listatabuada = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            int res = tabu * i;
            Listatabuada.add(res);
            total += res;

            System.out.println(tabu + " x " + i + " = " + res);

        }
        System.out.println(Listatabuada);
        System.out.println(total);


    }

}
