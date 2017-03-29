package patronFabrica.factory;

import patronFabrica.products.Console;
import patronFabrica.products.PS4;
import patronFabrica.products.Switch;
import patronFabrica.products.XboxOne;

public class ConsoleFactory {
	
	public Console create(ConsolesType consolesType){
		try {
			switch(consolesType){
			case SWITCH:
				return new Switch();
			case PS4:
				return new PS4();
			case XBOXONE:
				return new XboxOne();
			default:
				return null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

}
