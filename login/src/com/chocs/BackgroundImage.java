package com.chocs;

import javax.swing.*;
import java.awt.*;

public class BackgroundImage {

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Background Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // carregando a imagem
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\ADM\\ID\\luva de ope.png");

        // criando JPanel com imagem de fundo
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // desenha a imagem no panel
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        panel.setLayout(new BorderLayout());

        // outros componentes
        JLabel label = new JLabel("Painel...");
        label.setForeground(Color.WHITE); // cor do texto

        panel.add(label, BorderLayout.CENTER);

        // adicionando painel ao jframe
        frame.setContentPane(panel);

        frame.setVisible(true);
    }
}
