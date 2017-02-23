package patronEstrategia;

import patronEstrategia.objetos.Duck;
import patronEstrategia.objetos.WoodenDuck;

public class Main {
	
	private static Duck genericDuck;
	
	public static void main(String[] arg){
		genericDuck= new WoodenDuck();
		genericDuck.fly();
		genericDuck.quack();
	}

}
