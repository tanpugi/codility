package codility;

import codility.lesson01.iterations.BinaryGap;
import codility.lesson02.arrays.CyclicRotation;
import codility.lesson02.arrays.OddOccurencesInArray;
import codility.lesson03.timecomplexity.FrogJmp;
import codility.lesson03.timecomplexity.PermMissingElem;
import codility.lesson03.timecomplexity.TapeEquilibrium;

public class Runner {

    public static void main(String[] args) {
        new BinaryGap().run();
        new CyclicRotation().run();
        new OddOccurencesInArray().run();
        new FrogJmp().run();
        new PermMissingElem().run();
        new TapeEquilibrium().run();
    }
}
