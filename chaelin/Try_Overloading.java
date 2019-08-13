public class Try_Overloading {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.print(2, 2);
    }
}

class Calc {
    public int Addition(int x, int y) {
        return x + y;
    }

    public int Subtraction(int x, int y) {
        return x - y;
    }

    public int Multiplication(int x, int y) {
        return x * y;
    }

    public int Division(int x, int y) {
        return x / y;
    }

    public void print(int x, int y) {
        System.out.println("Enter: " + x + " " + y);
        System.out.println("Addition: " + Addition(x, y));
        System.out.println("Subtraction: " + Subtraction(x, y));
        System.out.println("Multiplication: " + Multiplication(x, y));
        System.out.println("Division: " + Division(x, y));
    }
}