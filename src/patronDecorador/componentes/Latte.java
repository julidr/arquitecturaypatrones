package patronDecorador.componentes;

import patronDecorador.comportamiento.Sizable;
import patronDecorador.objetos.Cafe;

public class Latte extends Cafe{
	
	protected Sizable tamano;
	
	public Latte(Sizable size){
		tamano = size;
	}

	@Override
	public double getValor() {
		return 1500+(1500*tamano.getAumento());
	}

	@Override
	public String getNombre() {
		return  "Latte " + getTamano();
	}
	
	public void setTamano(Sizable size){
		tamano = size;
	}
	
	public String getTamano(){
		return tamano.getTamano();
	}

}
