package patronDecorador.componentes;

import patronDecorador.comportamiento.Sizable;
import patronDecorador.objetos.Cafe;

public class Expresso extends Cafe{
	
	protected Sizable tamano;
	
	public Expresso(Sizable size){
		tamano = size;
	}

	@Override
	public double getValor() {
		return 2000+(2000*tamano.getAumento());
	}

	@Override
	public String getNombre() {
		return "Expresso " + getTamano();
	}
	
	public void setTamano(Sizable size){
		tamano = size;
	}
	
	public String getTamano(){
		return tamano.getTamano();
	}

}
