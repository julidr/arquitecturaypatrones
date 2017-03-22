package patronPrototipo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Pintucaritas toolkit = new Pintucaritas();
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Elija la Opcion que Desea Realizar");
		System.out.println("\n 1.Imagen \n 2. Video");
		int opc = Integer.parseInt(leer.readLine());
		switch(opc){
			case 1:
				System.out.println("Elija el tipo de Imagen");
				String tipoImagen = leer.readLine();
				System.out.println("Creando Imagen...");
				Imagen imagen = new Imagen();
				imagen.setTipo(tipoImagen);
				toolkit.setPrototipo(imagen);
				System.out.println("Se ha creado la imagen: " + imagen.getTipo());
			break;
			case 2:
				System.out.println("Elija el tipo de Video");
				String tipoVideo = leer.readLine();
				Video video = new Video();
				video.setTipo(tipoVideo);
				System.out.println("Quiere agregar una imagen? \n 1.Si \n 2.No");
				int opc2 = Integer.parseInt(leer.readLine());
				do{
					if(opc2==1){
						System.out.println("Elija el tipo de Imagen");
						String tipoImagen2 = leer.readLine();
						System.out.println("Creando Imagen...");
						Imagen imagen2 = new Imagen();
						imagen2.setTipo(tipoImagen2);
						System.out.println("Se ha creado la imagen: " + imagen2.getTipo());
						video.agregarImagen(imagen2);
					}
					System.out.println("Seguir agregando? \n 1.Si \n 2.No");
					opc2 = Integer.parseInt(leer.readLine());
					
				}while(opc2!=2);
				toolkit.setPrototipo(video);
				System.out.println("Se ha creado el Video: " + video.getTipo());
				System.out.println("Lista: ");
				for(int i=0; i<video.getListaDeImagenes().size(); i++){
					System.out.println("Imagen: " + video.listaDeImagenes.get(i).getTipo());
				}
				System.out.println("Clonando por que si el Video...");
				Video video2 = (Video) toolkit.getNewInstance();
				System.out.println("Video 2: " + video2.getTipo());
				for(int i=0; i<video2.getListaDeImagenes().size(); i++){
					System.out.println("Imagen: " + video2.listaDeImagenes.get(i).getTipo());
				}
		}

	}

}
