package org.employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PartTimeEmployee extends JFrame  implements ActionListener  {
    JButton button1, button2;

    public PartTimeEmployee() {


        button1 = new JButton("NEW LOGIN");
        button1.setFont(new Font("Raleway", Font.BOLD, 34));
        button1.setBackground(new Color(22));
        button1.setForeground(new Color(0xEF092B));
        button1.setBounds(635, 280, 340, 46);
        button1.addActionListener(this);
        add(button1);


        button2 = new JButton("EXISTING LOGIN");
        button2.setFont(new Font("Raleway", Font.BOLD, 44));
        button2.setBackground(new Color(22));
        button2.setForeground(new Color(0xEF092B));
        button2.setBounds(555, 360, 480, 46);
        button2.addActionListener(this);
        add(button2);


        ImageIcon i1 = new ImageIcon("C:\\Users\\ANSHTHAKURR\\Desktop\\employee\\src\\main\\java\\org\\icon\\2.png");
        Image i2 = i1.getImage().getScaledInstance(1130, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1132, 600);
        add(image);

        setLayout(null);
        setSize(1132, 635);
        setVisible(true);
        setLocation(160, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                new newPartTime();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
