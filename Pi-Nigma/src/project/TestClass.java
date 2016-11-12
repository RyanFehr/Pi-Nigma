package project;


import static org.junit.Assert.*;
import org.junit.Test;


public class TestClass {

	
	@Test
	public void EntryRotorInitialization()
	{
		Rotor entryRotor = new Rotor(6, (short) -1);
		assertTrue(entryRotor.internalWiring.passCurrent(0)=='a');
	}
	
	@Test
	public void ReflectionRotorInitialization()
	{
		Rotor reflectionRotor = new Rotor(6, (short) 0);
		assertTrue(reflectionRotor.internalWiring.passCurrent(0)=='d');
	}
}
