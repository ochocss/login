package com.chocs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

class LoginForm extends JFrame implements ActionListener {

    private static final HashMap<String, String> user = new HashMap<>();
    static {
        user.put("username", "password");
        user.put("osaka", "osaka1234");
    }

    JButton submitButton;
    JButton newUserButton;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    JTextField usernameField;
    JPasswordField passwordField;

    LoginForm() {
        userLabel = new JLabel();
        userLabel.setText("Username");

        usernameField = new JTextField(15); // username

        passLabel = new JLabel();
        passLabel.setText("Password");

        passwordField = new JPasswordField(15); // password

        submitButton = new JButton("Submit");
        newUserButton = new JButton("Create New User");

        newPanel = new JPanel(new GridLayout(3, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        newPanel.add(userLabel);
        newPanel.add(usernameField);

        newPanel.add(passLabel);
        newPanel.add(passwordField);

        newPanel.add(submitButton);
        newPanel.add(newUserButton);

        setTitle("Login");
        newPanel.setVisible(true);

        add(newPanel, BorderLayout.CENTER);

        submitButton.addActionListener(this);
        newUserButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = usernameField.getText(); //get username
        String passValue = String.valueOf(passwordField.getPassword()); //get password

        if(ae.getSource() == newUserButton) {
            user.put(userValue, passValue);

            usernameField.setText("");
            passwordField.setText("");

            return;
        }

        if(loginVerify(userValue, passValue)) {
            new NewPage(userValue);
        } else {
            System.out.println("Please enter a valid username and password.");
        }
    }

    private boolean loginVerify(String username, String password) {
        return password.equals(user.get(username));
    }
}
