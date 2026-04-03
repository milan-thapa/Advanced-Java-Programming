package GUI;
import  java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class JFrameExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFrame"); // creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420);  // sets the width and height of frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("milan-logo.png"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame


        frame.getContentPane().setBackground(new Color(0,0,0)); // change color of background
    }
}