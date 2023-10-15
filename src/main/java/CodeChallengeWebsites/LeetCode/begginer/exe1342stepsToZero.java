package CodeChallengeWebsites.LeetCode.begginer;

public class exe1342stepsToZero {

    public static void main(String[] args) {

        int steps = calculateStepToZero(123);
        System.out.println(steps);
    }

    private static int calculateStepToZero(int num) {
        int step = 0;
        while (num != 0){
            if(num % 2 == 0){
                int i = num / 2;
                step++;
                num = i;
            } else {
                num -= 1;
                step++;
            }
        }
        return step;
    }
}
