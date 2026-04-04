package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args){

        // creating frame
        JFrame frame = new JFrame("Border Layout");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // set colors
        panel1.setBackground(Color.green);   // NORTH
        panel2.setBackground(Color.red);     // SOUTH
        panel3.setBackground(Color.blue);    // EAST
        panel4.setBackground(Color.black);   // WEST
        panel5.setBackground(Color.yellow);  // CENTER

        // set preferred sizes for NORTH, SOUTH, EAST, WEST
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));

        // add panels to frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}