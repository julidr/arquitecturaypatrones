package patronFabrica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import patronFabrica.factory.ConsoleFactory;
import patronFabrica.factory.ConsolesType;
import patronFabrica.products.Console;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		ConsoleFactory consoleFactory = new ConsoleFactory();
		Console console;
		int opc;
		do{
			System.out.println("Elija la consola que desea crear");
			System.out.println("\n1.Nintendo Switch \n2.Play Station 4 \n3.Xbox One \n0.Salir");
			opc = Integer.parseInt(leer.readLine());
			console = consoleFactory.create(ConsolesType.fromInteger(opc));
			if(console!=null){
				console.turnOn();
				console.play();
				console.turnOff();
			}
		
		}while(opc!=0);
		
		

	}

}
