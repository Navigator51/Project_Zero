class Cat extends Animal {

    private String breed = null;



    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Cat(String color, String name, String breed) {
        this.color = color;
        this.name = name;
        this.breed = breed;
    }

    public Cat(String name, String breed, int countLife) {
        this.name = name;
        this.breed = breed;
        this.countLife = countLife;
    }



    public static Dog toDog(Cat cat) {
        return new Dog(cat.getColor(), cat.getName(), cat.getCountLife()/3);
    }

}
