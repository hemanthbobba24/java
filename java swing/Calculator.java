import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator
{
	public static void main(String[]args)
	{
       Calci c=new Calci();
	}
}
 class Calci extends JFrame implements ActionListener
 {
 	JTextField t1;
 	JTextField t2;
    JButton b;
    JRadioButton r1;
    JRadioButton r2;
    JLabel l;
    public Calci()
    {
    	t1=new JTextField(15);
    	t2=new JTextField(15);
    	b=new JButton("click");
    	r1=new JRadioButton("sub");
    	r2=new JRadioButton("add");
    	l=new JLabel(" ");
    	ButtonGroup bg=new ButtonGroup();
    	bg.add(r1);
    	bg.add(r2);
    	add(t1);
    	add(t2);
    	add(b);
    	add(r1);
    	add(r2);
    	add(l);
    	b.addActionListener(this);
    	setTitle("calculator");
    	setSize(400,400);
    	setLayout(new FlowLayout());
    	setVisible(true);
    	setDefaultCloseOperation(3);
    }
    public void actionPerformed(ActionEvent e)
    {
       int num1=Integer.parseInt(t1.getText());
       int num2=Integer.parseInt(t2.getText());
       int result=0;
       if(r2.isSelected())
       {
       	result=num1+num2;
       }
       else
       	{
       		result=num1-num2;
       	}
          l.setText(result+" ");
    }
 }