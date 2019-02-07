import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class form3 {
    JFrame f;
    JButton b[];
    JPanel p;
    JLabel l;

    form3()
    {
      f= new JFrame();
      b = new JButton[10];
      b[0]= new JButton("Deposit");
      b[1]= new JButton("Withdraw");
      b[2]= new JButton("Loan");
      b[4]= new JButton("delete");
      b[3]= new JButton("transfer");
      b[5]= new JButton("logout");
      b[6]= new JButton("Balance");
      p = new JPanel();
      l= new JLabel("Banking functions");

        f.setLayout(new FlowLayout());

        f.setSize(200,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(p);
        f.add(l);
        f.add(b[6]);
        f.add(b[0]);
        f.add(b[1]);
        f.add(b[2]);
        f.add(b[3]);
        f.add(b[4]);
        f.add(b[5]);


        f.setVisible(true);

        b[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formbalance A = new formbalance();
                f.setVisible(false);
            }
        });
        b[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formdeposit C = new formdeposit();
                f.setVisible(false);
            }
        });
        b[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formwithdraw C = new formwithdraw();
                f.setVisible(false);
            }
        });
        b[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formloan C = new formloan();
                f.setVisible(false);
            }
        });
        b[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formtransfer C = new formtransfer();
                f.setVisible(false);
            }
        });
        b[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Iterator itr = ArrayListGlobal1.at.iterator();
             details.delete((details)itr.next());
             f.setVisible(false);
                ArrayListGlobal1.at.remove(0);
             loginbox C = new loginbox();
            }
        });
        b[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginbox C = new loginbox();
                f.setVisible(false);
                 ArrayListGlobal1.at.remove(0);
            }
        });


    }
}
