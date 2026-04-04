package GUI;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args){

       // JPanel is a GUI component that functions as a container to hold other components

        // label
        JLabel label = new JLabel();
        label.setText("Hello, world");
        label.setVerticalAlignment(JLabel.CENTER);


        //red panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);



        // blue panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);



        // green panel

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);


        JFrame frame = new JFrame("JPanel in Java");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


        redPanel.add(label);

        frame.setVisible(true);



    }
}
