import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jarod Klion on 4/1/2016.
 */
public class Aquarium {
    private static ArrayList<Fish> School = new ArrayList<Fish>(20);
    private static Fish fish = new Fish();
    private static Random rand = new Random();
    private static int oldAge = 43;
    private static ArrayList<Fish> invisibleChoir = new ArrayList<Fish>();
    private static Shark jaws = new Shark();


    public Aquarium() {
        super();
    }

    public static void fill(int size) {
        for(int i = 0; i < size; i++) {
            School.add(new Fish());
        }
    }

    public static void setAllColor(String color) {
        for (int i = 0; i < School.size(); i++) {
            School.get(i).setColor(color);
        }
    }

    public static void changeColor(int n, String color) {
        School.get(n).setColor(color);
    }

    public static void randomizeAge(int maxAge) {
        for (int i = 0; i < School.size(); i++) {
            School.get(i).setAge(rand.nextInt(maxAge + 1));
        }
    }

    public static void listAttribute() {
        for (int i = 0; i < School.size(); i++) {
            System.out.println("Fish # " + i + " is " + School.get(i).getAge() +
                    " years old, and is " + School.get(i).getColor());

        }
    }

    public static void fatherTime() {
        for (int i = 0; i < School.size(); i++) {
            if (School.get(i).getAge() > oldAge) {
                School.get(i).die();
            }
        }
    }

    public static void listAlive() {
        for (int i = 0; i < School.size(); i++) {
            if(School.get(i).isAlive()) {
                System.out.println("Fish # " + i + " is alive, " + School.get(i).getAge() +
                        " years old, and is " + School.get(i).getColor());
            }
        }
    }

    public static void listDead() {
        for (int i = 0; i < School.size(); i++) {
            if(!School.get(i).isAlive()) {
                System.out.println("Fish # " + i + " is dead, " + School.get(i).getAge() +
                        " years old, and was " + School.get(i).getColor());
            }
        }
    }

    public static void removeDead() {
        for (int i = 0; i < School.size(); i++) {
            if(!School.get(i).isAlive()) {
                invisibleChoir.add(School.get(i));
                School.remove(i);
            }
        }
        invisibleChoir.add(fish);
        invisibleChoir.add(fish);
        invisibleChoir.add(fish);

        for (int i = 0; i < invisibleChoir.size(); i++) {
            invisibleChoir.get(i).die();
        }
    }

    public static void dunDun() {
        for (int i = 0; i < School.size(); i++) {
            if(School.get(i).getColor().equalsIgnoreCase("blue")) {
                jaws.eat(School.get(i));
            }
        }

        School.add((int)(Math.random() * (School.size() - 1)), new Shark());
        School.add((int)(Math.random() * (School.size() - 1)), new Shark());
        School.add((int)(Math.random() * (School.size() - 1)), new Shark());
        School.add((int)(Math.random() * (School.size() - 1)), new Shark());
        School.add((int)(Math.random() * (School.size() - 1)), new Shark());
        invisibleChoir.add((int)(Math.random() * (invisibleChoir.size() - 1)), new Shark());
        invisibleChoir.add((int)(Math.random() * (invisibleChoir.size() - 1)), new Shark());

    }

    public static void sharkOrFish() {
        for (int i = 0; i < School.size(); i++) {
            if (School.get(i) instanceof Shark) {
                System.out.println("SHARK! at position " + i);
            }
            else {
                System.out.println("'twas only a little fishy at " + i);
            }
        }
    }

    public static void main(String[] args) {
        fill(20);
        setAllColor("blue");
        changeColor(7, "green");
        School.add(School.size(), fish);
        School.remove(School.size() - 1);
        Fish nemo = School.get(School.size() - 1);
        changeColor(0, "green");
        changeColor(1, "red");
        changeColor(2, "blue");
        changeColor(4, "orange");
        changeColor(6, "red");
        changeColor(10, "pink");
        changeColor(12, "black");
        changeColor(16, "magenta");
        School.add(0, new Fish());
        School.add((School.size() / 2), new Fish());
        School.add(School.size() - 1, new Fish());
        School.add(School.size() - 1, new Fish());
        System.out.println(School.size());
        randomizeAge(65);
        School.remove(rand.nextInt(School.size()));
        School.remove(rand.nextInt(School.size()));
        School.remove(rand.nextInt(School.size()));
        School.remove(rand.nextInt(School.size()));
        School.remove(rand.nextInt(School.size()));
        listAttribute();
        System.out.println();
        fatherTime();
        listAlive();
        System.out.println();
        listDead();
        removeDead();
        System.out.println();
        dunDun();
        sharkOrFish();
    }
}
