package play;

import java.util.ArrayList;
import brani.Canzone;

public class Playlist {
	public ArrayList<Canzone> playlist = new ArrayList<Canzone>();
	
	public void aggiungi(String u, int d, String c) {
		this.playlist.add( new Canzone(u,d,c));
	}
	
	public void eliminaAutore(String c) {
		for (int i = 0; i < playlist.size(); i++) {
			if (playlist.get(i).autore == c) {
				this.playlist.remove(i);
				i--;
			}
		}
	}
	
	public boolean haDuplicati() {
		boolean x = false;
		for (int i = 0; i < playlist.size(); i++) 
			for (int j = 0; j < playlist.size(); j++) {
			if (playlist.get(i).autore == playlist.get(j).autore 
					&& playlist.get(i).durata == playlist.get(j).durata && i != j) {
				x = true; break; }
			else x = false;
		}
		return x;
	}
	
	public int quanteAutore(String c) {
		int x = 0;
		for (int i = 0; i < playlist.size(); i++)
			if (playlist.get(i).autore == c) {
				x++;
		}
		return x;
	}
	
	public int quanteCanzoni() {
		return playlist.size();
	}
	
	public void stampaAutore(String c) {
		for (int i = 0; i < playlist.size(); i++)
			if (playlist.get(i).autore == c)
		System.out.println(playlist.get(i));
	}
}


