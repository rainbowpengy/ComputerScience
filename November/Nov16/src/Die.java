/**
 * @author Jarod Klion on 11/18/2015.
 */
public class Die {
    private int numDots;

    public Die() {
        roll();
    }

    public void roll() {
        numDots = (int) (1 + Math.random() * 6);
    }

    public int getNumDots() {
        return numDots;
    }
}
