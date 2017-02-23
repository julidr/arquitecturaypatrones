package patronEstrategia.objetos;

import patronEstrategia.comportamientos.CanFly;
import patronEstrategia.comportamientos.RepublicanQuack;

public class BlackDuck extends Duck{
	
	public BlackDuck(){
		super.flyBehavior= new CanFly();
		super.quackBehavior = new RepublicanQuack();
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
