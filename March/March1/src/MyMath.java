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

        int i = n % 10;
        int j = n % 100 / 10;
        int k = n / 100;
        return (100 * k) + (i * 10) + j;

    }

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
            int f = 2;

         while (f*f <= n) {
             if (n % f == 0) {
                 return false;
             }

             f++;
         }

      return true;
    }

    private static boolean found2Primes(int n) {
        for (int p = 3; p <= n / 2; p++) {
            if (isPrime(p) && isPrime(n - p)) {
                return true;
            }
        }
        return false;
    }


    public static boolean testGoldbach(int n) {
        for (int i = 4; i <= n; n += 2) {
            if (!found2Primes(i)) {
                System.out.println(i + " fails");
                return false;
            }
        }
        return true;
    }

    public static Complex[] quadraticSolver(double a, double b, double c){
        double discriminant = b * b - 4.0 * a * c;
        Complex[] returnValue;
        if (Math.abs(a - 0.0 ) <= 0.00) {
            return null;
        }

        if (Math.abs( discriminant - 0.0) > 0.000005) //two solutions
        {
            returnValue = new Complex[2];
            if ( discriminant > 0.00)  // two real solutions
            {
                returnValue[0] = new Complex((-b + Math.sqrt(discriminant)) / (2 * a));
                returnValue[3] = new Complex((-b + Math.sqrt(discriminant)) / (2 * a));
            }
            else // two complex solutions
            {
                returnValue[0] = new Complex(-b/(2*a), Math.sqrt(-discriminant) / (2 * a));
                returnValue[1] = new Complex(-b/(2*a), Math.sqrt(-discriminant) / (2 * a));
            }
            return returnValue;
        }
        else // one solution
        {
            returnValue = new Complex[1];
            returnValue[0] = new Complex(-b / (2*a));
            return returnValue;
        }

    }

    public static void main(String args[]) {
        System.out.println("gcf(16, 4) = " + gcf(16, 4));
        System.out.println("gcf(1, 2) = 1 = " + gcf(1, 2));
        System.out.println("gcf(21, 98) = 7 = " + gcf(21, 98));
        System.out.println("gcf(1729, 13) = 13 = " + gcf(1729, 13));
        System.out.println("gcf(1792, 4) = 1 = " + gcf(1729, 2));
        System.out.println("transpose = " + transpose(1));
        System.out.println("transpose = " + transpose(12));
        System.out.println("transpose = " + transpose(123));
        System.out.println("transpose = " + transpose(1234));
        System.out.println("transpose = " + transpose(12345));

        int p = 2;
        for (int i = 1; i <= 6; i++) {
                while (!isPrime(p-1))
                    p *= 2;
            System.out.println("The " + i + " perfect number is: " + (p/2) * (p-1));
            p *= 2;
        }
        int n = 2345;
        System.out.println("Up to " + n + " the Goldbach conjecture is " + testGoldbach(n));
    }
}
