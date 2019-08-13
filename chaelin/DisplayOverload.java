public class DisplayOverload {
    public void display(String str) {
        System.out.println("One Parameter: " + str);
    }

    public void display(String str, int num) {
        System.out.println("Two Parameter: " + str + ", " + num);
    }

    public void display(int num) {
        System.out.println("One Parameter: " + num);
    }
}