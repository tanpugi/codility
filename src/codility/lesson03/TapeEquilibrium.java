package codility.lesson03;

import codility.RunnerInterface;

public class TapeEquilibrium implements RunnerInterface {

    public int solution(int[] A) {
        int sumR = 0;
        for (int a : A) {
            sumR += a;
        }

        int diff = 0;
        int sumL = 0;
        for (int i=0; i<(A.length - 1); i++) {
            sumL += A[i];
            sumR -= A[i];

            int diffsum = Math.abs(sumL - sumR);
            if (diffsum < diff || i == 0) {
                diff = diffsum;
            }
        }

        return diff;
    }

    @Override
    public void run() {
        int[] A = {1,1};
        System.out.println(solution(A));
    }
}