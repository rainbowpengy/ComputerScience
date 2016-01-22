/**
 * @author Jarod Klion on 1/15/2016.
 */
public class Coins {

    private final int cents;
    private static int pennies = 1;
    private static int nickels = 5;
    private static int dimes = 10;
    private static int quarters = 25;

    public Coins(int cents) {
        this.cents = cents;
    }


    public int getQuarters() {
        int tempQuarters = cents/quarters;
        return tempQuarters;
    }

    public int getDimes() {
        int tempDimes = (cents - getQuarters() * 25) / dimes;
        return tempDimes;
    }

    public int getNickels() {
        int tempNickels = (cents - (getQuarters() * 25) - (getDimes() * 10)) / nickels;
        return tempNickels;
    }

    public int getPennies() {
        int tempPennies = (cents - (getQuarters() * 25) - (getDimes() * 10) - (getNickels() * 5)) / pennies;
        return tempPennies;
    }

    public String toString() {
        return cents + " cents" + " = " + getQuarters() + "q " + getDimes()+ "d " + getNickels() + "n " + getPennies() + "p";
    }
}