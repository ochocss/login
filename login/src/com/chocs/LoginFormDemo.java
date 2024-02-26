package com.chocs;

import javax.swing.*;

public class LoginFormDemo {

    public static void main(String[] args) {
        try {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(400,200);
            form.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}