package patronFabricaAbstracta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import patronFabricaAbstracta.factories.Pizzeria;
import patronFabricaAbstracta.factories.PizzeriaPlace;
import patronFabricaAbstracta.products.Pizza;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		Pizzeria myPizzeria;
		Pizza myPizza;
		System.out.println("--Bienvenido al menú de pizzerias--");
		System.out.println("Elija el lugar donde quiere comprar:\n1. Mario's Pizza\n2. Luigi's Pizza\n3. Boo Pizza");
		int opc = Integer.parseInt(br.readLine());
		myPizzeria = Pizzeria.getFactory(PizzeriaPlace.fromInteger(opc));
		System.out.println("Elija la pizza que desea comprar: "+myPizzeria.getMenu());
		opc = Integer.parseInt(br.readLine());
		myPizza = myPizzeria.getPizza(opc);
		myPizza.Produce();
		
	}

}
