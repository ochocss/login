package com.chocs;

import javax.swing.*;

//create NewPage class to create a new page on which user will navigate
class NewPage extends JFrame
{
    //constructor
    NewPage(String username)
    {
        setVisible(true);
        setTitle("Welcome");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Welcome " + username);
        add(welcomeLabel);
    }
}
