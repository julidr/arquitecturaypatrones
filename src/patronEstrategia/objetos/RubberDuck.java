package patronEstrategia.objetos;

import patronEstrategia.comportamientos.CantFly;
import patronEstrategia.comportamientos.DemocratQuack;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		super.flyBehavior= new CantFly();
		super.quackBehavior= new DemocratQuack();
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
