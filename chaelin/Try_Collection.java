import java.util.ArrayList;
import java.util.HashMap;

public class Try_Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(33);
        list2.add(44);
        list2.add(55);
        HashMap<Object, ArrayList> hmap = new HashMap<Object, ArrayList>();
        hmap.put("str", list);
        hmap.put("integer", list2);
        ArrayList<Integer> outlist01 = hmap.get("integer");
        ArrayList<String> outlist02 = hmap.get("str");
        for (Object x:outlist01) {
            System.out.println(x);
        }
        for (Object x:outlist02) {
            System.out.println(x);
        }

    }
}