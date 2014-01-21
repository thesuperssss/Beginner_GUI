package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;
/**
 * GUI framework class for Java GUI
 * @author jwil1446
 * @version 1.3 added setContentPane(basePanel)
 */
@SuppressWarnings("serial")
public class GUIFrame extends JFrame
{
	@SuppressWarnings("unused")
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(300,500);
		this.setVisible(true);
	}

}

