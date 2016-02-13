package lesson10;

public class SamsungDVDRemoteController implements IDVDRemoteController {

	public void play() {
		System.out.println("Samsung is playing ...");
	}

	public void eject() {
		System.out.println("Samsung is ejecting ...");
	}

	public void stop() {
		System.out.println("Samsung is stoping ...");
	}

}
