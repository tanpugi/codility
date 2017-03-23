package codility.lesson04.countingelements;

import java.util.HashSet;
import java.util.Set;

import codility.RunnerInterface;

public class PermCheck implements RunnerInterface {

    public int solution(int[] A) {
        
        Set<Integer> setA = new HashSet<>();
        for (int a : A) {
            setA.add(a);
        }
        
        long sumA = 0;
        for (int i=1; i<A.length + 1; i++) {
            sumA += i;
        }
        
        long sumB = 0;
        for (int a : setA) {
            sumB += a;
        }
        
        return (sumA != sumB) ? 0 : 1;
    }

    @Override
    public void run() {
        int[] A = {1,2,3,4,5,100};
        System.out.println(solution(A));
    }

}
