public class Dog extends Animal {

    static String color = "green";
    String name = null;
    int countLife = 1;
    boolean isAngry = false;

    Dog(String color, String name) {
        this.color = color;
    }

    public Dog(boolean isAngry) {
        super();
        this.isAngry = isAngry;
    }

    public static String getColor(Dog dog) {
        return color;
    }
    public int getCountLife(Dog dog){
        return countLife;
    }

    public void setCountLife(int countLife) {
        this.countLife = countLife;
    }
}
