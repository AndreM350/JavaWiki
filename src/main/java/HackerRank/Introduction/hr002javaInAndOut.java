package HackerRank.Introduction;




import java.util.Scanner;

public class hr002javaInAndOut {

    public static void main(String[] args) {


        //odd - impar
        //even - par
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();

        if (A%2 != 0){
            System.out.println("Weird"); //impar
        }


        if (A%2==0 && A >= 2 && A <= 5){
            System.out.println("Not Weird");
        } else if (A%2==0 && A >= 6 && A <= 20) {
            System.out.println("Weird");
        } else if (A%2==0 && A > 20){
            System.out.println("Not Weird");
        }



    }


}
