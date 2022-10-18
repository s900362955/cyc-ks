package com.cycks;

import com.cycks.bill.Bill;
import com.cycks.isp.Isp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel{
    public static void main(String[] args) throws Exception {
        Font font = new Font("msjh", Font.TYPE1_FONT, 30);
        JFrame window = new JFrame();
        window.setSize(300, 400);
        window.setBackground(Color.white);
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton billButton=new JButton("一般帳單");
        billButton.setBounds(10,10,250,100);
        billButton.setFont(font);
        billButton.setEnabled(true);
        window.add(billButton);

        billButton.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                window.dispose();
                new Bill().bill();
            }
        }));

        JButton ksButton=new JButton("寬頻帳單");
        ksButton.setBounds(10,200,250,100);
        ksButton.setFont(font);
        ksButton.setEnabled(true);
        window.add(ksButton);

        ksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Isp().isp();
            }
        });
    }

}
