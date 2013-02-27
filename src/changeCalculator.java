import java.math.*;
import java.lang.Math;
import javax.swing.*;
import java.text.DecimalFormat;

public class changeCalculator {
static String change;
static double decimalChange;
static double quarters = 0;
static double dimes = 0;
static double nickels = 0;
static double pennies = 0;
static double Convereter;

public static String formatDecimal(double number)
{
	double epsilon = 0.004;
	if(Math.abs(Math.round(number)-number)<epsilon)
	{
		return String.format("%10.0f", number);	
	}else
	{
		return String.format("%10.2f", number);
	}
}

public static void main(String args[]){
		
change = JOptionPane.showInputDialog("How much money do you have?");
	if (change == null)
		System.exit(0);
	else if (change == "")
		{
		JOptionPane.showMessageDialog(null,"Please enter a change amount.");
		System.exit(0);
		}
	
decimalChange = Double.parseDouble(change);

if(decimalChange <= 0.00)
	{
	JOptionPane.showMessageDialog(null,"Can't give change for $0.00");	
	System.exit(0);	
	}
	
if(decimalChange % .25 == 0){
	quarters = (decimalChange/0.25);
	JOptionPane.showMessageDialog(null, "You have:\n " +
			"Quarters: "+formatDecimal(quarters)+"\n " +
			"Dimes: "+formatDecimal(dimes)+"\n " +
			"Nickels: "+formatDecimal(nickels)+"\n" +
			"Pennies: "+formatDecimal(pennies)+"\n");
	}
else if(decimalChange % .10 == 0){
	dimes = (decimalChange/.10);
	JOptionPane.showMessageDialog(null, "You have:\n " +
			"Quarters: "+formatDecimal(quarters)+"\n " +
			"Dimes: "+formatDecimal(dimes)+"\n " +
			"Nickels: "+formatDecimal(nickels)+"\n" +
			"Pennies: "+formatDecimal(pennies)+"\n");
	}
else if(decimalChange % .05 == 0){
	nickels = (decimalChange/.05);
	JOptionPane.showMessageDialog(null, "You have:\n " +
			"Quarters: "+formatDecimal(quarters)+"\n " +
			"Dimes: "+formatDecimal(dimes)+"\n " +
			"Nickels: "+formatDecimal(nickels)+"\n" +
			"Pennies: "+formatDecimal(pennies)+"\n");
	}
else if(decimalChange % .01 == 0){
	pennies = (decimalChange/.01);
	JOptionPane.showMessageDialog(null, "You have:\n " +
			"Quarters: "+formatDecimal(quarters)+"\n " +
			"Dimes: "+formatDecimal(dimes)+"\n " +
			"Nickels: "+formatDecimal(nickels)+"\n" +
			"Pennies: "+formatDecimal(pennies)+"\n");
	}

if(decimalChange % .25 > 0){
	quarters = (decimalChange/0.25);
	if((decimalChange/0.25) % 0.10 > 0){
		dimes = (decimalChange/0.10);
		if(((decimalChange/0.25)/0.10) % .05 > 5){
			nickels = (decimalChange/0.05);
			if((((decimalChange/0.25)/0.10)/0.05) % 0.01 > 0){
				pennies = (decimalChange/0.01);
				JOptionPane.showMessageDialog(null, "You have:\n " +
						"Quarters: "+formatDecimal(quarters)+"\n " +
						"Dimes: "+formatDecimal(dimes)+"\n " +
						"Nickels: "+formatDecimal(nickels)+"\n" +
						"Pennies: "+formatDecimal(pennies)+"\n");
			}
			JOptionPane.showMessageDialog(null, "You have:\n " +
					"Quarters: "+formatDecimal(quarters)+"\n " +
					"Dimes: "+formatDecimal(dimes)+"\n " +
					"Nickels: "+formatDecimal(nickels)+"\n" +
					"Pennies: "+formatDecimal(pennies)+"\n");
		}
		JOptionPane.showMessageDialog(null, "You have:\n " +
				"Quarters: "+formatDecimal(quarters)+"\n " +
				"Dimes: "+formatDecimal(dimes)+"\n " +
				"Nickels: "+formatDecimal(nickels)+"\n" +
				"Pennies: "+formatDecimal(pennies)+"\n");
	}
		else if (decimalChange % 0.05 > 0){
			nickels = (decimalChange/0.05);
			if((decimalChange/0.05) % 0.01 > 0){
				pennies = ((decimalChange/0.05)/0.01);
				JOptionPane.showMessageDialog(null, "You have:\n " +
						"Quarters: "+formatDecimal(quarters)+"\n " +
						"Dimes: "+formatDecimal(dimes)+"\n " +
						"Nickels: "+formatDecimal(nickels)+"\n" +
						"Pennies: "+formatDecimal(pennies)+"\n");
				}
			JOptionPane.showMessageDialog(null, "You have:\n " +
					"Quarters: "+formatDecimal(quarters)+"\n " +
					"Dimes: "+formatDecimal(dimes)+"\n " +
					"Nickels: "+formatDecimal(nickels)+"\n" +
					"Pennies: "+formatDecimal(pennies)+"\n");
			}
		else if (decimalChange % 0.01 > 0){
			pennies = (decimalChange/0.01);
			JOptionPane.showMessageDialog(null, "You have:\n " +
					"Quarters: "+formatDecimal(quarters)+"\n " +
					"Dimes: "+formatDecimal(dimes)+"\n " +
					"Nickels: "+formatDecimal(nickels)+"\n" +
					"Pennies: "+formatDecimal(pennies)+"\n");
		}





}


	
	/*JOptionPane.showMessageDialog(null, "You have:\n " +
			"Quarters: "+formatDecimal(quarters)+"\n " +
			"Dimes: "+formatDecimal(dimes)+"\n " +
			"Nickels: "+formatDecimal(nickels)+"\n" +
			"Pennies: "+formatDecimal(pennies)+"\n");*/
	}
}
