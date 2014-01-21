package gui.model;

public class Whatchamacallit
{
	private String description;
	private int clickCount;
	
	public Whatchamacallit()
	{
		this.description = "black";
		this.clickCount = -10;
	}

	public String getDescription()
	{
		return description;
	}

	public int getClickCount()
	{
		return clickCount;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setClickCount(int clickCount)
	{
		this.clickCount = clickCount;
	}
}
