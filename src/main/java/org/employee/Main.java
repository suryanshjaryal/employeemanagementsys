package org.employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {


    JButton button1;

    public Main() {


        super("EMS");

        button1 = new JButton("NEXT");
        button1.setFont(new Font("Raleway", Font.BOLD, 24));
        button1.setBackground(new Color(0xFFFFFF));
        button1.setForeground(new Color(0x0A0A0A));
        button1.setBounds(935, 549, 110, 26);
        button1.addActionListener(this);
        add(button1);


        ImageIcon i1 = new ImageIcon("C:\\Users\\ANSHTHAKURR\\Desktop\\employee\\src\\main\\java\\org\\icon\\THAKUR.gif");
        Image i2 = i1.getImage().getScaledInstance(1152, 648, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1152, 650);
        add(image);


        setLayout(null);
        setSize(1152, 648);
        setVisible(true);
        setLocation(160, 60);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                new TYPEOFEMPLOYEE();
                setVisible(false);

            }


        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}