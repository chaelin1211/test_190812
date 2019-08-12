public class Try_for{
    public static void main(String[] args) {
        int row,col;
        System.out.println("#1");
        for(row=1;row<6;row++){
            int term=0;
            for(col=0;col<5;col++){
                System.out.printf(row+term+"\t");
                term+=5;
            }
            System.out.println();
        }
        System.out.println("#2");
        for(row=0;row<7;row++){
            int term=0;
            for(col=0;col<5;col++){
                if(row==0||row==6){
                    System.out.printf("~");
                }
                else if(col==0||col==4){
                    System.out.printf("!");
                }
                else {
                    System.out.printf(row + term+"");
                    term+=5;
                }
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}