package project;

//The reason for this class is to put a limit on patch cables and improve code readability
public class PatchCable extends Wire{
	
	
	final int serialNo;
	
	PatchCable(char s, char t, int serial) {
		super(s, t);
		
		///There are a limited number of patch cables so serialNo are given
		this.serialNo = serial;
	}
	
	char passCurrent(int direction)
	{
		if(direction == 0){return this.Target;}
		else if(direction == 1) {return this.Source;}
		return '/';
	}
	
	
	char getSource()
	{
		return Source;
	}
	
	void setSource(char s)
	{
		Source = s;
	}
	
	char getTarget()
	{
		return Target;
	}
	void setTarget(char t)
	{
		Target = t;
	}
}
