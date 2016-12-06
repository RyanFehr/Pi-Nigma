package project;

import java.util.HashMap;

public class PatchPanel {
	
	private PatchCable cable1 = new PatchCable('/', '/', 1);
	private PatchCable cable2 = new PatchCable('/', '/', 2);
	private PatchCable cable3 = new PatchCable('/', '/', 3);
	private HashMap<Character,Character> plugPanel = new HashMap<>();
	
	PatchPanel()
	{
		for(int i = 97; i<123; i++)
		{
			plugPanel.put((Character)(char)i, (Character)(char)i);
		}
	}
	
	
	//Plugs the specified cable into the specified plugs linking them together in series, if the cable is already plugged into the panel it removes the cable first
	void insertCable(int cableNo, char plug1, char plug2)
	{
		switch(cableNo)
		{
		case 1:
			//Unplug the cable from the panel
			removeCable(1);
			
			//Plug the cable into its' new plugs
			cable1.setSource(plug1);
			cable1.setTarget(plug2);
			
			plugPanel.put(plug1, plug2);
			plugPanel.put(plug2, plug1);
			break;
		case 2:
			//Unplug the cable from the panel
			removeCable(2);
			
			//Plug the cable into its' new plugs
			cable2.setSource(plug1);
			cable2.setTarget(plug2);
			
			plugPanel.put(plug1, plug2);
			plugPanel.put(plug2, plug1);
			break;
		case 3:
			//Unplug the cable from the panel
			removeCable(3);
			
			//Plug the cable into its' new plugs
			cable3.setSource(plug1);
			cable3.setTarget(plug2);
			
			plugPanel.put(plug1, plug2);
			plugPanel.put(plug2, plug1);
			break;
		}
	}
	
	
	//Unplugs a cable from the patch panel
	void removeCable(int cableNo)
	{
		switch(cableNo)
		{
		case 1:
			//Sets the entry and exit point of the plugs to themselves
			plugPanel.put(cable1.getSource(), cable1.getSource());
			plugPanel.put(cable1.getTarget(),cable1.getTarget());
			break;
		case 2:
			//Sets the entry and exit point of the plugs to themselves
			plugPanel.put(cable2.getSource(), cable2.getSource());
			plugPanel.put(cable2.getTarget(),cable2.getTarget());
			break;
		case 3:
			//Sets the entry and exit point of the plugs to themselves
			plugPanel.put(cable3.getSource(), cable3.getSource());
			plugPanel.put(cable3.getTarget(),cable3.getTarget());
			break;
		}
	}
	
	char passCurrent(char input)
	{
		//pass through the plug given
		return plugPanel.get(input);
	}
	
}
