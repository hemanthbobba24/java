import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JPhotoFrame
{
public static void main(String[] args)
{
int BASE_PRICE = 30;
int MULTIPLE_FEE = 65;
int PET_FEE = 85;
int ON_SITE_FEE = 80;
JFrame frame = new JFrame("Photography Session Estimate Calculator");
JLabel subjectsLabel = new JLabel("How many subjects?");
ButtonGroup subjects = new ButtonGroup();
JCheckBox onePerson = new JCheckBox("One person ($" + BASE_PRICE + ")");
JCheckBox twoPersons = new JCheckBox("Two or more persons (add $" +
MULTIPLE_FEE + ")");
JCheckBox pet = new JCheckBox("Pet (add $" + PET_FEE + ")");
subjects.add(onePerson);
subjects.add(twoPersons);
subjects.add(pet);
JLabel locationLabel = new JLabel("Where will the session occur?");
ButtonGroup location = new ButtonGroup();
JCheckBox atStudio = new JCheckBox("Paula's Portrait Studio");
JCheckBox onsite = new JCheckBox("On-location (add $" + ON_SITE_FEE + ")");
location.add(atStudio);
location.add(onsite);
JLabel priceLabel = new JLabel("The price for your session is:");
JTextField price = new JTextField(15);
price.setEditable(false);
JButton button = new JButton("Calculate!");
frame.add(subjectsLabel);
frame.add(onePerson);
frame.add(twoPersons);
frame.add(pet);
frame.add(locationLabel);
frame.add(atStudio);
frame.add(onsite);
frame.add(button);
frame.add(priceLabel);
frame.add(price);
frame.setSize(250, 300);
frame.setLayout(new FlowLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
button.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e)
{
int total = 0;
if (twoPersons.isSelected())
{
total = BASE_PRICE + MULTIPLE_FEE;
}
else if (pet.isSelected())
{
total = BASE_PRICE + PET_FEE;
}
else
{
total = BASE_PRICE;
}
if (onsite.isSelected())
{
total += ON_SITE_FEE;
}
price.setText("$" + total);
}
});
}
}