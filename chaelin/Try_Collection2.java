import java.util.ArrayList;
import java.util.HashMap;

public class Try_Collection2 {
    public static void main(String[] args) {
        ArrayList<String> Fruit = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> Numbers = new ArrayList<ArrayList<Integer>>();
        Fruit.add("Mango");
        Fruit.add("Apple");
        Fruit.add("Banana");
        Fruit.add("Melon");

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(67);
        list2.add(3);
        list2.add(6);
        list2.add(7);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(7);
        list3.add(4);
        list3.add(77);
        list3.add(12);
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(71);
        list4.add(74);
        list4.add(61);
        list4.add(11);

        Numbers.add(list1);
        Numbers.add(list2);
        Numbers.add(list3);
        Numbers.add(list4);

        HashMap<String, ArrayList> hmap = new HashMap<String, ArrayList>();
        for (int i = 0; i < Fruit.size(); i++) {
            hmap.put(Fruit.get(i), Numbers.get(i));
        }
        
        ArrayList<Integer> outlist;
        for (String Key : hmap.keySet()) {
            System.out.printf(Key + ": ");
            outlist = (ArrayList<Integer>) hmap.get(Key);
            for (int i = 0; i < outlist.size(); i++) {
                System.out.printf(" " + outlist.get(i));
                if (i == outlist.size()-1)
                    System.out.println();
                else
                    System.out.printf(",");
            }
        }
    }
}
