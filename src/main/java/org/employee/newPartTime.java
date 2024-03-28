package org.employee;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Random;
import java.util.Scanner;

public class newPartTime extends JFrame implements ActionListener {
int num1=100;

    JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
    JLabel label1, label2, label3, label4, label5, label6, label222, label7;
    JButton next;
    Connection Connn;
    Random ran = new Random();


    public newPartTime() {
        String id = String.valueOf(ran.nextInt(1000));

        label222 = new JLabel("IDNO=" + id);
        label222.setBackground(new Color(22));
        label222.setFont(new Font("Raleway", Font.BOLD, 36));
        label222.setForeground(new Color(0xEC0D36));
        label222.setBounds(700, 5, 300, 100);
        add(label222);


        label1 = new JLabel("NAME");
        label1.setBounds(520, 160, 200, 30);
        label1.setFont(new Font("Raleway", Font.BOLD, 30));
        label1.setForeground(Color.white);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(800, 160, 250, 30);
        textField1.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField1);

        label2 = new JLabel("WORKINGHOURS");
        label2.setBounds(450, 220, 300, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 30));
        label2.setForeground(Color.white);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(800, 220, 250, 30);
        textField2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField2);


        label3 = new JLabel("PINCODE");
        label3.setBounds(490, 280, 300, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 30));
        label3.setForeground(Color.white);
        add(label3);

        textField3 = new JTextField();
        textField3.setBounds(800, 280, 250, 30);
        textField3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField3);
//
//
        label4 = new JLabel("CITY");
        label4.setBounds(510, 340, 300, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 30));
        label4.setForeground(Color.white);
        add(label4);

        textField4 = new JTextField();
        textField4.setBounds(800, 340, 250, 30);
        textField4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField4);

        label5 = new JLabel("STATE");
        label5.setBounds(510, 400, 300, 30);
        label5.setFont(new Font("Raleway", Font.BOLD, 30));
        label5.setForeground(Color.white);
        add(label5);

        textField5 = new JTextField();
        textField5.setBounds(800, 400, 250, 30);
        textField5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField5);


        label6 = new JLabel("CONTACT NO");
        label6.setBounds(450, 460, 300, 30);
        label6.setFont(new Font("Raleway", Font.BOLD, 30));
        label6.setForeground(Color.white);
        add(label6);

        textField6 = new JTextField();
        textField6.setBounds(800, 460, 250, 30);
        textField6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField6);

        label7 = new JLabel("EMAIL ADDRESS");
        label7.setBounds(450, 520, 300, 30);
        label7.setFont(new Font("Raleway", Font.BOLD, 30));
        label7.setForeground(Color.white);
        add(label7);

        textField7 = new JTextField("@gmail.com");

        textField7.setBounds(800, 520, 250, 30);
        textField7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textField7);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(840, 560, 80, 30);
        next.addActionListener(this);
        add(next);
//


        ImageIcon i1 = new ImageIcon("C:\\Users\\ANSHTHAKURR\\Desktop\\employee\\src\\main\\java\\org\\icon\\login.png");
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

        String id = label222.getText();
        String city = textField4.getText();
        String pincode = textField3.getText();
        String state = textField5.getText();
        String name = textField1.getText();
        String Conno = textField6.getText();
        String workH = textField2.getText();
     String salary= textField2.getText()+0+0;



        try {
            if (textField1.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "FILL ALL FIELDS");
            else {

                Connn connn = new Connn();
                String query = "insert into emp values('" + id + "','" + name + "','" + workH + "','" + pincode + "','" + city + "','" + state + "','" + Conno + "' )";
                connn.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "DATAADDEDSUCESSFULY");
                 JOptionPane.showMessageDialog(null,"DAILY PAYOUT"+"  "+salary);
                JOptionPane.showMessageDialog(null, id);

                setVisible(false);

            }

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "DATANOTADDED");
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new newPartTime();
    }
}
