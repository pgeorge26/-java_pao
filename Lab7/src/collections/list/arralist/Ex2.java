package collections.list.arralist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

    public static void main (String[] args) {

        ArrayList<Integer> ints = new ArrayList<>(20); //default is 10
        ints.add(1);
        ints.add(1);
        ints.add(1);
        ints.add(1);
        System.out.println(ints);
        ints.add(1,5);
        ints.set(0,10);
        System.out.println(ints);

        System.out.println(ints.indexOf(1));
        System.out.println(ints.lastIndexOf(1));
        ints.remove(1);
        System.out.println(ints);
        ints.remove(Integer.valueOf(1));
        System.out.println(ints);

        List<Integer> subList = new ArrayList<>();
        subList = ints.subList(0,ints.size());
        System.out.println(subList);

    }
}
