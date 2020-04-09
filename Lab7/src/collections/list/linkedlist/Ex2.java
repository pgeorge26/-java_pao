package collections.list.linkedlist;

import java.util.LinkedList;
// head ............ tail
public class Ex2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.offer("c"); //adauga in tail
        list.offerFirst("Rr");

        System.out.println(list.element()); //elementul din head

        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
    }
}
