public class Animal {

    String color = "green";
    String name = "Bob";
    static int countLife;

    public  String getColor() {
        return color;
    }

    public  String getName() {
        return name;
    }

    public int getCountLife() {
        return countLife;
    }

    public void setCountLife(int countLife) {

        this.countLife = countLife;
    }
}
