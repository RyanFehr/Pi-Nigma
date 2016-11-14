package project;


import static org.junit.Assert.*;
import org.junit.Test;


public class TestClass {

	
	@Test
	public void EntryRotorInitialization()
	{
		Rotor entryRotor = new Rotor(6, (short) -1);
		//Passes current through the entry rotor carrying value 0
		assertTrue(entryRotor.internalWiring.passCurrent(0)=='a');
		
	}
	
	@Test
	public void ReflectionRotorInitialization()
	{
		
		Rotor reflectionRotor = new Rotor(6, (short) 0);
		
		//Passes current through the reflection rotor carrying value 0
		assertTrue(reflectionRotor.internalWiring.passCurrent(0)=='d');
	}
	
	@Test
	public void RotorRotation()
	{
		//Initializing the test rotor labeled rotor -2
		Rotor rotateRotor = new Rotor(3, (short) -2);
		
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='a');
		
		//Testing after gear steps
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='b');
		
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='c');
		
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='d');
		
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='e');
		//
		
		
		
		//Testing between gear steps
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='e');
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='e');
		rotateRotor.keyPress();
		assertTrue(rotateRotor.internalWiring.passCurrent(0)=='f');
		//
		
	}
}
