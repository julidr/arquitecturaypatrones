package patronObservador.objetos;


import patronObservador.comportamientos.Observer;
import patronObservador.comportamientos.Subject;

public class User implements Observer{
	
	private String name;
	
	public User(String name){
		this.name = name;
	}

	@Override
	public void update(Subject subject) {
		System.out.println( name + " : " + subject.getState());
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		return name;
	}


}
