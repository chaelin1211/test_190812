import java.util.*;

public class Try_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        System.out.println("The arraylist contains element: " + list);
        int pos = list.indexOf("Item3");
        System.out.println("The index of item2: " + pos);
        System.out.println("Checking is empty: " + list.isEmpty());
        int size = list.size();
        System.out.println("The size of the list is " + size);
        for (int i = 0; i < size; i++) {
            System.out.println("Index: " + i + " & Item: " + list.get(i));
        }
    }
}