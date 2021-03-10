public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Gwin", 50), new Cat("Cherch", 50), new Cat("Rizhuleta", 25), new Cat("Kot", 5), new Cat("Uzh", 1)};
        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}

