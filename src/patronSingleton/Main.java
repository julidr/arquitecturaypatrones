package patronSingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = null;
		System.out.println("Getting Singleton...");
		singleton = Singleton.getSingleton();
		System.out.println("Created singleton: " + singleton);
		Singleton singleton2 = null;
		System.out.println("Getting singleton2...");
		singleton2 = Singleton.getSingleton();
		System.out.println("Created singleton: " + singleton2);

	}

}
