package hw19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import hw19.Song;

public class SongIOTest {

	public static void main(String[] args) {

		Song song1 = new Song("100-150", "Kontrol", 3.20, "BG Punk");
		Song song2 = new Song("Chicho", "Review", 3.50, "BG Punk");
		Song song3 = new Song("Reka", "Class", 4.20, "BG Punk");
		Song song4 = new Song("Bager", "Kokosha glawa", 2.60, "BG Punk");

		Playlist myList1 = new Playlist("MyList1", 4);
		myList1.addSong(song1);
		myList1.addSong(song2);
		myList1.addSong(song3);
		myList1.addSong(song4);

		Playlist myList2 = new Playlist("MyList2", 4);

		File playList = new File("C:\\SoftAcad\\iotest\\playlist.txt");
		try {
			boolean created = playList.createNewFile();
			if (created) {
				System.out.println(playList.getName() + " is created.");
			} else {
				System.out.println(playList.getName() + " already exists.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(playList);
			oos = new ObjectOutputStream(os);
			for (int i = 0; i < myList1.playlist.length; i++) {
				oos.writeObject(myList1.playlist[i]);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		InputStream is = null;
		ObjectInputStream ois = null;

		try {
			is = new FileInputStream(playList);
			ois = new ObjectInputStream(is);

			for (int i = 0; i < myList2.playlist.length; i++) {
				myList2.playlist[i] = (Song) ois.readObject();
				Song.printSong(myList2.playlist[i]);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
