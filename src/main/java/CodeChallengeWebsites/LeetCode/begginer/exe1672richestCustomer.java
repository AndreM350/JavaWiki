package CodeChallengeWebsites.LeetCode.begginer;

import java.util.*;
import java.util.stream.IntStream;

public class exe1672richestCustomer {

    public static void main(String[] args) {

        int[][] accounts = {{1, 2, 3}, {5, 2, 1}, {10, 20, 30}};

        List<List<Integer>> listsOfAccounts = new ArrayList<>();

        for (int[] subarray : accounts) {

            List<Integer> accountList = new ArrayList<>();
            for (int element : subarray) {
                accountList.add(element);
            }
            listsOfAccounts.add(accountList);
        }


        ArrayList<Integer> sumList = new ArrayList<>();

        for (List<Integer> listsOfAccount : listsOfAccounts) {
            int sum = listsOfAccount.stream().flatMapToInt(IntStream::of).sum();
            sumList.add(sum);
        }
        System.out.println(sumList.stream().max(Comparator.naturalOrder()).get());


    }


}
