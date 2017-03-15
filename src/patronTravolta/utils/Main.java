package patronTravolta.utils;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secuence secuence = new Secuence();
		ArrayList<Integer> list = secuence.getHexagonalNumber(11);
		System.out.println(list);
		
		ArrayList<Long> list2 = secuence.getCatalanNumber(10);
		System.out.println(list2);
		
		ArrayList<Integer> list3 = secuence.getFibonacci(10);
		System.out.println(list3);

	}

}
