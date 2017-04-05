package patronFabricaAbstracta.factories;

import patronFabricaAbstracta.products.MeatLoversPizza;
import patronFabricaAbstracta.products.Pizza;
import patronFabricaAbstracta.products.TropicalPizza;

public class BooPizza extends Pizzeria{

	@Override
	public String getMenu() {
		return "\n1. Tropical \n2. MeatLovers";
		
	}

	@Override
	public Pizza getPizza(int option) {
		switch(option){
		case 1:
			return new TropicalPizza();
		case 2:
			return new MeatLoversPizza();
		default:
			return null;
		}
	}

}
