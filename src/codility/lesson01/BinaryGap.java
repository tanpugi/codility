package codility.lesson01;

import codility.RunnerInterface;

public class BinaryGap implements RunnerInterface {
    public int solution(int N) {
        String binStr = Integer.toBinaryString(N);
        char[] binArr = binStr.toCharArray();

        char binLast = '1';
        boolean countOn = false;
        int count = 0;
        int countLast = 0;
        for (char bin : binArr) {
            if (isXOR(binLast, bin)) {
                countOn = !countOn;
            }
            binLast = bin;

            if (countOn) {
                count++;
            } else {
                if (countLast < count) {
                    countLast = count;
                }
                count = 0;
            }
        }
        return countLast;
    }
    
    private boolean isXOR(char c1, char c2) {
        return (c1 ^ c2) == 1;
    }
    
    @Override
    public void run() {
        int N = 999999999;
        int x = solution(N);
        System.out.println(x);
    }
}