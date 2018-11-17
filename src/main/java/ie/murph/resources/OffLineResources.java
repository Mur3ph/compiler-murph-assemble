package main.java.ie.murph.resources;

public enum OffLineResources
{

	WELCOME("Welcome Java Virtual Machine"), 
	QUESTIONTOPLAYER("Java Virtual Machine.?"), 
	QUESTIONTODEALER("Java Virtual Machine!?"),
	GOODBYE("Thank you, good bye!");

	private final String text;

	private OffLineResources(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}
}
