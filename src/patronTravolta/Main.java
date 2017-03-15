package patronTravolta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import patronTravolta.implementation.Sequence;
import patronTravolta.implementation.Target;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la f�rmula que desea aplicar: \n1. Hexagonal \n2. Catal�n \n3. Fibonacci");
		int opc = Integer.parseInt(br.readLine());
		System.out.println("Ingrese el n�mero de secuencia");
		int num = Integer.parseInt(br.readLine());
		switch (opc){
			case 1: Target.request(num, Sequence.Hexagonal); break;
			case 2: Target.request(num, Sequence.Catalan); break;
			case 3: Target.request(num, Sequence.Fibonacci); break;
			default: break;
		}
	}

}
