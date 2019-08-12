public class Try_for02{
    public static void main(String args[]){
        int row, col, num;

        for(row = 1; row < 6; row++){
            for(col = 0; col < 5; col++){
                num = row + col*5;
                System.out.printf(num +" ");
            }
            System.out.printf("\n");
        }
    }
}