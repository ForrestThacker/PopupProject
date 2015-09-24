package input.controller;

import input.view.PopupDisplay;

public class PopupController 
{
	private PopupDisplay myPopups;
	
	public void start()
	{
		myPopups.displayResponse("Words are here");
	}
}