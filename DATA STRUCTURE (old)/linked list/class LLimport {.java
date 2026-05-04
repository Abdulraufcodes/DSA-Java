import java.util.*;

class LLimport {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is"); //you need to specify first
        list.addFirst("this");
        System.out.println(list);

        list.addLast("a");
        list.add("list"); //works same as addlast
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++) { //loop on linkedlist
            System.out.print(list.get(i) + " -> "); //all other function also exist in linkedlist
        }
        System.out.println("null");
    }
}