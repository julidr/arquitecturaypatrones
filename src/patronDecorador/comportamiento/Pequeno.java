package patronDecorador.comportamiento;

public class Pequeno implements Sizable{

	@Override
	public double getAumento() {
		return 0;
	}

	@Override
	public String getTamano() {
		return "Pequeño";
	}

}
