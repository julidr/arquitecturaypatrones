package patronFabricaAbstracta.factories;

import patronFabricaAbstracta.products.MeatLoversPizza;
import patronFabricaAbstracta.products.PepperoniPartyPizza;
import patronFabricaAbstracta.products.Pizza;

public class LuigisPizza extends Pizzeria{

	@Override
	public String getMenu() {
		return "\n1. MeatLovers \n2. PepperoniParty";
		
	}

	@Override
	public Pizza getPizza(int option) {
		switch(option){
		case 1:
			return new MeatLoversPizza();
		case 2:
			return new PepperoniPartyPizza();
		default:
			return null;
		}
	}

}
