/**
 * @author Jarod Klion on 9/25/2015.
 */
public class Animal {
    public Animal() {
    }
        private static void move() {
            System.out.println("Animals move!");
        }
        private static void speak() {
            System.out.println("Animals speak!");
        }
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog snoop = new Dog();
        HoundDawg droopy = new HoundDawg();
        a.move();
        a.speak();
        snoop.speak();
        snoop.move();
        droopy.move();
        droopy.speak();
    }
}
