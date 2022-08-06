import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Subtraction
{
	public static void main(String[]args)
	{
        Hello s=new Hello();
	}
}
 class Hello extends JFrame implements ActionListener
 {
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JLabel l;
    public Hello()
    {

    	t1=new JTextField(15);
    	t2=new JTextField(15);
    	b1=new JButton("add");
    	b2=new JButton("sub");
       	l=new JLabel(" ");
    	add(t1);
    	add(t2);
    	add(b1);
    	add(b2);
    	add(l);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	setTitle("calculator");
    	setLayout(new FlowLayout());
    	setSize(400,400);
    	setVisible(true);
    	setDefaultCloseOperation(3);
    }
     public void actionPerformed(ActionEvent e)
     {
     	int num1=Integer.parseInt(t1.getText());
     	int num2=Integer.parseInt(t2.getText());
     	int answer=0;
     	if(e.getSource()==b1)
     	{
     		answer=num1+num2;
     	}
     	else
     	{
     		answer=num1-num2;
     	}
     	l.setText(answer+" ");
     }
 }