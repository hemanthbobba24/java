import javax.swing.*;
import java.awt.event.*;
class JVacationRental extends JFrame implements ActionListener
{
int PARK_SIDE1= 600;
int POOL_SIDE1 = 750;
int LAKE_SIDE1 = 825;
int ONE_BEDROOM1= 75;
int TWO_BEDROOMS1 = 150;
int THREE_BEDROOMS1 = 225;
int MEALS_1= 200;
JLabel jlblLocations1 = new JLabel("LOCATION: ");
JLabel jlblBedrooms1 = new JLabel("BEDROOMS: ");
JLabel jlblMeals1 = new JLabel("INCLUDE MEALS: ");
JRadioButton jrbtnPark1 = new JRadioButton("PARK SIDE");
JRadioButton jrbtnPool1= new JRadioButton("POOL SIDE");
JRadioButton jrbtnLake1= new JRadioButton("LAKE SIDE");
JRadioButton jrbtnOne1 = new JRadioButton("1");
JRadioButton jrbtnTwo1 = new JRadioButton("2");
JRadioButton jrbtnThree1 = new JRadioButton("3");
JRadioButton jrbtnYes1 = new JRadioButton("YES");
JRadioButton jrbtnNo1 = new JRadioButton("NO");
ButtonGroup groupLocations1 = new ButtonGroup();
ButtonGroup groupBedrooms1 = new ButtonGroup();
ButtonGroup groupMeals1 = new ButtonGroup();
JButton jbtnCalculate1 = new JButton(" CALCULATE TOTAL RENT");
JButton jbtnReset1= new JButton("RESET ");
JLabel result1 = new JLabel("TOTAL RENT: $ 0.0");
JPanel jpnlLocations1 = new JPanel();
JPanel jpnlBedrooms1 = new JPanel();
JPanel jpnlMeals1 = new JPanel();
JPanel jpnlButton1 = new JPanel();
JPanel jpnlLabel1 = new JPanel();
JPanel pane1l = new JPanel();
int locationRent1 = 0;
int bedroomsRent1 = 0;
int mealsCost1 = 0;
public JVacationRental()
{
super("LAMBERT’S VACATION RENTALS ");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
groupLocations1.add(jrbtnPark1);
groupLocations1.add(jrbtnPool1);
groupLocations1.add(jrbtnLake1);
groupBedrooms1.add(jrbtnOne1);
groupBedrooms1.add(jrbtnTwo1);
groupBedrooms1.add(jrbtnThree1);
groupMeals1.add(jrbtnYes1);
groupMeals1.add(jrbtnNo1);
jpnlLocations1.add(jlblLocations1);
jpnlLocations1.add(jrbtnPark1);
jpnlLocations1.add(jrbtnPool1);
jpnlLocations1.add(jrbtnLake1);
jpnlBedrooms1.add(jlblBedrooms1);
jpnlBedrooms1.add(jrbtnOne1);
jpnlBedrooms1.add(jrbtnTwo1);
jpnlBedrooms1.add(jrbtnThree1);
jpnlMeals1.add(jlblMeals1);
jpnlMeals1.add(jrbtnYes1);
jpnlMeals1.add(jrbtnNo1);
jpnlButton1.add(jbtnCalculate1);
jpnlButton1.add(jbtnReset1);
jpnlLabel1.add(result1);
pane1l.add(jpnlLocations1);
pane1l.add(jpnlBedrooms1);
pane1l.add(jpnlMeals1);
pane1l.add(jpnlButton1);
pane1l.add(jpnlLabel1);
add(pane1l);
jrbtnPark1.addItemListener(new LocationsListener());
jrbtnPool1.addItemListener(new LocationsListener());
jrbtnLake1.addItemListener(new LocationsListener());
jrbtnOne1.addItemListener(new BedroomsListener());
jrbtnTwo1.addItemListener(new BedroomsListener());
jrbtnThree1.addItemListener(new
BedroomsListener());
jrbtnYes1.addItemListener(new MealsListener());
jrbtnNo1.addItemListener(new MealsListener());
jbtnCalculate1.addActionListener(this);
jbtnReset1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Object source = e.getSource();
if(source == jbtnCalculate1)
{
double totalRent1 = locationRent1 + bedroomsRent1 + mealsCost1;
result1.setText("TOTALRENT: $ " + totalRent1);
}
else if(source == jbtnReset1)
{
groupLocations1.clearSelection();
groupBedrooms1.clearSelection();
groupMeals1.clearSelection();
result1.setText("Total Rent: $ 0.0");
locationRent1 = 0;
bedroomsRent1 = 0;
mealsCost1 = 0;
}
}
class LocationsListener implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
Object source = e.getItem();
if(source == jrbtnPark1)
locationRent1 = PARK_SIDE1;
else if(source == jrbtnPool1)
locationRent1 = POOL_SIDE1;
else if(source == jrbtnLake1)
locationRent1 = LAKE_SIDE1;
else
locationRent1 = 0;
}
}
class BedroomsListener implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
Object source = e.getItem();
if(source == jrbtnOne1)
bedroomsRent1 = ONE_BEDROOM1;
else if(source == jrbtnTwo1)
bedroomsRent1 = TWO_BEDROOMS1;
else if(source == jrbtnThree1)
bedroomsRent1 = THREE_BEDROOMS1;
else
bedroomsRent1 = 0;
}
}
class MealsListener implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
Object source = e.getItem();
if(source == jrbtnYes1)
mealsCost1 = MEALS_1;
else if(source == jrbtnNo1)
mealsCost1 = 0;
else
mealsCost1= 0;
}
}
public static void main(String[] args)
{
JVacationRental frame = new JVacationRental();
frame.setSize(350, 250);
frame.setVisible(true);
}
}