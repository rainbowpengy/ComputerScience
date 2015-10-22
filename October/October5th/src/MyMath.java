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

    public static void main(String args[]) {
        System.out.println("gcf(16, 4) = "+ gcf(16,4));
        System.out.println("gcf(1, 2) = 1 = " + gcf(1, 2));
        System.out.println("gcf(21, 98) = 7 = " + gcf(21, 98));
        System.out.println("gcf(1729, 13) = 13 = " + gcf(1729, 13));
        System.out.println("gcf(1792, 4) = 1 = " + gcf(1729, 2));
    }
}
