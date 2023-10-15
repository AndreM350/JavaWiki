package CodeChallengeWebsites.HackerRankIntroduction;

import java.io.*;

import static java.util.stream.Collectors.joining;


public class hr005javaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i < 11; i++) {
            int multiply = N * i;
            System.out.println(N+" x "+i+" = "+multiply);

        }

        bufferedReader.close();

    }
}
