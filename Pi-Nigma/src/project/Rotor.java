package project;

public class Rotor {

	final int gearRatio;
	int steps = 0; 
	RotorCircuit internalWiring;
	
	
	Rotor(int ratio, short rotorNum)
	{
		this.gearRatio = ratio;
		this.internalWiring = new RotorCircuit(rotorNum);
	}
	
	void keyPress()
	{
		steps++;
		if(steps == gearRatio)
		{
			steps = 0;
			internalWiring.rewire();
		}
	}
	
	char passCurrent(char electricity)
	{
		return internalWiring.passCurrent(electricity);
	}
	
	char passCurrent(short electricity)
	{
		return internalWiring.passCurrent(electricity);
	}
}
