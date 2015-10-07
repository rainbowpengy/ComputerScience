/**
 * @author Jarod Klion on 9/4/2015.
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  This program displays a Circle on a white
 *  background.
 */

public class Target extends JPanel
{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.RED);
        g.fillOval(xCenter - 50, yCenter - 50, 100, 100);
        g.setColor(Color.white);
        g.fillOval(xCenter - 37, yCenter - 37, 75, 75);
        g.setColor(Color.red);
        g.fillOval(xCenter - 20, yCenter - 20, 40, 40);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Target Memes");
        window.setBounds(400, 400, 300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Target panel = new Target();
        panel.setBackground(Color.BLACK);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}