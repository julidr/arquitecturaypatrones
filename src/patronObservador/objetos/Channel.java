package patronObservador.objetos;

import java.util.ArrayList;

import patronObservador.comportamientos.Observer;
import patronObservador.comportamientos.Subject;

public class Channel implements Subject{
	
	private String state;
	private String name;
	private ArrayList<Observer> observersList;
	
	public Channel(){
		observersList = new ArrayList<>();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public void subscribe(Observer obs) {
		observersList.add(obs);
		
	}

	@Override
	public void unSubscribe(String userName) {
		boolean isUser=false;
		for(int i=0; i<observersList.size(); i++){
			if(observersList.get(i).getName().equalsIgnoreCase(userName)){
				observersList.remove(i);
				isUser=true;
			}
		}
		if(isUser==false){
			System.out.println("El usuario no existe");
		}

	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public void setState(String state) {
		this.state = state;
		for(int i=0; i<observersList.size(); i++){
			observersList.get(i).update(this);
		}
	}
	
	

}
