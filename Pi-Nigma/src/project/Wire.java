package project;


//Represents a wire between two points represented by characters
public abstract class Wire {
	char Source;
	char Target;
	
	Wire(char s, char t)
	{
		this.Source = s;
		this.Target = t;
	}
}
