package patronSingleton;

public class Singleton {
	public volatile static Singleton instance = null;
	
	public static Singleton getSingleton(){
		if (instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	

}
