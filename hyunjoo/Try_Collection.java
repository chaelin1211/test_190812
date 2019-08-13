import java.util.ArrayList;
import java.util.HashMap;

public class Try_Collection {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49);
        list2.add(900);
        list2.add(123);
        list2.add(23);
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("str",list);
        hmap.put("integer",list2);
        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
        outlist01 = (ArrayList<Integer>)hmap.get("integer");

        ArrayList<String> outlist02 = new ArrayList<String>();
        outlist02 = (ArrayList<String>)hmap.get("str");

        for(Integer a:outlist01){
            System.out.println("integer:"+ a);
        }
        for(String b:outlist02){
            System.out.println("string:" + b);
        }
    }
}