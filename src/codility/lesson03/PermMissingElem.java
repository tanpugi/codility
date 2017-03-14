package codility.lesson03;

import codility.RunnerInterface;

public class PermMissingElem implements RunnerInterface {
    
    public int solution(int[] A) {
        boolean[] B = new boolean [A.length + 2];
        for (int a : A) {
            B[a] = true;
        }
        
        int elem = 0; 
        for (int i=1; i<B.length; i++) {
            if (!B[i]) {
                elem = i;
                break;
            }
        }
        
        return elem;
    }

    @Override
    public void run() {
        int[] A = {2,3,7,5,6,4};
        System.out.println(solution(A));
    }

}