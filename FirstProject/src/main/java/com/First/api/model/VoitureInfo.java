package com.First.api.model;

public class VoitureInfo {
	private int id;
	private String Matri;
	private String Modele ;
	private String Puissance;
	
	public VoitureInfo(int id, String matri, String modele, String puissance) {
		super();
		this.id = id;
		Matri = matri;
		Modele = modele;
		Puissance = puissance;

}
	public int getId_voiture() {
		return id;
	}
	public void setId_voiture(int id_voiture) {
		this.id = id_voiture;
	}
	public String getNumMatri() {
		return Matri;
	}
	public void setNumMatri(String numMatri) {
		Matri = numMatri;
	}
	public String getModele() {
		return Modele;
	}
	public void setModele(String modele) {
		Modele = modele;
	}
	public String getPuissance() {
		return Puissance;
	}
	public void setPuissance(String puissance) {
		Puissance = puissance;
	}

}
