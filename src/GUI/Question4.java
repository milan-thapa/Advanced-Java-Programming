package GUI;

import javax.swing.*;
import java.awt.*;

public class Question4 {
    public static void main(String[] args){
        // Create frame
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add items to menu
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);

        // Add menu bar to frame
        frame.setJMenuBar(menuBar);

        // ---------------- EVENT HANDLING ----------------

        newItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "New File Created");
        });

        saveItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "File Saved");
        });

        exitItem.addActionListener(e -> {
            System.exit(0); // closes program
        });

        // Show frame
        frame.setVisible(true);
    }
}
