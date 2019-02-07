import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class loginbox
{

          JFrame f;
          JLabel l,l1,l2;
          JPanel p;
          JTextField jtf,jtf1;
          JButton b1,b2;

      loginbox()
      {
          f= new JFrame("Login");
          p= new JPanel();
          l1= new JLabel("enter username");
          l2= new JLabel("Enter password");
          jtf= new JTextField(10);
          jtf1= new JTextField(10);
          b1 = new JButton("login");
          b2 = new JButton("sign up");
          f.setLayout(new FlowLayout());
          f.setVisible(true);
          f.setSize(300,250);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.add(p);
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
                  details A= details.verify(content,content1);
                  if(A.amt==-1)
                  {
                      form2 B = new form2();
                  }
                  else
                  {
                      form3 B = new form3();
                      ArrayListGlobal1.at.add(A);
                  }


              }});
          b2.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                 signup S = new signup();
              }
          });


      }


}
