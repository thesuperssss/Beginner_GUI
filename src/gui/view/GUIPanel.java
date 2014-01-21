package gui.view;

import java.awt.Color;

import gui.controller.GUIController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
/**
 * 
 * @author jwil1446
 * @version 1.3 added Layout manager
 */

@SuppressWarnings("serial")
public class GUIPanel extends JPanel
{
	
	@SuppressWarnings("unused")
	private GUIController baseController;
	private JButton firstButton;
	private JButton secondButton;
	private SpringLayout baseLayout;
	
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("My first button =Ul<");
		secondButton = new JButton("Look, I made another button!!!");
		
		
		setupPanel();
		setupLayout();
	}

	private void setupPanel()
	{
		this.setBackground(Color.RED);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 75, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, 250, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 248, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, -175, SpringLayout.SOUTH, this);
	}
}

