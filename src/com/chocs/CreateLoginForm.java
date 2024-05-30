package com.chocs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CreateLoginForm extends JFrame implements ActionListener {

    JButton button;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    JTextField textField1;
    JPasswordField textField2;

    CreateLoginForm() {
        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15); // username

        passLabel = new JLabel();
        passLabel.setText("Password");

        textField2 = new JPasswordField(15); // password

        button = new JButton("Submit");

        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(button);

        setTitle("Login");
        newPanel.setVisible(true);

        add(newPanel, BorderLayout.CENTER);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText(); //get username
        String passValue = String.valueOf(textField2.getPassword()); //get password

        if (loginVerify(userValue, passValue)) {
            NewPage page = new NewPage();

            page.setVisible(true);

            JLabel welLabel = new JLabel("Welcome " + userValue);
            page.getContentPane().add(welLabel);
        }
        else {
            System.out.println("Please enter a valid username and password.");
        }
    }

    private boolean loginVerify(String username, String password) {
        if(username.equals("manoel gomes") && password.equals("wellinto")) {
            return true;
        } else if (username.equals("osaka") && password.equals("osaka1234")) {
            return true;
        } else
            return false;
    }
}
