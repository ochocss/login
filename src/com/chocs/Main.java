package com.chocs;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            LoginForm form = new LoginForm();
            form.setSize(400,200);
            form.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}