
/**
 * Write a description of class IndexEntry here.
 *
 * @author Jarod Klion
 * @version 0.0.1
 */
import java.util.ArrayList;

public class IndexEntry
{
    // instance variables - replace the example below with your own
    private String word;
    private ArrayList<Integer> lineNums;

    /**
     * Constructor for objects of class IndexEntry
     */
    public IndexEntry(String word)
    {
        // initialise instance variables
        this.word = word.toUpperCase();
        lineNums = new ArrayList<Integer>();

    }

    public void add(int line)
    {
        Integer x = new Integer(line);
        if (!lineNums.contains(x))
            lineNums.add(x);
    }

    public String getWord()
    {
        return word;
    }

    public String toString()
    {
        String s = word;
        String delimiter = " ";
        for (Integer line: lineNums)
        {
            s +=delimiter + line;
            delimiter = ", ";
        }

        return s;
    }

}
