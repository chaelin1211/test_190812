import java.util.ArrayList;
import java.util.HashMap;

public class Try_Collection02{
    public static void main(String args[]){
        ArrayList<String> fruit_list = new ArrayList<String>();
        fruit_list.add("Mango");
        fruit_list.add("Apple");
        fruit_list.add("Banana");
        fruit_list.add("Melon");
        ArrayList<Integer> list01 = new ArrayList<Integer>();
        list01.add(39);
        list01.add(20);
        list01.add(30);
        list01.add(12);
        list01.add(40);
        ArrayList<Integer> list02 = new ArrayList<Integer>();
        list02.add(48);
        list02.add(20);
        list02.add(10);
        list02.add(32);
        ArrayList<Integer> list03 = new ArrayList<Integer>();
        list03.add(99);
        list03.add(23);
        list03.add(123);
        ArrayList<Integer> list04 = new ArrayList<Integer>();
        list04.add(49);
        list04.add(22);
        list04.add(45);
        list04.add(12);

        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("str",fruit_list);
        hmap.put("integer01",list01);
        hmap.put("integer02",list02);
        hmap.put("integer03",list03);
        hmap.put("integer04",list04);
        ArrayList<String> names = new ArrayList<String>();
        names = (ArrayList<String>)hmap.get("str");

        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
        outlist01 = (ArrayList<Integer>)hmap.get("integer01");

        ArrayList<Integer> outlist02 = new ArrayList<Integer>();
        outlist02 = (ArrayList<Integer>)hmap.get("integer02");

        ArrayList<Integer> outlist03 = new ArrayList<Integer>();
        outlist03 = (ArrayList<Integer>)hmap.get("integer03");

        ArrayList<Integer> outlist04 = new ArrayList<Integer>();
        outlist04 = (ArrayList<Integer>)hmap.get("integer04");

        for(String name:names){
            for(int i=0; i < outlist01.size(); i++){
                System.out.println(name + ":" + outlist01);
            }
        }
    }
}