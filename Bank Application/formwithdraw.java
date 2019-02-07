import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;



    public class formwithdraw {

        JFrame f;
        JLabel l;
        JPanel p;
        JTextField jtf;
        JButton b1;

        formwithdraw() {
            f = new JFrame("Withdraw");
            p = new JPanel();
            l = new JLabel("Enter the amount to be withdrawn");
            jtf = new JTextField(10);
            b1 = new JButton("OK");

            f.setLayout(new FlowLayout());
            f.setVisible(true);
            f.setSize(200, 150);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(p);
            f.add(l);
            f.add(jtf);
            f.add(b1);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String content = jtf.getText();
                    double dp=  Double.parseDouble(content);
                    Iterator itr = ArrayListGlobal1.at.iterator();
                    details.withdraw((details)itr.next(),dp);

                    formdone C = new formdone();
                     f.setVisible(false);
                }});

        }
    }

