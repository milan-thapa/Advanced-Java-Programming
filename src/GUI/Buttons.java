package GUI;

import javax.swing.*;
import java.awt.*;

public class Buttons {
    public static void main(String[] args){

        JFrame frame = new JFrame("Buttons");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(150, 200, 200, 100);
        button.setBackground(Color.black); // background
        button.setForeground(Color.white);  // text
        button.setFont(new Font("Arial", Font.PLAIN, 24)); // font size
        button.setOpaque(true);            // make background visible
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);

        button.addActionListener(e -> {
            System.out.println("Button clicked!");
        });

        frame.add(button);
        frame.setVisible(true);
    }
}