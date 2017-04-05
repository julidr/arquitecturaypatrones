package patronFabricaAbstracta.products;

import java.util.ArrayList;

public class PepperoniPartyPizza extends Pizza{
	
	public PepperoniPartyPizza(){
		ingredients = new ArrayList<String>();
		ingredients.add("Cheese");
		ingredients.add("Pepperoni");
	}

	@Override
	public void Produce() {
		System.out.println("Adding ingredients...");
		for(int i=0; i<ingredients.size(); i++){
			System.out.println(ingredients.get(i));
		}
		System.out.println("Putting in oven...");
		System.out.println("Baking...");
		try{
		Thread.sleep(5000);
		System.out.println("Your pizza is ready!");
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		
	}
}
