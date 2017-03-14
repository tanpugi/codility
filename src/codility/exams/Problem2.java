package codility.exams;
public class Problem2 {

    public int solution(int[] A) {
        long pairPossibility = A.length * A.length;

        int x = 0;
        int y = 0;
        int smallestDistance = 999_999_999;
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
            if (Math.abs(A[x] - A[y]) < smallestDistance) {
                smallestDistance =  Math.abs(A[x] - A[y]);
            }
        }
        
        return smallestDistance;
    }
    
    
    
    public void run() {
        int [] A = {700,2100,343,42,100000,934567};
        System.out.println(solution(A));
    }
}