package patronDecorador.componentes;

import patronDecorador.comportamiento.Sizable;
import patronDecorador.objetos.Cafe;

public class Capuchino extends Cafe{
	
	protected Sizable tamano;
	
	public Capuchino(Sizable size){
		tamano = size;
	}
	
	@Override
	public double getValor() {
		return 2500+(2500*tamano.getAumento());
	}

	@Override
	public String getNombre() {
		return "Capuchino " + getTamano();
	}
	
	public void setTamano(Sizable size){
		tamano = size;
	}
	
	public String getTamano(){
		return tamano.getTamano();
	}

}
