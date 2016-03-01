package InterfaceLab;

/**
 * Created by s27205053 on 2/26/2016.
 */
public class Bob implements Print, Show {

    public void print() {
        System.out.println(PRINTABLE_STRING);
    }

    public void show() {
        System.out.println(SHOWABLE_STRING);
    }

    public static void main(String[] args) {
        Print p1 = new Bob();
        Show s1 = new Bob();
        Bob bob = new Bob();

        p1.print();
        s1.show();
        bob.print();
        bob.show();
        System.out.println("Hey, that's pretty goooooood!");

        bob = new Bob();
        p1.print();

    }
}
