import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Try_HashMap{
    public static void main(String args[]){
        HashMap<Integer, String> hmap = new HashMap<Integer,String>();
        hamp.put(12,"Chaitanya");
        hmap.put(2,"Rahul");
        hmap.put(7, "Singh");
        hamp.put(49,"Ajeet");
        hamp.put(3,"Anuj");

        for(Integer key:hmap.keySet()){
            System.out.printf("key:" + key + "&Value:" + hmap.get(key));
        }
    }
}