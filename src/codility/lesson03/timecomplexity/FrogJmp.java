package codility.lesson03.timecomplexity;

import codility.RunnerInterface;

public class FrogJmp implements RunnerInterface {

    public int solution(int X, int Y, int D) {
        int delta = Y - X;
        if (delta > D) {
            int mod = delta % D;
            if (mod > 0) {
                mod = 1;
            }
            return (delta/D) + mod;
        } else if ( Y == X) {
            return 0;
        }
        
        return 1;
    }
    
    @Override
    public void run() {
        System.out.println(solution(0,900,30));
    }
}