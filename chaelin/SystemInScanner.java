import java.io.IOException;
import java.util.*;

public class SystemInScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter the first character> \n");
        int ch = sc.nextInt();
        System.out.printf("After conversion: " + ch);
        sc.close();
    }
}