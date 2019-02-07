import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class formbalance {

    JFrame f;
    JLabel l, l1;
    JPanel p;
    JButton b;

    formbalance() {
        f = new JFrame("Balance");


        p = new JPanel();
        b = new JButton("back to menu");
        Iterator itr = ArrayListGlobal1.at.iterator();
        String bal = details.balance((details) itr.next());
        l = new JLabel("The Balance is " + bal);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.add(l);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form3 A = new form3();
                f.setVisible(false);
            }
        });

    }
}