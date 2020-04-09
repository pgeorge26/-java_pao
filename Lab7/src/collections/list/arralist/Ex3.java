package collections.list.arralist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer>ints = Arrays.asList(2,0,4,55,6,1,8,5,10);
        System.out.println(ints);

        Object[] arrayOfInt = ints.toArray();
        //Collections.sort(ints);
        ///System.out.println(ints);
        System.out.println(Collections.binarySearch(ints, 4));
    }
}
