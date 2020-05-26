import java.applet.*;
import java.awt.*;
import java.swing.*;

public class onlinetest extends Jframe implement ActionListener
{
 Frame f;
 Jbutton b1,b2;
 Jlable k;
 JradioButton jb[]=new JradioButton[3];
 count=0;curr=0;
 void test(string)
 {
  super(s);
  k=new Jlable();
  add(k);
  for(int i=0;i<5;i++) 
   {
    jb[i]=new JRadioButton();     
    add(jb[i]);    
   }
  b1=new Jbutton("next");
  b2=new Jbutton("");
  b1.addActionListener(this);
  b2.addActionListener(this);
  add(b1);
  add(b2);
  set();
  k.setBound(50,60,350,200);
  jb[0].setBound(50,80,130,160);
  jb[1].setBound(50,90,130,160);
  jb[2].setBound(50,100,130,160);
  b1.setBound(100,230,130,160);
  setLayout(null);  
  setLocation(350,100);  
  setVisible(true);  
  setSize(500,350); 
  }
public void actionPerformed(ActionEvent e)
{
 if(e.getsource()==b1)
 {
  if(check())
  {
   count=count+1;
   curr++;
   set();
  }
  if(curr==1)
  {
   b1.setEnable(False);
   b2.setText("Result");
  }
 }
 if(e.getActionCommand().equals("Result"))
 {
  if(check())
  {
   count=count+1;
   curr++;
   JOptionPane.showMessageDialog(this,"correct ans="+count);  
   System.exist(0);
  }
}
}
void get()
{
 if(curr==0)
 {
  k.setText("Q.Grand Central Terminal, Park Avenue, New York is the world's");
  jb[0].setText("A.largest railway station");
  jb[1].setText("B.highest railway station");
  jb[2].setText("A.None of the above");
 }
 if(curr==1)
 {
 k.setText("Q.Hitler party which came into power in 1933 is known as");
  jb[0].setText("A.Labour Party");
  jb[1].setText("B.Nazi Party");
  jb[2].setText("A.Democratic Party");
 }
}
boolean check()
{
if(curr==0)
 return(jb[0].isSelected()); 
if(curr==1)
  return(jb[1].isSelected());  
} 
}
/*
<applet code=" AnAppletWithButtons.class" width="300" height="300">
</applet>
*/
