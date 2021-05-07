package com.First.api.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.First.api.entities.Voiture;
import com.First.api.model.VoitureInfo;

public class VoitureDAO  {
private EntityManager entityManager;
	
	public Voiture findbyId(int id) {
	return this.entityManager.find(Voiture.class, id);
	
	}
	public List<VoitureInfo> listVoitureInfo(){
	String sql = "Select new" + VoitureInfo.class.getName()//
			+"(v.id,v.model,v.NumMati,v.Puissance)"//
			+"from" + Voiture.class.getName()+"v";
	
	Query query= entityManager.createQuery(sql, VoitureInfo.class);
	return query.getResultList();
	}
	}
