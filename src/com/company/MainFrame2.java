package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame2 extends JFrame {
   private JTextField jtf= new JTextField();
   private Container cp;
   private JPanel jpn=new JPanel(new GridLayout(3,3));
   private JButton jbtns[]=new JButton[9];
   public  MainFrame mframe=new MainFrame();

    public MainFrame2(MainFrame mf){
        mframe=mf;
      init();
   }
   private void init(){
       this.setBounds(100,100,400,600);
       this.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               mframe.setVisible(true);
           }
       });
       cp=this.getContentPane();
       cp.setLayout(new BorderLayout(5,5));
       cp.add(jtf,BorderLayout.NORTH);
       cp.add(jpn,BorderLayout.CENTER);
       jtf.setEditable(false);
       for(int i=0;i<9;i++){
           jbtns[i]=new JButton(Integer.toString(i));
           jpn.add(jbtns[i]);
           jbtns[i].addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   JButton tempButton= (JButton) e.getSource();
                   jtf.setText(jtf.getText()+tempButton.getText());
               }
           });
       }
   }
}
