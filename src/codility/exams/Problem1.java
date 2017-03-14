package codility.exams;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {

    public int solution(int[] A) {
        int pairPossibility = A.length * A.length;

        int x = 0;
        int y = 0;

        Set<String> pairSet = new HashSet<>();
        for (int i=0; i<pairPossibility; i++) {
            y++;
            if (y % A.length == 0) {
                y = 0;
                x++;
            }
            if (x == A.length) {
                break;
            }
            if (x == y) {
                continue;
            }
            if ((A[x] + A[y]) % 2 == 0) {
                String key = x < y ? x + "-" + y : y + "-" + x; 
                pairSet.add(key);
            }
        }
        
        int pairSize = pairSet.size();
        int pairCount = pairSize > 1_000_000_000 ? -1 : pairSize;
        return pairCount;
    }

    public void run() {
        int[] A = {2, 1, 5, -6, 9};
        System.out.println(solution(A));
    }
}