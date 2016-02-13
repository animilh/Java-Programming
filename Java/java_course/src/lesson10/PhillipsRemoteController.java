package lesson10;

public class PhillipsRemoteController implements ITVRemoteController, IDVDRemoteController {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Phillis is playing ...");
		
		
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		System.out.println("Phillis is ejecting ...");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Phillis is stopping ...");
	}

	@Override
	public void startTV() {
		// TODO Auto-generated method stub
		System.out.println("Phillis is starting TV ...");
	}

	@Override
	public void stopTV() {
		// TODO Auto-generated method stub
		System.out.println("Phillis is stopping TV ...");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("Phillis. Channel up ...");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("Phillis. Channel down ...");
	}

	@Override
	public void changeChannel(int newChannel) {
		// TODO Auto-generated method stub
		System.out.println("Phillis is changing the channel ...");
	}
	
	

}
