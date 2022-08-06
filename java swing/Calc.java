import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calc extends JFrame implements ActionListener
{
	JTextField textfield;
	JLabel label;
	JButton numberbuttons[]=new JButton[10];
	JButton functionbuttons[]=new JButton[8];
	JButton addbutton,subbutton,divbutton,mulbutton;
	JButton clrbutton,delbutton,decbutton,eqlbutton;
	JPanel panel;
	ImageIcon image;
	Font font=new Font("poppins",Font.BOLD,20);
	double num1=0,num2=0,result;
	char operator;
    Calc()
    {
        image =new ImageIcon("pug.jpg");
        setIconImage(image.getImage());
    	setTitle("Calculator");
    	setSize(500,530);
    	setDefaultCloseOperation(3);
    	setLayout(null);
    	label=new JLabel("");
    	label.setBounds(400,10,300,80);
    	label.setFont(font);
    	getContentPane().setBackground(Color.white);
    	textfield=new JTextField();
    	textfield.setBounds(20,20,300,40);
    	textfield.setFont(font);
    	//textfield.setEditable(false);
    	panel=new JPanel();
        panel.setLayout(new GridLayout(4,4,10,10));
    	panel.setBounds(50,80,300,300);
    	panel.setBackground(Color.white);
    	addbutton=new JButton("+");
    	subbutton=new JButton("-");
    	mulbutton=new JButton("*");
    	divbutton=new JButton("/");
    	clrbutton=new JButton("clear");
    	delbutton=new JButton("delete");
    	eqlbutton=new JButton("=");
    	decbutton=new JButton(".");
    	functionbuttons[0]=addbutton;
    	functionbuttons[1]=subbutton;
    	functionbuttons[2]=mulbutton;
    	functionbuttons[3]=divbutton;
    	functionbuttons[4]=eqlbutton;
    	functionbuttons[5]=decbutton;
    	functionbuttons[6]=clrbutton;
    	functionbuttons[7]=delbutton;
    	for(int i=0;i<8;i++)
    	{
    		functionbuttons[i].addActionListener(this);
    		functionbuttons[i].setFont(font);
    		//functionbuttons[i].setEditable(false);
    		functionbuttons[i].setFocusable(false);
    	}
    	 for(int i=0;i<10;i++)
    	 {
            numberbuttons[i]=new JButton(" "+i);
    	 	numberbuttons[i].addActionListener(this);
    	 	numberbuttons[i].setFont(font);
    	 	//numberbuttons[i].setEditable(false);
            numberbuttons[i].setFocusable(false);
    	 }
    	  clrbutton.setBounds(150,430,100,50);
    	  delbutton.setBounds(250,430,100,50);
    	  panel.add(numberbuttons[1]);
    	  panel.add(numberbuttons[2]);
    	  panel.add(numberbuttons[3]);
    	  panel.add(addbutton);
    	  panel.add(numberbuttons[4]);
    	  panel.add(numberbuttons[5]);
    	  panel.add(numberbuttons[6]);
    	  panel.add(subbutton);
    	  panel.add(numberbuttons[7]);
    	  panel.add(numberbuttons[8]);
    	  panel.add(numberbuttons[9]);
    	  panel.add(mulbutton);
    	  panel.add(decbutton);
    	  panel.add(numberbuttons[0]);
    	  panel.add(eqlbutton);
    	  panel.add(divbutton);
    	  add(label);
    	  add(clrbutton);
    	  add(delbutton);
    	  add(panel);
    	  add(textfield);
    	  setVisible(true);
    }
     public void actionPerformed(ActionEvent e)
     {
        for(int i=0;i<10;i++)
        {
        	if(e.getSource()==numberbuttons[i])
        	{
        		textfield.setText(textfield.getText().concat(String.valueOf(i)));
        	}
        }
        	if(e.getSource()==decbutton)
        	{
        		textfield.setText(textfield.getText().concat(String.valueOf(".")));
        	}
        	if(e.getSource()==addbutton)
        	{
        		num1=Double.parseDouble(textfield.getText());
        		operator='+';
        		label.setText(textfield.getText().concat(String.valueOf(operator)));
        		textfield.setText(" ");
        	
        	}
        	if(e.getSource()==subbutton)
        	{
        		num1=Double.parseDouble(textfield.getText());
        		operator='-';
        		label.setText(textfield.getText().concat(String.valueOf(operator)));
        		textfield.setText(" ");
        		
        	}
        	if(e.getSource()==mulbutton)
        	{
        		num1=Double.parseDouble(textfield.getText());
        		operator='*';
        		label.setText(textfield.getText().concat(String.valueOf(operator)));
        		textfield.setText(" ");
        	
        	}
        	if(e.getSource()==divbutton)
        	{
        		num1=Double.parseDouble(textfield.getText());
        		operator='/';
        		label.setText(textfield.getText().concat(String.valueOf(operator)));
        		textfield.setText(" ");
        	}
        	if(e.getSource()==eqlbutton)
        	{
        		num2=Double.parseDouble(textfield.getText());
        		switch(operator)
        		{
        			case '+':
        			 result=num1+num2;
        			 break;
        			 case '-':
        			 result=num1-num2;
        			 break;
        			 case '*':
        			 result=num1*num2;
        			 break;
        			 case '/':
        			 result=num1/num2;
        			 break;
        		}
        		 label.setText(result+"");
        		 textfield.setText(result+"");
        	}
        		if(e.getSource()==clrbutton)
        		{
        			textfield.setText(" ");
        		}
        		if(e.getSource()==delbutton)
        		{
        			String str=textfield.getText();
        			textfield.setText("");
        			for(int i=0;i<str.length()-1;i++)
        			{
        				textfield.setText(textfield.getText()+str.charAt(i));
        			}
        		}
        	
        
     }
	public static void main(String[]args)
	{
		Calc cal=new Calc();
	}
}