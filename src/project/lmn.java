package project;

import javax.swing.*;
import java.awt.*;

public class lmn extends JFrame {
    JLabel l1;
    private JPanel panel1;

    public lmn()
    {
        setLayout(new FlowLayout());
        l1=new JLabel("Appointment Booked Successfully");
        add(l1);
    }
}
