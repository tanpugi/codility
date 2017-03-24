package codility;

import codility.lesson01.iterations.BinaryGap;
import codility.lesson02.arrays.CyclicRotation;
import codility.lesson02.arrays.OddOccurencesInArray;
import codility.lesson03.timecomplexity.FrogJmp;
import codility.lesson03.timecomplexity.PermMissingElem;
import codility.lesson03.timecomplexity.TapeEquilibrium;
import codility.lesson04.countingelements.FrogRiverOne;
import codility.lesson04.countingelements.MissingInteger;
import codility.lesson04.countingelements.PermCheck;

public class Runner {

    public static void main(String[] args) throws Exception {
        r(BinaryGap.class);
        r(CyclicRotation.class);
        r(OddOccurencesInArray.class);
        r(FrogJmp.class);
        r(PermMissingElem.class);
        r(TapeEquilibrium.class);
        r(PermCheck.class);
        r(FrogRiverOne.class);
        r(MissingInteger.class);
    }
    
    public static void r(Class<?> rclass) throws Exception {
        Object obj = rclass.getConstructor().newInstance();
        RunnerInterface ri = (RunnerInterface) obj;
        ri.run();
    }
}
