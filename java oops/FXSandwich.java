import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FXSandwich
{
public static void main(String[] args)
{
int NVEG = 150;
int VEG = 100;
int EGG = 120;
int RYE = 35;
int MAIDA = 40;
int WHEAT = 45;
JFrame frame = new JFrame("Sandwish Menu.");
JLabel Sandwishlabel = new JLabel("Types Of Sandwish");
ButtonGroup Sandwish = new ButtonGroup();
JToggleButton toggleNVEG = new JToggleButton("Chicken Sandwish (Non Vegeteran)($" +NVEG+")");


JToggleButton toggleVEG = new JToggleButton("Veg. Sandwish (Vegeteran)($"+VEG+ ")");

JToggleButton toggleEGG = new JToggleButton("Egg Sandwish($"+EGG+ ")");
Sandwish.add(toggleNVEG);
Sandwish.add(toggleVEG);
Sandwish.add(toggleEGG);
JLabel Breadlabel = new JLabel("Type of Bread.");
ButtonGroup Bread = new ButtonGroup();
JCheckBox CheckRye = new JCheckBox("Rye Bread (add $" +RYE+ ")");
JCheckBox CheckMaida = new JCheckBox("Maida Bread (add $" +MAIDA+ ")");
JCheckBox CheckWheat = new JCheckBox("Wheat Bread (add $" +WHEAT+ ")");
Bread.add(CheckRye);
Bread.add(CheckMaida);
Bread.add(CheckWheat);
JLabel priceLabel = new JLabel("The price of your order is:");
JTextField price = new JTextField(15);
price.setEditable(false);
JButton button = new JButton("Calculate!");
frame.add(Sandwishlabel);
frame.add(toggleNVEG);
frame.add(toggleVEG);
frame.add(toggleEGG);
frame.add(Breadlabel);
frame.add(CheckRye);
frame.add(CheckMaida);
frame.add(CheckWheat);
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
if (toggleNVEG.isSelected())
{
total = NVEG;
}
else if (toggleVEG.isSelected())
{
total = VEG;
}
else if (toggleEGG.isSelected())
{
total = EGG;
}
if (CheckRye.isSelected())
{
total += RYE;
}
if (CheckMaida.isSelected())
{
total += MAIDA;
}
if (CheckWheat.isSelected())
{
total += WHEAT;
}
price.setText("$" + total);
}
});
}
}