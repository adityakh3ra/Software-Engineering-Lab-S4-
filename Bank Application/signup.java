import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup
{


        JFrame f;
        JLabel l,l1,l2,l3;
        JPanel p;
        JTextField jtf,jtf1,jtf2,jtf3;
        JButton b1,b2;

        signup()
        {
            f= new JFrame("Signup");
            p= new JPanel();
            l = new JLabel("enter Name");
            l1= new JLabel("enter username");
            l2= new JLabel("Enter password");
            l3 = new JLabel("Enter Amount: ");
            jtf= new JTextField(10);
            jtf1= new JTextField(10);
            jtf2 = new JTextField(15);
            jtf3 = new JTextField(10);
            b1 = new JButton("Cancel");
            b2 = new JButton("sign up");
            f.setLayout(new FlowLayout());
            f.setVisible(true);
            f.setSize(300,250);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(p);
            f.add(l);
            f.add(jtf2);
            f.add(l1);
            f.add(jtf);
            f.add(l2);
            f.add(jtf1);
            f.add(l3);
            f.add(jtf3);
            f.add(b1);
            f.add(b2);

            b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    String content2= jtf2.getText();
                    String content = jtf.getText();
                    String content1 = jtf1.getText();
                    String content3 = jtf3.getText();
                    double dp= Double.parseDouble(content3);
                    details.make(content2,content,content1,dp);
                    loginbox A = new loginbox();


                }});
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                      loginbox A = new loginbox();

                }
            });

}}
