
import java.util.ArrayList;

public class Try_SetGet{
    public static void main(String[] args) {
        ArrayList<Fruits> FruitsList = new ArrayList<Fruits>();
        FruitsList.add(new Fruits("Good Fruits"));
        FruitsList.add(new Fruits("Bad Fruits"));
        System.out.println("fruit: "+FruitsList);
    }
}