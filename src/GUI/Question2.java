package GUI;

import javax.swing.*;

public class Question2 {
    public  static void main(String[] args){

// write a program to create a form with employee id, name, salary fields and two buttons add and cancel using appropriate components.

        // Create frame
        JFrame frame = new JFrame("Employee Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels
        JLabel idLabel = new JLabel("Employee ID:");
        idLabel.setBounds(50, 50, 100, 30);
        frame.add(idLabel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 90, 100, 30);
        frame.add(nameLabel);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(50, 130, 100, 30);
        frame.add(salaryLabel);

        // Text fields
        JTextField idField = new JTextField();
        idField.setBounds(160, 50, 150, 30);
        frame.add(idField);

        JTextField nameField = new JTextField();
        nameField.setBounds(160, 90, 150, 30);
        frame.add(nameField);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(160, 130, 150, 30);
        frame.add(salaryField);

        // Buttons
        JButton addButton = new JButton("Add");
        addButton.setBounds(80, 180, 100, 30);
        frame.add(addButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(200, 180, 100, 30);
        frame.add(cancelButton);

        // Add button action
        addButton.addActionListener(e -> {
            String empId = idField.getText();
            String name = nameField.getText();
            String salary = salaryField.getText();

            // Simple validation
            if (empId.isEmpty() || name.isEmpty() || salary.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields!");
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Employee Added:\nID: " + empId + "\nName: " + name + "\nSalary: " + salary);
                // Clear fields after adding
                idField.setText("");
                nameField.setText("");
                salaryField.setText("");
            }
        });

        // Cancel button action
        cancelButton.addActionListener(e -> {
            idField.setText("");
            nameField.setText("");
            salaryField.setText("");
        });

        frame.setVisible(true);


    }
}
