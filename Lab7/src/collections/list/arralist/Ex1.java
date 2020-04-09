package collections.list.arralist;

import java.util.ArrayList;
import java.util.List;

// list ,set ,queue
public class Ex1 {
    public static void main(String[] args) {

        List bulklist = new ArrayList();
        bulklist.add(1);
        bulklist.add("two");
        bulklist.add(new Object());
        System.out.println(bulklist);

        List<String> list1 = new ArrayList<>();
        System.out.println(list1.isEmpty());
        list1.add("one");
        list1.add("two");
        list1.add(0,"111");
        list1.add(1,"1");
        System.out.println(list1);

        if(list1.contains("one")){
            System.out.println(list1.remove(0));
            System.out.println(list1.remove("two"));

            List<String> list2 = new ArrayList<>(list1);
            System.out.println("list2 created" +list2);
            list2.addAll(list2);
            System.out.println(list2);
            list2.addAll(1,list2);
            System.out.println(list2);
            list2.add("last element");

            list2.removeAll(list1);
            System.out.println("after remove all" + list2);

        }
    }


}
