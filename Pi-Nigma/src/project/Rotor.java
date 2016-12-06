package project;

public class Rotor {

	final int gearRatio;//No longer being used, but may be used in the future
	int steps = 0; //was used with gear ratio
	RotorCircuit internalWiring;
	Rotor leftRotor;
	Rotor rightRotor;
	
	Rotor(int ratio, short rotorNum)
	{
		this.gearRatio = ratio;
		this.internalWiring = new RotorCircuit(rotorNum);
	}
	
	
	//This method needs to be moved elsewhere, I don't think it belongs inside the scope of a Rotor
	//widen the scope of Keypress and then make a more common method that checks offset and rewires that is a common to all 3 internal rotors
	void keyPress()
	{
		short offset = internalWiring.offset;
		if(offset == 25)
		{
			//advanceNextRotor();
		}
		internalWiring.rewire();
		
//		steps++;
//		if(steps == gearRatio)
//		{
//			steps = 0;
//		}
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
