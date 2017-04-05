package patronFabricaAbstracta.factories;

import patronFabricaAbstracta.products.PepperoniPartyPizza;
import patronFabricaAbstracta.products.Pizza;
import patronFabricaAbstracta.products.TropicalPizza;

public class MariosPizza extends Pizzeria{

	@Override
	public String getMenu() {
		return "\n1. Tropical \n2. PepperoniParty";
	}

	@Override
	public Pizza getPizza(int option) {
		switch(option){
		case 1:
			return new TropicalPizza();
		case 2:
			return new PepperoniPartyPizza();
		default:
			return null;
		}
	}

}
