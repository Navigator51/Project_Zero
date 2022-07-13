public class Cat extends Animal {

    String порода = null;
    static String color = "blue";
    static String name = null;
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

    public static String getColor(Cat cat) {
        return color;
    }

    public static String getName(Cat cat) {
        return name;
    }

    public static Dog toDog(Cat cat) {
        Dog dog = new Dog(cat.getColor(cat), cat.getName(cat));
        return dog;
    }

}
