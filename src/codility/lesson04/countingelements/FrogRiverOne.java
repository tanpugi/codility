package codility.lesson04.countingelements;

import java.util.HashSet;
import java.util.Set;

import codility.RunnerInterface;

public class FrogRiverOne implements RunnerInterface {

    public int solution(int X, int[] A) {
        
        Set<Integer> setA = new HashSet<>();
        for (int i=0; i<A.length; i++) {
            setA.add(A[i]);
            if (setA.size() == X) {
                return i;
            }
        }
        
        return -1;
    }

    @Override
    public void run() {
        int[] A = {1,5,1,4,5,3,1,2};
        System.out.println(solution(5,A));
    }

}
