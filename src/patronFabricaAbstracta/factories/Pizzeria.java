package patronFabricaAbstracta.factories;

import patronFabricaAbstracta.products.Pizza;

public abstract class Pizzeria {
	
	public static Pizzeria getFactory(PizzeriaPlace pizzeria){
		
		switch(pizzeria){
		case MARIO:
			return new MariosPizza();
		case LUIGI:
			return new LuigisPizza();
		case BOO:
			return new BooPizza();
		default:
			return null;
		}
	}
	
	public abstract String getMenu();
	public abstract Pizza getPizza(int option);

}
