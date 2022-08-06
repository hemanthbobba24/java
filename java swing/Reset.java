import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Reset  extends JFrame implements ActionListener
{
	JButton resetbutton;
	TicTacToe tictactoe;
	Reset()
	{
		 this.setDefaultCloseOperation(3);
         this.setSize(600,800);
         this.setTitle("TIC TAC TOE GAME");
         this.setLayout(null);
         resetbutton=new JButton("new game");
         resetbutton.setBounds(100,0,100,40);
         resetbutton.addActionListener(this);
         resetbutton.setFocusable(false);
         tictactoe=new TicTacToe();
         this.add(tictactoe);
         this.add(resetbutton);
         this.setVisible(true);
	}
	 public void actionPerformed(ActionEvent e)
	 {
       if(e.getSource()==resetbutton)
       {
       	this.remove(tictactoe);
       	tictactoe=new TicTacToe();
       	this.add(tictactoe);
       }
	 }
	public static void main(String[]args)
	{
		
		Reset r=new Reset();
	}
}