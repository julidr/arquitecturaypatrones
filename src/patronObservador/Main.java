package patronObservador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import patronObservador.objetos.Channel;
import patronObservador.objetos.User;

public class Main {
	
	public static BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
	public static Channel gameTheory = new Channel();
	
	public static void main(String[] args) {
		gameTheory.setName("Game Theory");
		
		try {
			int opc2=1;
			do{
				System.out.println("Seleccione la opcion que desea realizar: \n");
				System.out.println("1.Suscribir \n2.Desuscribir \n3.Cambiar Estado");
				int opc = Integer.parseInt(leer.readLine());
				switch(opc){
					case 1:
						System.out.println("Suscribiendo al canal : " + gameTheory.getName() + "?");
						System.out.println("Ingrese su nombre");
						String name = leer.readLine();
						User user = new User(name);
						gameTheory.subscribe(user);
					break;
					case 2:
						System.out.println("Ingrese su nombre: ");
						String userName = leer.readLine();
						gameTheory.unSubscribe(userName);
					break;
					case 3:
						System.out.println("Ingrese el cambio de estado: ");
						String state = leer.readLine();
						gameTheory.setState(state);
					break;
					default:
						System.out.println("bye bye");
					break;
				}
				System.out.println("Desea continuar? 1. si 0. no");
				opc2 = Integer.parseInt(leer.readLine());
			}while(opc2!=0);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
