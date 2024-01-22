package canzoneplaylist;

import play.Playlist;
import brani.Canzone;

public class CanzonePlaylist{
public static void main(String[] args) {
//brani.Canzone
	Canzone s1 = new Canzone("a",200,"c1");
	Canzone s2 = new Canzone("a",300,"c2");
	Canzone s3 = new Canzone("a3",400,"c3");
	System.out.println(s1);
	System.out.println(s1.haAutore("c1"));
	System.out.println(s1.haAutore("c2"));
	System.out.println(s1.uguali(s2));
	System.out.println(s1.uguali(s3));

//play.Playlist
	Playlist pref = new Playlist();
	pref.aggiungi("Forever young", 300, "Bob Dylan");
	pref.aggiungi("Tomorrow never comes", 300, "The Beatles");
	pref.aggiungi("To Ramona", 400, "Bob Dylan");
	pref.aggiungi("She's leaving home", 150, "The Beatles");
	pref.aggiungi("Martha my dear", 300, "The Beatles");
	pref.aggiungi("Someday never comes", 430, "Creedence Clearwater Revival");
	
	System.out.println("----------------------Playlist:---------------------");
	for (int i = 0; i < pref.quanteCanzoni(); i++) {
		System.out.println(pref.playlist.get(i));
	}
	System.out.println("----------------------------------------------------");
	
	System.out.println("Canzoni di Bob Dylan: " + pref.quanteAutore("Bob Dylan"));
	System.out.println("Canzoni di The Beatles: " + pref.quanteAutore("The Beatles"));
	System.out.println("Canzoni di Franco Califano: " + pref.quanteAutore("Franco Califano"));
	System.out.println("Canzoni di Creedence Clearwater Revival: " + pref.quanteAutore("Creedence Clearwater Revival"));
	
	System.out.println("----------------------------------------------------");
	System.out.println("I canzoni di The Beatles:");
	pref.stampaAutore("The Beatles");
	
	pref.eliminaAutore("The Beatles");
	
	System.out.println("----------------------------------------------------");
	System.out.println("-----Playlist dopo aver eliminato The Beatles-------");
	for (int i = 0; i < pref.quanteCanzoni(); i++) {
		System.out.println(pref.playlist.get(i));
	}
	System.out.println("----------------------------------------------------");
	
	
	pref.stampaAutore("The Beatles");
	
	System.out.println("Ci sono " + pref.quanteAutore("Bob Dylan") + " canzoni di Bob Dylan");
	System.out.println("Ci sono " + pref.quanteAutore("The Beatles") + " canzoni di The Beatles");
	System.out.println("Ci sono " + pref.quanteAutore("Creedence Clearwater Revival") + " canzoni di Creedence Clearwater Revival");

	System.out.println("----------------------------------------------------");
	System.out.println("Ci sono canzoni uguali: " + pref.haDuplicati());

	
	pref.aggiungi("To Ramona", 400, "Bob Dylan");
	System.out.println("-----Playlist dopo aver aggiunto Bob Dylan----------");
	for (int i = 0; i < pref.quanteCanzoni(); i++) {
		System.out.println(pref.playlist.get(i));
	}
	System.out.println("----------------------------------------------------");
	System.out.println("Ci sono canzoni uguali: " + pref.haDuplicati());
}
}