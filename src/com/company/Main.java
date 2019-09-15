package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("example");
        frame.setSize(500,500);
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText("Mój label");



        JButton przycisk1 = new JButton();
        Dimension wymiary = new Dimension(250, 20);
        przycisk1.setText("przyciskuś");
        przycisk1.setLocation(1,2);
        przycisk1.setPreferredSize(wymiary);
        przycisk1.setMaximumSize(wymiary);
        przycisk1.setMinimumSize(wymiary);

        frame.setLocationRelativeTo(null);

        panel.add(label);
        panel.add(przycisk1);
        frame.add(panel);
        frame.setVisible(true);

    }
}
