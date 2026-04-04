package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutManager {
    public  static void main(String[] args){


        // Layout Manager  = Defines the natural layout for components within a container

        // FlowLayout = Places components in a row, sized at their prefered size.if the horizontal space in the container is too small, the FlowLayout class uses the next available row.

        JFrame frame = new JFrame("Layout Manager - Float Layout");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        // buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");




        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);


        frame.setVisible(true);

    }
}
