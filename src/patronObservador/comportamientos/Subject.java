package patronObservador.comportamientos;

public interface Subject {
	
	public void subscribe(Observer obs);
	public void unSubscribe(String userName);
	public String getState();
	public void setState(String state);

}
