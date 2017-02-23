package patronObservador.comportamientos;

public interface Observer {
	
	public void update(Subject subject);
	public void setName(String name);
	public String getName();

}
