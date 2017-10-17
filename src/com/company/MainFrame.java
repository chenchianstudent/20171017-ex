package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {
    private JLabel lab1=new JLabel("ID:");
    private JLabel lab2=new JLabel("Password:");
    private JTextField tf1=new JTextField();
    private JTextField tf2=new JTextField();
    private JButton bt1=new JButton("Exit");
    private JButton bt2=new JButton("Enter");
    private Container cp;


public MainFrame(){
    init();
}
private void init(){
 this.setBounds(100,100,300,150);
 this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    cp = this.getContentPane();
    cp.setLayout(new GridLayout(3,2,3,1));
    lab1.setHorizontalAlignment(JLabel.RIGHT);
    lab2.setHorizontalAlignment(JLabel.RIGHT);
    cp.add(lab1);
    cp.add(tf1);
    cp.add(lab2);
    cp.add(tf2);
    cp.add(bt1);
    cp.add(bt2);
    bt1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           System.exit(0);
        }
    });

}
}
