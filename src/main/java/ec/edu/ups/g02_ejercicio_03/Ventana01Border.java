/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_ejercicio_03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Ventana01Border extends JFrame{
    
    public JPanel panel;

    public Ventana01Border(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(250, 160));
        this.setLocation(new Point(10, 10));
        iniciarComponentes();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void colocarPaneles() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        this.panel.setLayout(new BorderLayout());
    }

    public void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();

    }

    public void colocarBotones() {
        JButton btn1 = new JButton();
        btn1.setText("Button 1");
        panel.add(btn1, BorderLayout.NORTH);
        btn1.setEnabled(true);

        JButton btn2 = new JButton();
        btn2.setText("2");
        panel.add(btn2, BorderLayout.CENTER);
        btn2.setEnabled(true);

        JButton btn3 = new JButton();
        btn3.setText("Button 5");
        panel.add(btn3, BorderLayout.EAST);
        btn3.setEnabled(true);

        JButton btn4 = new JButton();
        btn4.setText("Button 3");
        panel.add(btn4, BorderLayout.WEST);
        btn4.setEnabled(true);

        JButton btn5 = new JButton();
        btn5.setText("Long-Named Button 4");
        btn5.setEnabled(true);
        panel.add(btn5, BorderLayout.SOUTH);

    }
    
}
