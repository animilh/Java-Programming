package hw19;

public class Playlist {

	private String name;
	Song[] playlist;

	Playlist(String name, int length) {
		setName(name);
		playlist = new Song[length];
	}

	public void addSong(Song song) {
		if (song == null) {
			System.out.println("Bad input for song");
			return;

		} else {
			for (int i = 0; i < playlist.length; i++) {
				if (playlist[i] == null) {
					playlist[i] = song;
					return;
				}
			}
		}
	}

	public void emptyPlaylist(Playlist list) {
		list = new Playlist(list.getName(), 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if ("".equals(name)) {
			System.out.println("Invalid playlist name!");
			return;
		}
		this.name = name;
	}

}
