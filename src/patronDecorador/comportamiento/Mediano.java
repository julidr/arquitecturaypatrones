package patronDecorador.comportamiento;

public class Mediano implements Sizable{

	@Override
	public double getAumento() {
		return 0.3;
	}

	@Override
	public String getTamano() {
		return "Mediano";
	}

}
