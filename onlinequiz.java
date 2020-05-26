
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class onlinequiz extends JFrame implements ActionListener,Runnable
{
 int i,o=0;
 Frame f;
 Thread t=null;
 int hours=0, minutes=0, seconds=0;
 String timeString = "";
 JButton b1,b2,b3,b;
 ButtonGroup bg;
 JLabel k,bc,l;
 JRadioButton jb[]=new JRadioButton[5];
 int count=0,curr=0;
 ImageIcon img;
 public onlinequiz()
 {
  img=new ImageIcon("new_tablet-wallpaper-1366x768.jpg");
  bc=new JLabel("",img,JLabel.CENTER);
  bc.setBounds(0,0,950,350);
  k=new JLabel();
  l=new JLabel("<--  Apptitude Test  -->");
  l.setBounds(300,2,300,30);
  t = new Thread(this);
  t.start();
  b=new JButton();
  b.setBounds(600,150,100,50);
  add(b);
  Font f = new Font("Courier", Font.BOLD,18);
  l.setFont(f);
  add(l);
  add(k);
  bg=new ButtonGroup();
  for(int i=0;i<5;i++) 
   {
    jb[i]=new JRadioButton();     
    add(jb[i]);  
    bg.add(jb[i]);  
   }
  b1=new JButton("back");
  b2=new JButton("next");
  b3=new JButton("Result");
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b1.setActionCommand("back");
  b3.setEnabled(false);
  add(b1);
  add(b2);
  add(b3);
  add(bc);
  set();
  k.setBounds(30,40,800,50);
  jb[0].setBounds(50,90,250,30);
  jb[1].setBounds(50,120,250,30);
  jb[2].setBounds(50,150,250,30);
  jb[3].setBounds(50,180,250,30);
  b1.setBounds(100,240,110,30);  
  b2.setBounds(300,240,110,30);
  b3.setBounds(500,240,110,30);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  setLayout(null);  
  setLocation(250,100);  
  setVisible(true);  
  setSize(950,350); 
  b1.setEnabled(false);
  }
public void run() {
      try {
         while (true) {

            Calendar cal = Calendar.getInstance();
            hours = cal.get( Calendar.HOUR_OF_DAY );
            if ( hours > 12 ) hours -= 12;
            minutes = cal.get( Calendar.MINUTE );
            seconds = cal.get( Calendar.SECOND );

            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
            Date date = cal.getTime();
            timeString = formatter.format( date );
            printTime();
            t.sleep( 1000 );  // interval given in milliseconds
         }
      }
      catch (Exception e) { }
 }
public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b2)
 {
  if(check())
   count=count+1;
for(i=0;i<4;i++)
{
	if(jb[i].isSelected())
	{
		curr++;
		o=1;
	}
}
	if(o==0)
	{
	 JOptionPane.showMessageDialog(this,"Please Select Option");
	}
    o=0;
   set();
   if(curr>=1)
	b1.setEnabled(true);
   
  if(curr==9)
  {
   b2.setEnabled(false);
   b3.setEnabled(true);
  }
 }
if(e.getSource()==b1)
 {
   curr--;
   set();
   if(curr==9)  
      b3.setEnabled(true);  
    setVisible(false);  
    setVisible(true); 
if(curr<1)
	b1.setEnabled(false);
   	
 }
 if(e.getActionCommand().equals("Result"))
 {
  if(check())
   count=count+1;
   curr++;
   JOptionPane.showMessageDialog(this,"Your incorrect ans is="+(curr-count)+"\nYour score is="+count);
   System.exit(0);
 }
 }
public void printTime()
{
b.setText(timeString);
}
void set()
{ 
 jb[4].setSelected(true); 
 if(curr==0)
 {
  k.setText("Q1. If 20 men can build a wall\n 112 meters long in 6 days,what length of a similar will can be built by 25 men in 3 days?");
  jb[0].setText("A. 65mtrs");
  jb[1].setText("B. 52mtrs");
  jb[2].setText("C. 70mtrs");
  jb[3].setText("D. 78mtrs");
 }
 if(curr==1)
 {
 k.setText("Q2. A number whose fifth part increased by 5 equal to its fourth part diminshed by 5,is  ");
  jb[0].setText("A. 160");
  jb[1].setText("B. 180");
  jb[2].setText("C. 200");
  jb[3].setText("D. 220");
 }    
if(curr==2)
 {
 k.setText("Q3. What should come in place of the question mark(?) in the following number series? 9,10,24,81,340?");
  jb[0].setText("A. 1376");
  jb[1].setText("B. 1725");
  jb[2].setText("C. 1780");
  jb[3].setText("D. None of the above");
 } 
 if(curr==3)
 {
 k.setText("Q4. What should be the compound interest accured on an amount of RS9,0000/- at the rate of 11 p.c.p.a in the two years?");
  jb[0].setText("A. 2088.90");
  jb[1].setText("B. 2140.90");
  jb[2].setText("C. 2068.50");
  jb[3].setText("D. 2085");
 }    
 if(curr==4)
 {
 k.setText("Q5. What is the least number to be added to 2530 to make it a perfect square ");
  jb[0].setText("A. 50");
  jb[1].setText("B. 65");
  jb[2].setText("C. 80");
  jb[3].setText("D. None of the above");
 }    
 if(curr==5)
 {
 k.setText("Q6. A train running at the speed of 108kmph,crosses a 365meter long platform in 21secs.What is the length of train? ");
  jb[0].setText("A. 260");
  jb[1].setText("B. 275");
  jb[2].setText("C. 265");
  jb[3].setText("D. 285");
 }    
 if(curr==6)
 {
 k.setText("Q7. A number whose fifth part increased by 5 equal to its fourth part diminshed by 5,is  ");
  jb[0].setText("A. 160");
  jb[1].setText("B. 180");
  jb[2].setText("C. 200");
  jb[3].setText("D. 220");
 }    
 if(curr==7)
 {
 k.setText("Q8. He cost a fans and 14 ovens is RS 36,520/-,What is the cost of 12 fans and 21 ovens? ");
  jb[0].setText("A. 56,800");
  jb[1].setText("B. 54,780");
  jb[2].setText("C. 57,950");
  jb[3].setText("D. Can't be determined");
 }
if(curr==8)
 {
 k.setText("Q9. When n is divided by 6,the remainder is 4.When 2n is divided by 6,the remainder is ");
  jb[0].setText("A. 2");
  jb[1].setText("B. 0");
  jb[2].setText("C. 4");
  jb[3].setText("D. 1");
 }    
 if(curr==9)
 {
 k.setText("Q10. If number is increased by 25% and thr resulting number is decreased by 25%,then the percentage increase or decrease finally is ");
  jb[0].setText("A. No change");
  jb[1].setText("B. decreased by 6.25%");
  jb[2].setText("C. increased by 6.25%");
  jb[3].setText("D. increased by 6%");
 }               
}
boolean check()
{
if(curr==0)
 return(jb[2].isSelected()); 
if(curr==1)
  return(jb[2].isSelected());
if(curr==2)
  return(jb[1].isSelected());
if(curr==3)
  return(jb[0].isSelected());
if(curr==4)
  return(jb[3].isSelected());
if(curr==5)
  return(jb[2].isSelected());
if(curr==6)
  return(jb[1].isSelected());
if(curr==7)
  return(jb[1].isSelected());
if(curr==8)
  return(jb[0].isSelected());
if(curr==9)
  return(jb[1].isSelected());
return false;  
}
public static void main(String args[])
{
 new onlinequiz();
}
}

