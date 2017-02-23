package patronEstrategia.objetos;

import patronEstrategia.comportamientos.CanFly;
import patronEstrategia.comportamientos.DemocratQuack;


public class PurpleDuck extends Duck {
	
	public PurpleDuck(){
		super.flyBehavior= new CanFly();
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
