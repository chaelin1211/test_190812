public class Try_Overloading {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;

        Try_Overloading try_Overloading = new Try_Overloading();
        int add= try_Overloading.addition(num1, num2);
        int sub= try_Overloading.subtraction(num1, num2);
        int mul= try_Overloading.multiplication(num1, num2);
        int div= try_Overloading.division(num1, num2);

        try_Overloading.print(add,sub,mul,div);
    }

    public int addition(int par1, int par2) {
        return par1 + par2;
    }
    public int subtraction(int par1, int par2) {
        return par1 - par2;
    }
    public int multiplication(int par1, int par2) {
        return par1 * par2;
    }
    public int division(int par1, int par2) {
        return par1 / par2;
    }
    public void print(int add_result,int sub_result,int mul_result,int div_result){
        System.out.println("Enter : 2 2");
        System.out.println("Addition : " + add_result);
        System.out.println("Subtraction : " + sub_result);
        System.out.println("Multiplicaion : " + mul_result);
        System.out.println("Division : " + div_result);
    }
}