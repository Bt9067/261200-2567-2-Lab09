//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();
        Eagle eagle = new Eagle();
        sparrow.fly();
        sparrow.move();

        penguin.move();

        ostrich.move();

        eagle.fly();
        eagle.move();
    }
}