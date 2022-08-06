import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FXInsurance
{
public static void main(String[] args)
{
int HMO = 200;
int PPO = 600;
int dental = 75;
int visione = 20;
JFrame frame = new JFrame("Insurance");
JLabel InsuranceLabel = new JLabel("Types Of Insurance");
ButtonGroup Insurance = new ButtonGroup();
JToggleButton toggleHMO = new JToggleButton("HMO (health maintenance organization)($" +HMO+ ")");

JToggleButton togglePP0 = new JToggleButton("PPO (preferred provider organization)($" +PPO+ ")");

JToggleButton toggleBoth = new JToggleButton("Both Insurance "+(HMO+PPO)+")");


JToggleButton toggleNeither = new JToggleButton("Neither Insurance");
Insurance.add(toggleHMO);
Insurance.add(togglePP0);
Insurance.add(toggleBoth);
Insurance.add(toggleNeither);
JLabel OInsuranceLabel = new JLabel("Other Insurance");
ButtonGroup OInsurance = new ButtonGroup();
JCheckBox CheckDental = new JCheckBox("Dental Insurance (add $" +dental+ ")");
JCheckBox CheckVisione = new JCheckBox("Visione Insurance (add $" +visione+")");

OInsurance.add(CheckDental);
OInsurance.add(CheckVisione);
JLabel priceLabel = new JLabel("The price of your insurance is:");
JTextField price = new JTextField(15);
price.setEditable(false);
JButton button = new JButton("Calculate!");
frame.add(InsuranceLabel);
frame.add(toggleHMO);
frame.add(togglePP0);
frame.add(toggleBoth);
frame.add(toggleNeither);
frame.add(OInsuranceLabel);
frame.add(CheckDental);
frame.add(CheckVisione);
frame.add(button);
frame.add(priceLabel);
frame.add(price);
frame.setSize(400, 300);
frame.setLayout(new FlowLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
button.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e)
{
int total = 0;
if (toggleHMO.isSelected())
{
total = HMO;
}
else if (togglePP0.isSelected())
{
total = PPO;
}
else if (toggleBoth.isSelected())
{
total = HMO + PPO;
}
else if (toggleNeither.isSelected())
{
total = 0;
}
if (CheckDental.isSelected())
{
total += dental;
}
if (CheckVisione.isSelected())
{
total += visione;
}
price.setText("$" + total);
}
});
}
}