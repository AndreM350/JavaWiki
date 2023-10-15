package CodeChallengeWebsites.URIBeeCrowd;

import java.util.Scanner;

public class e009salarioComBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nomeVendedor = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();

        double comissao = (totalVendas * 0.15);
        double salarioTotal = salarioFixo + comissao;

        System.out.println("TOTAL = R$ " + String.format("%.2f",salarioTotal));





    }
}
