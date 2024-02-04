package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrello {
	
	private String nomeCliente;
	private ArrayList<Prodotto> prodotti;
	private int quantita;
	
	public Carrello(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.prodotti = new ArrayList<Prodotto>();
	}
	
	public void aggiungiProdotto(Prodotto p, int q) {
		this.quantita = q;
		int i = 0;
		while(i < q)
		{
			this.prodotti.add(p);
			i++;
		}
	}
	
	public double totale() {
		double totale = 0.0;
		for (Prodotto prodotto : prodotti) {
			totale += prodotto.getPrezzo();
		}
		return totale;
	}
	
	public double totalePromozione() {
		double totalePromo = 0.0;
		for (Prodotto prodotto : prodotti) {
			if(prodotto.isInPromozione() == true) {
				totalePromo += prodotto.getPrezzo();
			}
		}
		return totalePromo;
	}
	
	public int numeroTotaleProdotti() {
		return this.prodotti.size();
	}
	
	public HashMap<Prodotto, Integer> prodottiOrdinati() {
		HashMap<Prodotto, Integer> mapOfProducts = new HashMap<>();
		
		for (Prodotto item : prodotti) {
			mapOfProducts.put(item, mapOfProducts.getOrDefault(item, 0) + 1);
        }
		
		return mapOfProducts;
	}

}
