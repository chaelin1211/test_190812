import java.util.Scanner;

public class Test_If{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.printf("User Age: ");
        int user = 15;
        System.out.println(user);
        if(user<19){
            if(user>16&&user<19){
                System.out.println("You are 17 or 18");
            }
            else{
                System.out.println("16 or young");
            }
        }
        //sc.close();
    }
}