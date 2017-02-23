package patronDecorador;

import java.util.Scanner;

import patronDecorador.componentes.Capuchino;
import patronDecorador.componentes.Expresso;
import patronDecorador.componentes.Latte;
import patronDecorador.comportamiento.Grande;
import patronDecorador.comportamiento.Mediano;
import patronDecorador.comportamiento.Pequeno;
import patronDecorador.decoradores.Arequipe;
import patronDecorador.decoradores.Caramelo;
import patronDecorador.decoradores.Chantilly;
import patronDecorador.decoradores.Ron;
import patronDecorador.objetos.Cafe;

public class Main {
	
	private static Scanner leer= new Scanner(System.in);

	public static void main(String[] args) {
		Cafe cafe;
		
		System.out.println("Selecciones el Cafe que desea:");
		System.out.println("1.Capuchino \n2.Expresso \n3.Latte");
		int opc1= leer.nextInt();
		System.out.println("Seleccione el tamaño que desea: ");
		System.out.println("1.Pequeño \n2.Mediano \n3.Grande");
		int opc4= leer.nextInt();
		switch(opc1){
			case 1:
				if(opc4==1){
					cafe = new Capuchino(new Pequeno());
				} 
				else if(opc4==2){
					cafe = new Capuchino(new Mediano());
				}
				else{
					cafe = new Capuchino(new Grande());
				}
				System.out.println(imprimir(cafe));
				agregarAdicion(cafe);
			break;
			case 2:
				if(opc4==1){
					cafe = new Expresso(new Pequeno());
				} 
				else if(opc4==2){
					cafe = new Expresso(new Mediano());
				}
				else{
					cafe = new Expresso(new Grande());
				}
				System.out.println(imprimir(cafe));
				agregarAdicion(cafe);
			break;
			case 3:
				if(opc4==1){
					cafe = new Latte(new Pequeno());
				} 
				else if(opc4==2){
					cafe = new Latte(new Mediano());
				}
				else{
					cafe = new Latte(new Grande());
				}
				System.out.println(imprimir(cafe));
				agregarAdicion(cafe);
			break;
			default:
				System.out.println("Chao");
			break;
		}
	}
	
	public static String imprimir(Cafe cafe){
		return "Orden: \n" + cafe.getNombre() + "\nPrecio: " + cafe.getValor();
	}
	
	public static void agregarAdicion(Cafe cafe){
			int opc2;
		do{
			System.out.println("Desea agregar una adicion?");
			System.out.println("1. Si 2.No");
			opc2= leer.nextInt();
			if(opc2!=2){
				System.out.println("Que adicion desea?");
				System.out.println("1.Caramelo \n2.Chantilly \n3.Arequipe \n4.Ron");
				int opc3= leer.nextInt();
				switch(opc3){
					case 1:
						cafe = new Caramelo(cafe);
						System.out.println(imprimir(cafe));
					break;
					case 2:
						cafe = new Chantilly(cafe);
						System.out.println(imprimir(cafe));
					break;
					case 3:
						cafe = new Arequipe(cafe);
						System.out.println(imprimir(cafe));
					break;
					case 4:
						cafe = new Ron(cafe);
						System.out.println(imprimir(cafe));
					break;
					default:
					break;
				}
			}
			else{
				System.out.println("Compra Final: "+imprimir(cafe));
			}
		}while(opc2!=2);
	}

}
