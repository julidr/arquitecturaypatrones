package patronFabricaAbstracta.products;

import java.util.ArrayList;

public class MeatLoversPizza extends Pizza{
	
	public MeatLoversPizza(){
		ingredients = new ArrayList<String>();
		ingredients.add("Cheese");
		ingredients.add("Pepperoni");
		ingredients.add("Meat");
		ingredients.add("Chicken");
		ingredients.add("Bacon");
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
		Thread.sleep(3000);
		System.out.println("Your pizza is ready!");
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		
	}

}
