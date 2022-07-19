public class Dog extends Animal {


    private boolean isAngry = false;

    Dog(String color, String name, int countLife) {
        this.name = name;
        this.color = color;
        this.countLife = countLife;
    }

    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", countLife=" + countLife +
                '}';
    }

    public Dog(boolean isAngry) {
        this.isAngry = isAngry;
    }

}


