package patronPrototipo;

import java.util.ArrayList;

public class Video extends Grafico{

	String tipo;
	ArrayList<Imagen> listaDeImagenes = new ArrayList<>();
	
	@Override
	public Grafico clone() {
		Video video = new Video();
		video.setTipo(this.tipo);
		video.setListaDeImagenes((ArrayList<Imagen>) this.listaDeImagenes.clone());
		return video;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void agregarImagen(Imagen imagen){
		this.listaDeImagenes.add(imagen);
	}
	
	public ArrayList<Imagen> getListaDeImagenes(){
		return this.listaDeImagenes;
	}
	
	public void setListaDeImagenes(ArrayList<Imagen> listaDeImagenes){
		this.listaDeImagenes = listaDeImagenes;
	}

}
