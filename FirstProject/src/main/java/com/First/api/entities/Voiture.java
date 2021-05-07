package com.First.api.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_voiture")
	private int id;

	@Column(name = "NumMatri")
	private String Matri;

	@Column(name = "Puissance")
	private String puissance;
	
	@Column(name = "modele")
	private String modele;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatri() {
		return Matri;
	}

	public void setMatri(String matri) {
		Matri = matri;
	}

	public String getPuissance() {
		return puissance;
	}

	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}


}
