import java.util.ArrayList;
import otherpackage.Fruits;

public class JWEOuterClass {
    public static void main(String[] args){
        ArrayList<Fruits>mFruitsList= new ArrayList<Fruits>();
        mFruitsList.add(new Fruits("Good Fruits"));
        mFruitsList.add(new Fruits("Bad Fruits"));
        for(Fruits t :mFruitsList){ System.out.println("fruit: " + mFruitsList);}
    }
}