package patronFabrica.products;

public class Switch extends Console{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("(Synthetic voice)Turning On Nintendo Switch");
		try {
			Thread.sleep(4000);
			System.out.println("...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("(Synthetic voice)Turning Off...");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("tu ru ru ru Now Playing Nintendo Switch tu ru ru ru");
	}

}
