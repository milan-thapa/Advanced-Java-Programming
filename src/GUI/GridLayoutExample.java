package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public static void main(String[] args){



        // Grid Layout = Places components in a grid of cells. each components takes all the available spaces within its cell, and each cell is the same size.

        JFrame frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,2,10,10));

         JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");




        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);





        frame.setVisible(true);

    }






}
