package GUI;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelExample {
    public static void main(String[] args){


        // JLabel is a GUI display area for a string of text , an image, or both

        ImageIcon image = new ImageIcon("milan-logo.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // create a label
        label.setIcon(image);
        label.setText("Hello, world"); // set text to a label

        label.setHorizontalTextPosition(JLabel.CENTER); // set text Left , Centre and Right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center bottom of image icon

        label.setForeground(Color.green); // set color of text
        label.setFont(new Font("Poppins",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(50); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set boarder of lable (not image and text)
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text with label
        label.setBounds(100,100,250,250); // set x and y position within frame as well as dimensions


        JFrame frame = new JFrame("Lables");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.add(label);
    }
}
