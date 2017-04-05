package patronFabricaAbstracta.products;

import java.util.ArrayList;

public abstract class Pizza {
	
	public int size;
	public ArrayList<String> ingredients;
	public String base;
	public String dough;
	
	public  void setSize(int size){
		this.size = size;
	};
	
	public void setBase(String base){
		this.base = base;
	};
	public void setDough(String dough){
		this.dough = dough;
	};
	
	public abstract void Produce();
	

}
