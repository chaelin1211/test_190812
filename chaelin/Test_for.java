public class Test_for{
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            System.out.println("i is "+i);
        }
        for(i=0;i<5;i++){
            for(j=0;j<2;j++)
            System.out.println("i is "+i+" and j is "+j);
        }
        String [] names = {"James","John","Martin"};
        for(String name:names){
            System.out.println("name: "+name);
        }
    }
}