package patronTravolta.implementation;

public class Target {
	
	public static void request(int n, Sequence s){
		
		switch (s){
			case Hexagonal: Adapter.requestHexagonal(n); break;
			case Catalan: Adapter.requestCatalan(n); break;
			case Fibonacci: Adapter.requestFibonacci(n); break;
		}
		
	}

}
