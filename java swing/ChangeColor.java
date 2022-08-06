import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ChangeColor
{
	public static void main(String[]args)
	{
        Main obj=new Main();
	}
}
class Main extends JFrame
{
	public Main(){
		JLabel l=new JLabel("hello");
		JLabel l1=new JLabel();
				ImageIcon i=new ImageIcon("goldenretriver.jpg");
				ImageIcon i1=new ImageIcon("pug.jpg");
				l1.setIcon(i1);
          add(l);
          add(l1);
		setIconImage(i.getImage());
		getContentPane().setBackground(Color.white);
       setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(3);
	}
}