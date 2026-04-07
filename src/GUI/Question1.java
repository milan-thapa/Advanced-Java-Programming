package GUI;

import javax.swing.*;
import java.awt.event.*;

public class Question1 {

    public static void main(String[] args){

        // creating a frame
        JFrame frame = new JFrame("Sum of Two Numbers");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels
        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(50,50,100,30);
        frame.add(label1);

        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(50,100,120,30);
        frame.add(label2);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50,200,100,30);
        frame.add(resultLabel);

        // Text Fields
        JTextField text1 = new JTextField();
        text1.setBounds(180,50,120,30);
        frame.add(text1);

        JTextField text2 = new JTextField();
        text2.setBounds(180,100,120,30);
        frame.add(text2);

        JTextField resultField = new JTextField();
        resultField.setBounds(180,200,120,30);
        resultField.setEditable(false);
        frame.add(resultField);

        // Button
        JButton button = new JButton("Add");
        button.setBounds(130,150,100,30);
        frame.add(button);

        // Button Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int sum = num1 + num2;
                    resultField.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
                }
            }
        });

        frame.setVisible(true);
    }
}