public class Try_for_char{
    public static void main(String args[]){
        int row, col, num;

        System.out.printf("~ ~ ~ ~ ~\n");

        for(row = 1; row < 6; row++){
            System.out.printf("! ");
            for(col = 0; col < 3; col++){
                num = row + col*5;
                System.out.printf(num +" ");
            }
            System.out.printf("!"+"\n");
        }
        System.out.printf("~ ~ ~ ~ ~");
    }
}