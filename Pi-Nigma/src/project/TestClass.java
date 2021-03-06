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
	
	
	
	@Test
	public void PatchCableInitialization()
	{
		PatchCable cable1 = new PatchCable('a','z',1);
		//
		assertTrue(cable1.serialNo==1);
		assertTrue(cable1.passCurrent(0)=='z');
		assertTrue(cable1.passCurrent(1)=='a');
		
	}
	
	@Test
	public void PatchPanelCurrentTest()
	{
		PatchPanel front = new PatchPanel();
		
		assertTrue(front.passCurrent('a') == 'a');
		
		assertTrue(front.passCurrent('b') == 'b');
		
		assertTrue(front.passCurrent('e') == 'e');
		
		assertTrue(front.passCurrent('f') == 'f');
		
		assertTrue(front.passCurrent('z') == 'z');
		
		
		assertFalse(front.passCurrent('x') == 'd');
		
		assertFalse(front.passCurrent('b') == 'c');
		
		assertFalse(front.passCurrent('r') == 'y');
		
		assertFalse(front.passCurrent('z') == 'a');
	}
	
	@Test
	public void PatchPanelSingleCableTest()
	{
		
		PatchPanel front = new PatchPanel();
		
		
		assertTrue(front.passCurrent('a') == 'a');
		
		//Plug a cable into plugs 'a' and 'd'
		front.insertCable(1, 'a', 'd');
		assertTrue(front.passCurrent('a') == 'd');
				
		assertTrue(front.passCurrent('d') == 'a');
		
		//Unplug cable 1 from the patch panel
		front.removeCable(1);
		assertTrue(front.passCurrent('a') == 'a');
		
		
	}
}
