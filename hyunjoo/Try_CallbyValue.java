public class Try_CallbyValue {
    static int globalValue = 20;

    public static void main(String[] args) {
        int localValue = 50;
        System.out.println("Before change " + localValue);

        Try_CallbyValue try_CallbyValue = new Try_CallbyValue();
        localValue = try_CallbyValue.change(500);

        //localValue = change(500);
        System.out.println("after change " + localValue);
        System.out.println("global " + globalValue);
    }

    public int change(int data) {
        int returnValue;
        returnValue = data + 100;
        return returnValue;
    }
}