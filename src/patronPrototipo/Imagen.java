package patronPrototipo;

public class Imagen extends Grafico{
	
	String tipo;

	@Override
	public Grafico clone() {
		Imagen imagen = new Imagen();
		imagen.setTipo(this.tipo);
		return imagen;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}

}
