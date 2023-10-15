package CodeChallengeWebsites.URIBeeCrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class e013maiorNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        //int maior = (A+B+C+(A-B-C))

        List<Integer> lista = new ArrayList<>();

        lista.add(A);
        lista.add(B);
        lista.add(C);

        Integer max = Collections.max(lista);

        System.out.println(max + " eh o maior");


    }
}
