/**
 * @author Jarod Klion on 2/22/2016.
 */
public class CreditCard {
    public static boolean validateNumber(String number) {
        int sum = 0;
        String number2 = number.replaceAll("\\s", "");
        if (number2.matches("[0-9]+")) {
            for (int i = 0; i < number2.length(); i++) {
                int current = Integer.parseInt(number2.substring(i, i + 1));

                if (i % 2 == 0) {
                    current *= 2;

                    if (current > 9) {
                        current = (current / 10) + (current % 10);
                    }
                }
                sum += current;
            }

            int total = sum % 10;
            if (total == 0) {
                return true;
            } else {
                return false;
            }
        }
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(validateNumber("4556321267848125"));
        System.out.println(validateNumber("4175007270596881"));
        System.out.println(validateNumber("111 111 111 111"));
        System.out.println(validateNumber("4556 3212 6784 8125"));
        System.out.println(validateNumber("This is a credit test"));
        System.out.println(validateNumber("0000000000000000a"));
    }
}