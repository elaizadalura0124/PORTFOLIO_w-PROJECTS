/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrentalsystemalpha;

/**
 *
 * @author Daryl James
 */
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class Chatgpt {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Windows 98 Style");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(192, 192, 192)); // Classic gray

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.setBackground(new Color(192, 192, 192));
        menuBar.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
        frame.setJMenuBar(menuBar);

        // Retro Button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30);
        button.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
        button.setBackground(new Color(240, 240, 240));
        button.setBorder(new BevelBorder(BevelBorder.RAISED));
        frame.add(button);

        // Label
        JLabel label = new JLabel("Welcome to Windows 98 GUI!");
        label.setBounds(50, 100, 300, 20);
        label.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
        frame.add(label);

        frame.setVisible(true);
    }
}


