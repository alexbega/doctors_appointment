package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Calendar;

public class pqr extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton b1;
    JTextField t1,t2,t3;
    String n;
    public pqr(String m)
    {
        n=m;
        setLayout(new FlowLayout());
        l1=new JLabel("Full Name");
        l2=new JLabel("       Age    ");
        l3=new JLabel("Phone No.");
        t1=new JTextField(22);
        t2=new JTextField(22);
        t3=new JTextField(22);
        b1=new JButton("Submit");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        b1.addActionListener(this);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            String da = day+"/"+(month+1)+"/"+year;
            String s1 =t1.getText();
            int age = Integer.parseInt(t2.getText());
            String pno = t3.getText();
            try
            {
                int max=0;
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctors", "root", "Aleksia01!");
                Statement myStmt = myConn.createStatement();
                ResultSet myRs = myStmt.executeQuery("select max(doctors."+n+".patient_id) from doctors."+n);
                if(myRs.next())
                {
                    max=myRs.getInt(1);
                }
                ++max;
                if (n == "harsh_domadia"){
                    String sq1 = "INSERT INTO doctors.harsh_domadia (patient_id, ful_name, age, contact, date)" + "VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = myConn.prepareStatement(sq1);
                    preparedStatement.setInt(1, max);
                    preparedStatement.setString(2, s1);
                    preparedStatement.setInt(3, age);
                    preparedStatement.setString(4, pno);
                    preparedStatement.setString(5, da);
                    preparedStatement.executeUpdate();
                    //myStmt.executeUpdate(sq1);
                    System.out.println("Insert Successful");
                    lmn l=new lmn();
                    l.setBounds(60,120,250,65);
                    l.setVisible(true);
                    l.setTitle("Thankyou!!");
                    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                else if (n == "john_doe"){
                    String sq2 = "INSERT INTO doctors.john_doe (patient_id, full_name, age, contact, date)" + "VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = myConn.prepareStatement(sq2);
                    preparedStatement.setInt(1, max);
                    preparedStatement.setString(2, s1);
                    preparedStatement.setInt(3, age);
                    preparedStatement.setString(4, pno);
                    preparedStatement.setString(5, da);
                    preparedStatement.executeUpdate();
                    //myStmt.executeUpdate(sq1);
                    System.out.println("Insert Successful");
                    lmn l=new lmn();
                    l.setBounds(60,120,250,65);
                    l.setVisible(true);
                    l.setTitle("Thankyou!!");
                    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else if ( n == "tushar_kadaam"){
                    String sq3 = "INSERT INTO doctors.tushar_kadaam (patient_id, full_name, age, contact, date)" + "VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = myConn.prepareStatement(sq3);
                    preparedStatement.setInt(1, max);
                    preparedStatement.setString(2, s1);
                    preparedStatement.setInt(3, age);
                    preparedStatement.setString(4, pno);
                    preparedStatement.setString(5, da);
                    preparedStatement.executeUpdate();
                    //myStmt.executeUpdate(sq1);
                    System.out.println("Insert Successful");
                    lmn l=new lmn();
                    l.setBounds(60,120,250,65);
                    l.setVisible(true);
                    l.setTitle("Thankyou!!");
                    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else if (n == "sangram_desai"){
                String sq4 = "INSERT INTO doctors.sangram_desai (patient_id, full_name, age, contact, date)" + "VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = myConn.prepareStatement(sq4);
                preparedStatement.setInt(1, max);
                preparedStatement.setString(2, s1);
                preparedStatement.setInt(3, age);
                preparedStatement.setString(4, pno);
                preparedStatement.setString(5, da);
                preparedStatement.executeUpdate();
                //myStmt.executeUpdate(sq1);
                System.out.println("Insert Successful");
                lmn l=new lmn();
                l.setBounds(60,120,250,65);
                l.setVisible(true);
                l.setTitle("Thankyou!!");
                l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else if (n == "jasdeep_grover"){
                    String sq5 = "INSERT INTO doctors.jasdeep_grover (patient_id, full_name, age, contact, date)" + "VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = myConn.prepareStatement(sq5);
                    preparedStatement.setInt(1, max);
                    preparedStatement.setString(2, s1);
                    preparedStatement.setInt(3, age);
                    preparedStatement.setString(4, pno);
                    preparedStatement.setString(5, da);
                    preparedStatement.executeUpdate();
                    //myStmt.executeUpdate(sq1);
                    System.out.println("Insert Successful");
                    lmn l=new lmn();
                    l.setBounds(60,120,250,65);
                    l.setVisible(true);
                    l.setTitle("Thankyou!!");
                    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else if (n == "jay_gala"){
                    String sq5 = "INSERT INTO doctors.jay_gala (patient_id, ful_name, age, contact, date)" + "VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = myConn.prepareStatement(sq5);
                    preparedStatement.setInt(1, max);
                    preparedStatement.setString(2, s1);
                    preparedStatement.setInt(3, age);
                    preparedStatement.setString(4, pno);
                    preparedStatement.setString(5, da);
                    preparedStatement.executeUpdate();
                    //myStmt.executeUpdate(sq1);
                    System.out.println("Insert Successful");
                    lmn l=new lmn();
                    l.setBounds(60,120,250,65);
                    l.setVisible(true);
                    l.setTitle("Thankyou!!");
                    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            catch(Exception ae)
            {
                ae.printStackTrace();
            }
        }
    }


}
