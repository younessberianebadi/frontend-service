package io.digiwise.frontendservice;

import javax.persistence.*;
import java.util.Date;


public class Absence {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private  Date dateAbsence;

	private long idJoueur;
	
	
	public Absence() {
		super();
	}
	public Absence(Date dateAbsence, long idJoueur) {
		super();
		this.dateAbsence = dateAbsence;
		this.idJoueur = idJoueur;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateAbsence() {
		return dateAbsence;
	}
	public void setDateAbsence(Date dateAbsence) {
		this.dateAbsence = dateAbsence;
	}
	public long getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(long idJoueur) {
		this.idJoueur = idJoueur;
	}
	
	
	
	

}
