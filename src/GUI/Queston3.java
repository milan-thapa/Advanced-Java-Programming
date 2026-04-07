package GUI;


import javax.security.auth.login.AccountExpiredException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Queston3 {
    public static void main(String[] args){

        // Create frame
        JFrame frame = new JFrame("BorderLayout Example - Simple Calculator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(5, 5)); // 5 px gaps

        // ---------------- NORTH PANEL ----------------
        JPanel northPanel = new JPanel();
        JLabel headerLabel = new JLabel("Simple Calculator", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        northPanel.add(headerLabel);
        frame.add(northPanel, BorderLayout.NORTH);

        // ---------------- EAST PANEL ----------------
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(4, 1, 5, 5)); // 4 buttons in column

        // Create buttons with icons (use default icons from UIManager for simplicity)
        JButton btn1 = new JButton("Button 1", UIManager.getIcon("OptionPane.informationIcon"));
        JButton btn2 = new JButton("Button 2", UIManager.getIcon("OptionPane.warningIcon"));
        JButton btn3 = new JButton("Button 3", UIManager.getIcon("OptionPane.errorIcon"));
        JButton btn4 = new JButton("Button 4", UIManager.getIcon("OptionPane.questionIcon"));

        eastPanel.add(btn1);
        eastPanel.add(btn2);
        eastPanel.add(btn3);
        eastPanel.add(btn4);

        frame.add(eastPanel, BorderLayout.EAST);

        // ---------------- CENTER PANEL ----------------
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null); // we can use absolute positioning for simplicity

        // Labels
        JLabel lblNum1 = new JLabel("First Number:");
        lblNum1.setBounds(50, 30, 100, 25);
        centerPanel.add(lblNum1);

        JLabel lblNum2 = new JLabel("Second Number:");
        lblNum2.setBounds(50, 70, 100, 25);
        centerPanel.add(lblNum2);

        JLabel lblResult = new JLabel("Result:");
        lblResult.setBounds(50, 110, 100, 25);
        centerPanel.add(lblResult);

        // Text fields
        JTextField tfNum1 = new JTextField();
        tfNum1.setBounds(160, 30, 120, 25);
        centerPanel.add(tfNum1);

        JTextField tfNum2 = new JTextField();
        tfNum2.setBounds(160, 70, 120, 25);
        centerPanel.add(tfNum2);

        JTextField tfResult = new JTextField();
        tfResult.setBounds(160, 110, 120, 25);
        tfResult.setEditable(false);
        centerPanel.add(tfResult);

        // Buttons
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(50, 160, 80, 30);
        centerPanel.add(addBtn);

        JButton subBtn = new JButton("Subtract");
        subBtn.setBounds(140, 160, 100, 30);
        centerPanel.add(subBtn);

        JButton mulBtn = new JButton("Multiply");
        mulBtn.setBounds(250, 160, 100, 30);
        centerPanel.add(mulBtn);

        JButton divBtn = new JButton("Divide");
        divBtn.setBounds(360, 160, 100, 30);
        centerPanel.add(divBtn);

        // Add center panel to frame
        frame.add(centerPanel, BorderLayout.CENTER);

        // ---------------- EVENT HANDLING ----------------
        addBtn.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = n1 + n2;
                tfResult.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        subBtn.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = n1 - n2;
                tfResult.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        mulBtn.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = n1 * n2;
                tfResult.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        divBtn.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                } else {
                    double res = n1 / n2;
                    tfResult.setText(String.valueOf(res));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        // Make frame visible
        frame.setVisible(true);

    }
}
