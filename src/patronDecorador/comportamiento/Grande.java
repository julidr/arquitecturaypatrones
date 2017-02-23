package patronDecorador.comportamiento;

public class Grande implements Sizable{

	@Override
	public String getTamano() {
		return "Grande";
	}

	@Override
	public double getAumento() {
		return 0.5;
	}

}
