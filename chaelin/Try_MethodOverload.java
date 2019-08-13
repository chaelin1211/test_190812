public class Try_MethodOverload{
    public static void main(String[] args) {
        DisplayOverload displayOverload = new DisplayOverload();
        displayOverload.display("Overloading");
        displayOverload.display("Overloading",3);
        displayOverload.display(5);
    }
}