package patronDecorador.decoradores;

import patronDecorador.objetos.Adicion;
import patronDecorador.objetos.Cafe;

public class Ron extends Adicion{
	
	public Ron(Cafe cafe){
		super.cafe= cafe;
	}

	@Override
	public double getValor() {
		return 3500+super.cafe.getValor();
	}

	@Override
	public String getNombre() {
		return super.cafe.getNombre()+"\n"+"Ron";
	}

}
