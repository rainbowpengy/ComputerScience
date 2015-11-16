/**
 * @author Jarod Klion on 10/1/2015.
 */
public class MyMath {
    public static int gcf_l(int a, int b) {
        while (a!= b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public static int addSquares(int a, int b){
        return ((a*a) + (b*b));
    }

    public static int gcf(int a, int b) {
        return gcf_r(a, b);
    }

    public static int gcf_r(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcf_r(a - b, b);
        }
        else {
            return gcf_r(a, b - a);
        }
    }

    public static int transpose(int n) {
        if (n < 10) {
            return (n*10);
        }

        else {

            int i = n % 10;
            int j = n % 100 / 10;
            int k = n / 100;
            return (100 * k) + (i * 10) + j;

        }

    }

    public static void main(String args[]) {
        System.out.println("gcf(16, 4) = "+ gcf(16,4));
        System.out.println("gcf(1, 2) = 1 = " + gcf(1, 2));
        System.out.println("gcf(21, 98) = 7 = " + gcf(21, 98));
        System.out.println("gcf(1729, 13) = 13 = " + gcf(1729, 13));
        System.out.println("gcf(1792, 4) = 1 = " + gcf(1729, 2));
        System.out.println("transpose = " + transpose(12));
        System.out.println("transpose = " + transpose(123));
        System.out.println("transpose = " + transpose(1234));
        System.out.println("transpose = " + transpose(12345));

    }
}
