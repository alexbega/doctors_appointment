package project;

import javax.swing.*;
import java.awt.*;

public class xyz extends JFrame {
    JLabel l1;
    public xyz()
    {
        setLayout(new FlowLayout());
        l1=new JLabel("Appointments are full");
        add(l1);
    }
}
