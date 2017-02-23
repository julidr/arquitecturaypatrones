package patronDecorador.decoradores;

import patronDecorador.objetos.Adicion;
import patronDecorador.objetos.Cafe;

public class Arequipe extends Adicion{
	
	public Arequipe(Cafe cafe){
		super.cafe= cafe;
	}

	@Override
	public double getValor() {
		
		return 1700+super.cafe.getValor();
	}

	@Override
	public String getNombre() {
		return super.cafe.getNombre()+"\n"+"Arequipe";
	}

}
