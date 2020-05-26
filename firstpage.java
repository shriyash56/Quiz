
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class firstpage  extends JFrame implements ActionListener
{
JLabel l,l1,l2,bc;
JTextField tf1;
JPasswordField value;
JButton b1;
ImageIcon img;
firstpage()
{
img=new ImageIcon("microsoft-hq-headquarters-buiding-sign-logo-symbol-company.jpg");
bc=new JLabel("",img,JLabel.CENTER);
bc.setBounds(0,0,700,700);
l=new JLabel("Login Form");
l.setBounds(250,30,150,80);
l1=new JLabel("User:");
l1.setBounds(80,140,150,50);
l2=new JLabel("Password:");
l2.setBounds(80,190,250,50);
tf1=new JTextField(15);
tf1.setBounds(230,150,210,30);
value=new JPasswordField();
value.setBounds(230,200,210,30);
b1=new JButton("login");
b1.addActionListener(this);
b1.setBounds(380,270,150,30);
b1.setBackground(Color.green);
Font font = new Font("Courier", Font.ITALIC,25);
Font f = new Font("Courier", Font.BOLD,25);
l.setFont(f);
l1.setFont(font);
l2.setFont(font);
add(l);
add(l1);
add(l2);
add(tf1);
add(value);
add(b1);
add(bc);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  setLayout(null);  
  setLocation(250,100);  
  setVisible(true);  
  setSize(700,700); 
}
public void actionPerformed(ActionEvent e)
{
String value=tf1.getText();
if(e.getSource()==b1)
 {
 if(value.equals("shri")) 
  {
   JOptionPane.showMessageDialog(this,"Hi,Sir your Login Successful");  
   new onlinequiz();
   dispose();
  }
 else
  {
 JOptionPane.showMessageDialog(this,"Login Unsuccessful Please Try Again","Alert",JOptionPane.WARNING_MESSAGE);  
  }
 }
}
public static void main(String args[])
{
new firstpage();
}
}
