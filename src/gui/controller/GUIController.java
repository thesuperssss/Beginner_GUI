package gui.controller;

import gui.view.GUIFrame;

public class GUIController
{
	@SuppressWarnings("unused")
	private GUIFrame appFrame;
	
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
}
