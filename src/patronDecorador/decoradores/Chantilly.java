package patronDecorador.decoradores;

import patronDecorador.objetos.Adicion;
import patronDecorador.objetos.Cafe;

public class Chantilly extends Adicion{
	
	public Chantilly(Cafe cafe){
		super.cafe= cafe;
	}

	@Override
	public double getValor() {
		return 2400+super.cafe.getValor();
	}

	@Override
	public String getNombre() {
		return super.cafe.getNombre()+"\n"+"Chantilly";
	}

}
