package patronTravolta.utils;

import java.util.ArrayList;

public class Secuence {
	
	public ArrayList<Integer> getHexagonalNumber(int n){
		ArrayList<Integer> results = new ArrayList<Integer>();
		int h;
		for(int i=1; i<=n; i++){
			h=i*((2*i)-1);
			results.add(h);
		}
		return results;
	}
	
	public ArrayList<Long> getCatalanNumber(int n){
		ArrayList<Long> results = new ArrayList<Long>();
		long c;
		for(int i=0; i<n; i++){
			c= ((getFactorial(2*i))/((getFactorial(i+1)*getFactorial(i))));
			results.add(c);
		}
		return results;
	}
	
	public ArrayList<Integer> getFibonacci(int n){
		ArrayList<Integer> fibonnaci = new ArrayList<Integer>();
		for (int i=0; i<n; i++){
			if(i==0 || i==1){
				fibonnaci.add(1);
			}else{
				fibonnaci.add(fibonnaci.get(i-2)+fibonnaci.get(i-1));
			}
		}
		return fibonnaci;
	}
	
	public long getFactorial(int number){
		long factorial=1;
		for(int i=number; i>0; i--){
			factorial = factorial*i;
		}
		return factorial;
	}

}
