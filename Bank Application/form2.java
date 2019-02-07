import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class form2
{

    JFrame f;
    JLabel l,l1;
    JPanel p;
    JButton b;
    form2()
    {
        f= new JFrame("Error");
        l= new JLabel("Entered username and password are wrong");
        l1 = new JLabel("Click ok to get back to login page ");
        p = new JPanel();
        b= new JButton("ok");

        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(200,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.add(l);
        f.add(l1);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginbox A= new loginbox();
            }
        });


    }
}
