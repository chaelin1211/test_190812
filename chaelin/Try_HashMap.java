
import java.util.*;

public class Try_HashMap{
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(12,"Chaitanya");
        hmap.put(2,"bb");
        hmap.put(7, "Singh");
        for(Integer key: hmap.keySet()){
            System.out.println("Key: "+key+" & Value:"+hmap.get(key));
        }
    }
}