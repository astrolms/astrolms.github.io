package model;

import java.util.ArrayList;

public class Ordinazione {
	
	private String nomeCliente;
	
	private ArrayList<Portata> portate;
	
    private ArrayList<Integer> quantitaOrdinate;

	public Ordinazione(String nomeCliente) {
		
		this.nomeCliente = nomeCliente;
		this.portate = new ArrayList<Portata>();
		this.quantitaOrdinate = new ArrayList<>();
	}

	public void aggiungiPortata(Portata p, int q) {
		this.portate.add(p);
		this.quantitaOrdinate.add(q);
	}
	
	public double conto() {
        double contoTotale = 0.0;
        for (int i = 0; i < portate.size(); i++) {
        	contoTotale += portate.get(i).getPrezzo() * quantitaOrdinate.get(i);
        }
        return contoTotale;
    }
	
	public double contoBevande() {
		double contoBevande = 0.0;
		
		for(int i = 0; i < quantitaOrdinate.size(); i++) {
			if(portate.get(i).isBevanda() == true)
				contoBevande += quantitaOrdinate.get(i) * portate.get(i).getPrezzo();
		}
		return contoBevande;
	}
	
	public int numeroTotalePortate() {
		int nrPortate = 0;
		
		for (int i = 0; i < quantitaOrdinate.size(); i++) {
			nrPortate += quantitaOrdinate.get(i);
		}
		
		return nrPortate;
	}
	
	public String portateOrdinate() {
		String portata = "";
		for (int i = 0; i < portate.size(); i++) {
			portata += portate.get(i) + " - " + quantitaOrdinate.get(i).intValue() + "\n"; 
		}
		return portata;
	}
}
