package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Calendar;

public class abc extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton b1;
    JComboBox c1;
    ImageIcon i1;
    int f;
    private JPanel panel1;
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private static String URL = "jdbc:mysql://localhost:3306/doctors";
    private static String name ="root";
    private static String pass = "Aleksia01!";

    public static void test(Statement myStmt, String m) throws SQLException
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String da=day+"/"+(month+1)+"/"+year;
        int count=0;
        ResultSet resultSet = myStmt.executeQuery("SELECT count(date) FROM doctors."+ m +" where date='"+ da +"'");

        if(resultSet.next())
        {
            count=resultSet.getInt(1);
        }
        if(count==5)
        {
            xyz x=new xyz();
            x.setBounds(60,120,250,65);
            x.setVisible(true);
            x.setTitle("Sorry");
            x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else
        {
            pqr p=new pqr(m);
            p.setSize(350,350);
            p.setVisible(true);
            p.setTitle("Hospital Management System");
            p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public abc(String field[],String o)
    {
        setLayout(null);
        l1=new JLabel("Select Doctor");
        c1=new JComboBox(field);
        b1=new JButton("Next");
        //i1=new ImageIcon(getClass().getResource(o));
        l2=new JLabel(i1);
        add(l1);
        add(c1);
        add(b1);
        add(l2);
        l2.setBounds(0,0,350,350);
        l1.setBounds(70,100,100,25);
        c1.setBounds(150,100,140,25);

        b1.setBounds(120,170,80,25);
        c1.addActionListener(this);
        b1.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==c1)
        {
            JComboBox cb=(JComboBox)ae.getSource();;
            String msg=(String)cb.getSelectedItem();
            switch(msg)
            {
                case "Dr. Harsh Domadia" : f=1;
                    break;
                case "Dr. Jay Gala" : f=2;
                    break;
                case "Dr. Tushar Kadam" : f=3;
                    break;
                case "Dr. Sangram Desai" : f=4;
                    break;
                case "Dr. Jasdeep Singh" : f=5;
                    break;
                case "Dr. Atharva Gole" : f=6;
                   break;
            }
        }
        if(ae.getSource()==b1)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(URL, name, pass);
                Statement statement = connection.createStatement();
                int count=0;
                if(f==1)
                {
                    abc.test(statement,"harsh_domadia");
                }
                else
                if(f==2)
                {
                    abc.test(statement,"john_doe");
                }
                else
                if(f==3)
                {
                    abc.test(statement,"tushar_kadaam");
                }
                else
                if(f==4)
                {
                    abc.test(statement,"sangram_desai");
                }
                else
                if(f==5)
                {
                    abc.test(statement,"jasdeep_grover");
                }
                else
                if(f==6)
                {
                    abc.test(statement,"jay_gala");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
