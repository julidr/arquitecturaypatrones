package patronEstrategia.objetos;

import patronEstrategia.comportamientos.CantFly;
import patronEstrategia.comportamientos.CantQuack;

public class WoodenDuck extends Duck{
	
	public WoodenDuck(){
		super.flyBehavior = new CantFly();
		super.quackBehavior = new CantQuack();
	}

	@Override
	public void fly() {
		super.flyBehavior.fly();
	}

	@Override
	public void quack() {
		super.quackBehavior.quack();
	}

}
