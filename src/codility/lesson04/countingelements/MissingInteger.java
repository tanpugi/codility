package codility.lesson04.countingelements;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import codility.RunnerInterface;

public class MissingInteger implements RunnerInterface {

    public int solution(int[] A) {

        Set<Integer> setA = new TreeSet<>();
        for (int i=0; i<A.length; i++) {
            if (A[i] > 0) {
                setA.add(A[i]);
            }
        }

        int previous = 0;
        int elem = 0;
        Iterator<Integer> setIt = setA.iterator();
        while (setIt.hasNext()) {
            int next = setIt.next();
            int delta = next - previous;

            if (delta > 1) {
                elem = ++previous;
                break;
            }

            previous = next;
        }

        if (elem == 0) {
            elem = ++previous;
        }

        return elem;
    }

    @Override
    public void run() {
        int[] A = {4,5,6,24,90,1,2,3,4,};
        System.out.println(solution(A));
    }

}
