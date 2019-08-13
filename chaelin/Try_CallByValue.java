public class Try_CallByValue {
    static int globalValue = 20;

    public static void main(String[] args) {
        int localValue = 50;
        System.out.println("before change: " + localValue);
        Change x = new Change();
        localValue = x.change(500);
        System.out.println("after change: " + localValue);
        System.out.println("global: " + globalValue);
    }
}

class Change {
    public int change(int data) {
        int returnValue;
        returnValue = data + 100;
        return returnValue;
    }
}
