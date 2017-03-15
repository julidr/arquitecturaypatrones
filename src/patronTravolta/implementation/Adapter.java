package patronTravolta.implementation;

import java.util.ArrayList;

import patronTravolta.utils.Secuence;

public class Adapter {
	
	public static void requestHexagonal(int n){
		Secuence secuence = new Secuence();
		ArrayList<Integer> list = secuence.getHexagonalNumber(n);
		System.out.println(list);
	}
	
	public static void requestCatalan(int n){
		Secuence secuence = new Secuence();
		ArrayList<Long> list2 = secuence.getCatalanNumber(n);
		System.out.println(list2);
	}
	
	public static void requestFibonacci(int n){
		Secuence secuence = new Secuence();
		ArrayList<Integer> list3 = secuence.getFibonacci(n);
		System.out.println(list3);
	}

}
