public class Dog extends Animal {

    String color;
    String name = null;
    int countLife  = 1;
    boolean isAngry = false;

    Dog(String color, String name, int countLife) {
        this.name = name;
        this.color = color;
        this.countLife = countLife;
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


