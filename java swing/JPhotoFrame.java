import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class JPhotoFrame
{
	public static void main(String[]args)
	{
       A obj=new A();
	}
}
 class A extends JFrame implements ActionListener
 { 
 	JLabel l;
 	JLabel l1;
 	JLabel l2;
 	JLabel l3;
 	JLabel l4;
    JLabel l5;
 	JCheckBox c1;
 	JCheckBox c2;
 	JCheckBox c3;
 	JCheckBox c4;
 	JCheckBox c6;
 	JCheckBox c7;
 	JButton b;
 	JButton b2;
 	JLabel l6;
 	public A()
 	{
         c6=new JCheckBox("manali");
             c7=new JCheckBox("kkp");
             b2=new JButton("click");
             l=new JLabel("see");
      l1=new JLabel("in studio photo session with one person:$40");
      l2=new JLabel("in studio photo session with two or more persons:$75");
      l3=new JLabel("photo session with a pet:$90");
      l4=new JLabel("photo session in out of the studio:$130");
      l6=new JLabel();
      c1=new JCheckBox("one person");
      c2=new JCheckBox("two or more persons");
      c3=new JCheckBox("pet");
      c4=new JCheckBox("in different locations");
      b=new JButton("register");
       l5=new JLabel(" ");
        add(l6);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b);
        add(l5);
        b.addActionListener(this);
        setTitle("PAULA'S POTRAITS");
       setSize(500,500);
       setLayout(new FlowLayout());
       setVisible(true);
       setDefaultCloseOperation(3); 
       hii();
       hello();
 	}
    public void hello()
    {
        try{
        Thread.sleep(5000);
    }
     catch(Exception e)
     {
        e.printStackTrace();
     }
      l6.setText("REGISTER ANY OPTION BELOW");
    }
     public void hii(){
        l6.setText("WELCOME TO PAUL'S POTRAITS");
     }
 	public void actionPerformed(ActionEvent e)
 	{
 		if(c1.isSelected())
 		{
           String notify="you have registered one person in studio ";
           l5.setText(notify);
 		}
 		if(c2.isSelected())
 		{
 			String notify="you have registered two persons in studio";
 			l5.setText(notify);
 		}
 		if(c3.isSelected())
 		{
           String notify="you have registered photoshoot with a pet";
           l5.setText(notify);
 		}
 		if(c4.isSelected())
 		{
 			String notify="you have registered the photo shoot out of the studio";
 			l5.setText(notify);
 			
 			b2.addActionListener(this);
 			add(c6);
 			add(c7);
 			add(b2);
 			add(l);
 		
 		if(c6.isSelected())
 		{
 			String notify1="you have selected manali";
 			l.setText(notify1);
 		}
 		else
 		{
 			String notify2="you have selected kkp";
 			l.setText(notify2);
 		}

 	}

 }
}