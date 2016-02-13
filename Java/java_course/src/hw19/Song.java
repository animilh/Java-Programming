package hw19;

import java.io.Serializable;

public class Song implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4681201061617539732L;
	private String songName;
	private String band;
	private double duration;
	private transient String genre;

	Song(String name, String band, double duration, String genre) {

		setSongName(name);
		setBand(band);
		setDuration(duration);
		setGenre(genre);

	}

	public static void printSong(Song song) {
		System.out.println(song.getSongName() + ", " + song.getBand() + ", "
				+ song.getDuration() + " min.");
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		if ("".equals(songName)) {
			System.out.println("Invalid song name!");
			return;
		}
		this.songName = songName;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		if ("".equals(band)) {
			System.out.println("Invalid band name!");
			return;
		}
		this.band = band;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if (duration <= 0) {
			System.out.println("Invalid song duration!");
			return;
		}
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		if ("".equals(genre)) {
			System.out.println("Invalid music genre!");
			return;
		}
		this.genre = genre;
	}
}
