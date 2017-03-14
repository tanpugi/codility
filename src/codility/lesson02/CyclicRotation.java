package codility.lesson02;

import java.util.Arrays;

import codility.RunnerInterface;

public class CyclicRotation implements RunnerInterface  {

    public int[] solution(int[] A, int K) {
        int[] a = Arrays.copyOf(A, A.length);
        int[] b = Arrays.copyOf(A, A.length);
        for (int j=1; j<=K; j++) {
            for (int i=0; i<b.length; i++) {
                if (i==0) {
                    a[0] = b[b.length-1];
                }
                if (i<b.length-1) {
                    a[i+1] = b[i];
                }
            }
            
            b = Arrays.copyOf(a, a.length);
        }

        return a;
    }

    @Override
    public void run() {
        int[] A = {3,8,9,7,6};
        int[] newA = solution(A, 2);
        Arrays.stream(newA).forEach(System.out::print);
        System.out.println();
    }
}