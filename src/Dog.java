public class Dog extends Animal {

    String color;
    String name = null;

    boolean isAngry = false;

    Dog(String color, String name) {

        this.color = color;
    }

    public Dog(boolean isAngry) {
        this.isAngry = isAngry;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getCountLife() {
        return countLife;
    }

    @Override
    public void setCountLife(int countLife) {

        this.countLife = countLife;
    }
}


