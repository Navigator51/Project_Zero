public class Dog extends Animal {

    String color;
    String name = null;
    int countLife = 1;
    boolean isAngry = false;

    Dog(String color, String name) {
        this.color = color;
    }

    public Dog(boolean isAngry) {
        this.isAngry = isAngry;
    }


}
