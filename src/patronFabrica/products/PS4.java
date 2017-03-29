package patronFabrica.products;

public class PS4 extends Console{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("(Synthetic voice)Turning On PS4");
		try {
			Thread.sleep(8000);
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
		System.out.println("tan chan Now Playing PS4 tan chan");
	}

}
