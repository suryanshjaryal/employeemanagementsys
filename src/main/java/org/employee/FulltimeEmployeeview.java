package org.employee;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FulltimeEmployeeview extends JFrame implements ActionListener {
Choice choice1;
JTable jTable1;
JButton search,print,update,back,exit;
    public FulltimeEmployeeview() {

        JLabel label1 = new JLabel("SEARCH BY ID");
        label1.setBounds(30, 50, 100, 10);
        add(label1);

        choice1=new Choice();
        choice1.setBounds(180,45,100,10);
        add(choice1);

        try {
            Connn connn=new Connn();
            ResultSet ResultSet = connn.statement.executeQuery("select * from fullemp");
            while (ResultSet.next()){
                choice1.add(ResultSet.getString("id"));

            }

        }catch (Exception E){
            E.printStackTrace();

        }
        jTable1=new JTable();

        try {
            Connn connn=new Connn();
            ResultSet ResultSet1 = connn.statement.executeQuery("select * from fullemp");
            jTable1.setModel(DbUtils.resultSetToTableModel(ResultSet1));
        }catch (Exception E){
            E.printStackTrace();
        }





        JScrollPane jScrollPane1=new JScrollPane(jTable1);
        jScrollPane1.setBounds(0,100,1140,600);
        add(jScrollPane1);

        search=new JButton("search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);

        print=new JButton("print");
        print.setBounds(100,70,80,20);
        print.addActionListener(this);
        add(print);

        update=new JButton("update");
        update.setBounds(180,70,80,20);
        update.addActionListener(this);
        add(update);

        back=new JButton("back");
        back.setBounds(260,70,80,20);
        back.addActionListener(this);
        add(back);

        exit=new JButton("exit");
        exit.setBounds(340,70,80,20);
        exit.addActionListener(this);
        add(exit);





        setLayout(null);
        setSize(1132, 635);
        setVisible(true);
        setLocation(160, 60);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==search){
            String query="Select * from fullemp where id ='"+choice1.getSelectedItem()+"'";
            try{
                Connn connn=new Connn();
                ResultSet resultSet=connn.statement.executeQuery(query);
                jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));

            }catch (Exception E){
                E.printStackTrace();

            }
        } else if (e.getSource()==print) {
            try {
                jTable1.print();
            } catch (Exception E) {
                E.printStackTrace();

            }

        } else if (e.getSource()==update) {
            setVisible(false);

        } else if (e.getSource()==back) {
            new PartTimeEmployee();
            setVisible(false);
        }else if (e.getSource()==exit){
            setVisible(false);
        }



    }

    public static void main(String[] args) {

    }

}

