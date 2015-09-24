package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController 
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	
	{
		String name = myPopups.getAnswer("Type in yo slave name");
		
		myPopups.displayResponse("Dat booty tho Alert!");
		
		int age;
		String tempAge = myPopups.getAnswer("Type in your age slaya");
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12345678;
		}
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		String tempWeight= myPopups.getAnswer("Type in your weight");
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		
		}
		else
		{
			weight = -.9999990000001;
		
		}
		
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = new Thing(name, age, weight);
		
		myPopups.displayResponse(myThing.toString());
	}
	
	private boolean isInteger(String input)
	{

	boolean isInt= false;
	
	try
	{
		int validInteger = Integer.parseInt(input);
		isInt = true;
	}

	catch(NumberFormatException error)
	{
		myPopups.displayResponse("You  not type in a valid integer!");
	}
	
	return isInt;
	
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		try
		{
			double validDouble =Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You didn't take in a valid response!");
		}
		return isDouble;
	}
}	