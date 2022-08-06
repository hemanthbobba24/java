import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class TicTacToe extends JPanel implements ActionListener
{
	JButton[] buttons=new JButton[9];
    boolean player1=true;
    JTextField textfield;
    TicTacToe()
    {
      for(int i=0;i<9;i++)
      {
      	buttons[i]=new JButton("");
        buttons[i].setFont(new Font("calbri",Font.BOLD,50));
      	buttons[i].addActionListener(this);
      	buttons[i].setFocusable(false);
      }
        textfield=new JTextField();
        textfield.setBounds(50,0,200,20);
        textfield.setEditable(false);
        textfield.setOpaque(true);
        textfield.setFont(new Font("poppins",Font.BOLD,20));
        //panel1.setLayout(null);
        setLayout(new GridLayout(4,4,0,0));
        setBounds(20,100,550,550);
        add(buttons[0]);
        add(buttons[1]);
        add(buttons[2]);
        add(buttons[3]);
        add(buttons[4]);
        add(buttons[5]);
        add(buttons[6]);
        add(buttons[7]);
        add(buttons[8]);
        add(textfield);
        title();
        turn();
 }
 public void actionPerformed(ActionEvent e)
    {
      for(int i=0;i<9;i++)
      {
        if(e.getSource()==buttons[i])
        {
           buttons[i].setEnabled(false);
          if(player1){
          buttons[i].setText("X");
          player1=false;
          textfield.setText("O TURN");
          check();
        }
           else
          {
            buttons[i].setEnabled(false);
          buttons[i].setText("O");
          player1=true;
          textfield.setText("X TURN");
          check();
        }
       }
      }
          
    }
     public void title()
     {
      textfield.setText("TIC TAC TOE");
     }
      public void turn(){
        try{
         Thread.sleep(3000);
        }
        catch(Exception e){
          e.printStackTrace();
        }
        textfield.setText("X TURN");
      }
       public void xWin(int a,int b,int c)
       {
           buttons[a].setBackground(Color.red);
           buttons[b].setBackground(Color.red);
           buttons[c].setBackground(Color.red);
           textfield.setText("X WON");
       }
        public void oWin(int a,int b,int c)
        {
           buttons[a].setBackground(Color.red);
           buttons[b].setBackground(Color.red);
           buttons[c].setBackground(Color.red);
           textfield.setText("O WON");
        }
        public void check()
        {
          if(buttons[0].getText()=="X"&&buttons[1].getText()=="X"&&buttons[2].getText()=="X")
          {
            xWin(0,1,2);
          }
          if(buttons[3].getText()=="X"&&buttons[4].getText()=="X"&&buttons[5].getText()=="X")
          {
            xWin(3,4,5);
          }
           if(buttons[6].getText()=="X"&&buttons[7].getText()=="X"&&buttons[8].getText()=="X"){
            xWin(6,7,8);
           }
           if(buttons[0].getText()=="X"&&buttons[4].getText()=="X"&&buttons[8].getText()=="X"){
            xWin(0,4,8);
           }
           if(buttons[2].getText()=="X"&&buttons[4].getText()=="X"&&buttons[6].getText()=="X"){
            xWin(2,4,6);
           }
           if(buttons[0].getText()=="X"&&buttons[3].getText()=="X"&&buttons[6].getText()=="X"){
            xWin(0,3,6);
           }
           if(buttons[1].getText()=="X"&&buttons[4].getText()=="X"&&buttons[7].getText()=="X"){
            xWin(1,4,7);
           }
           if(buttons[2].getText()=="X"&&buttons[5].getText()=="X"&&buttons[8].getText()=="X"){
            xWin(2,5,8);
           }
           if(buttons[0].getText()=="O"&&buttons[1].getText()=="O"&&buttons[2].getText()=="O")
          {
            oWin(0,1,2);
          }
          if(buttons[3].getText()=="O"&&buttons[4].getText()=="O"&&buttons[5].getText()=="O")
          {
            oWin(3,4,5);
          }
           if(buttons[6].getText()=="O"&&buttons[7].getText()=="O"&&buttons[8].getText()=="O"){
            oWin(6,7,8);
           }
           if(buttons[0].getText()=="O"&&buttons[4].getText()=="O"&&buttons[8].getText()=="O"){
            oWin(0,4,8);
           }
           if(buttons[2].getText()=="O"&&buttons[4].getText()=="O"&&buttons[6].getText()=="O"){
            oWin(2,4,6);
           }
           if(buttons[0].getText()=="O"&&buttons[3].getText()=="O"&&buttons[6].getText()=="O"){
            oWin(0,3,6);
           }
           if(buttons[1].getText()=="O"&&buttons[4].getText()=="O"&&buttons[7].getText()=="O"){
            oWin(1,4,7);
           }
           if(buttons[2].getText()=="O"&&buttons[5].getText()=="O"&&buttons[8].getText()=="O"){
            oWin(2,5,8);
           }
        }
        public static void main(String[]args){
          TicTacToe ttt=new TicTacToe();
          ttt.check();
        }
}