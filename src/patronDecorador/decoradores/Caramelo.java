package patronDecorador.decoradores;

import patronDecorador.objetos.Adicion;
import patronDecorador.objetos.Cafe;

public class Caramelo extends Adicion{
	
	public Caramelo(Cafe cafe){
		super.cafe = cafe;
	}

	@Override
	public double getValor() {
		return 1200+super.cafe.getValor();
	}

	@Override
	public String getNombre() {
		return super.cafe.getNombre()+"\n"+"Caramelo";
	}

}
