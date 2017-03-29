package patronFabrica.products;

public class XboxOne extends Console{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("(Synthetic voice)Turning On Xbox One");
		try {
			Thread.sleep(11000);
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
		System.out.println("brrrrr Now Playing Xbox One brrrrr");
	}

}
