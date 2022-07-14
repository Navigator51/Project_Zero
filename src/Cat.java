public class Cat extends Animal {


    String порода = null;

    String color = "blue";
    String name = null;
    int countLife = 9;

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Cat(String color, String name, String порода) {
        this.color = color;
        this.name = name;
        this.порода = порода;
    }

    public Cat(String name, String порода, int countLife) {
        this.name = name;
        this.порода = порода;
        this.countLife = countLife;
    }



    public static Dog toDog(Cat cat) {
        Dog dog = new Dog(cat.getColor(), cat.getName());
        return dog;
    }

}