import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formdone
{

    JFrame f;
    JLabel l,l1;
    JPanel p;
    JButton b;
    formdone()
    {
        f= new JFrame("Task Completed");
        l= new JLabel("Task is all completed");

        p = new JPanel();
        b= new JButton("OK");

        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(200,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.add(l);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form3 A= new form3();
            }
        });


    }


}
