package codility.lesson02;

import codility.RunnerInterface;

public class OddOccurencesInArray implements RunnerInterface {
    public int solution(int[] A) {
        int odd = A[0];
        for (int i = 1; i < A.length; i++) {
            odd ^= A[i];
        }
        return odd;
    }
    
    @Override
    public void run() {
        int[] A = {9, 1, 9, 367, 3, 4, 5, 6, 3, 5, 1, 4, 6};
        System.out.println(solution(A));
    }
}
