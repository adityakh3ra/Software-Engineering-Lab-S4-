import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class formtransfer {
    JFrame f;
    JLabel l, l1, l2;
    JPanel p;
    JTextField jtf, jtf1;
    JButton b1, b2;

    formtransfer() {
        f = new JFrame("Transfer");
        p = new JPanel();
        l = new JLabel("Enter your credentials of the other account");
        l1 = new JLabel("enter username");
        l2 = new JLabel("Enter amount");
        jtf = new JTextField(10);
        jtf1 = new JTextField(10);
        b1 = new JButton("OK");
        b2 = new JButton("CANCEL");
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(600, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.add(l);
        f.add(l1);
        f.add(jtf);
        f.add(l2);
        f.add(jtf1);
        f.add(b1);
        f.add(b2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String content = jtf.getText();
                String content1 = jtf1.getText();
                details A = details.verify1(content);

                double dp = Double.parseDouble(content1);
                Iterator itr = ArrayListGlobal1.at.iterator();
                boolean b = details.transfer((details) itr.next(), A, dp);
                if (b == true)
                {
                    formdone C = new formdone();
                    f.setVisible(false);
                }
                else

                    { formtryagain B = new formtryagain();
                }


            }
        });

    }
}