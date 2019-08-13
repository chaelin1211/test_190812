public class Try_inheritance{
    public static void main(String[] args) {
        Animal b = new Dog();
        b.move();
    }
}
class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
    public int getStep(){
        return 10;
    }
}

class Dog extends Animal{
    public void move(){
        super.move();
        int j = super.getStep()+10;
        System.out.println("Dogs can walk and run step "+j);
    }
}