package patronEstrategia.objetos;

import patronEstrategia.comportamientos.Flyable;
import patronEstrategia.comportamientos.Quackable;

public abstract class Duck {
	
	protected Flyable flyBehavior;
	protected Quackable quackBehavior;
	
	public abstract void fly();
	public abstract void quack();
	
}
