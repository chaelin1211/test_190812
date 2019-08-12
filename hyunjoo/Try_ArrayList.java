public class Try_ArrayList{
    public static void main(String args[]){
        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        System.out.printf("The arraylist contains elements:" +list +"\n");
        int pos = list.indexOf("item2");
        System.out.printf("The index of item2 is:" + pos +"\n");
        System.out.printf("Checking i empty:" + list.isEmpty() +"\n");
        int size = list.size();
        System.out.printf("Checking is empty:" +size +"\n");

        for(int i=0; i<list.size(); i++){
            System.out.printf("Index:" +i+ "-item:" + list.get(i) +"\n");
        }
    }
}