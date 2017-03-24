package codility.lesson04.countingelements;

import codility.RunnerInterface;

public class MaxCounters implements RunnerInterface {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        
        int maxCount = 0;
        int addMaxCount = 0;
        for (int i=0; i<A.length; i++) {
            int a = A[i];
            if (a <= N) {
                int idx = a - 1;
                if (counters[idx] < addMaxCount) {
                    counters[idx] = addMaxCount;
                }

                counters[idx] = ++counters[idx];
                if (counters[idx] > maxCount) {
                    maxCount = counters[idx];
                }
            } else {
                addMaxCount = maxCount;
            }
        }

        for (int i=0; i<counters.length;i++) {
            if (counters[i] < addMaxCount) {
                counters[i] = addMaxCount;
            }
        }

        return counters;
    }

    @Override
    public void run() {
        int[] A = {3,4,4,6,1,4,4};
        int[] counters = solution(5,A);
        for (int c : counters) {
            System.out.println(c);
        }
    }

}
