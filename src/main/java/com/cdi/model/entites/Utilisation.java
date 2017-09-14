package com.cdi.model.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Utilisation")
@NamedQuery(name = "Utilisation.findAll", query = "SELECT u FROM Utilisation u")
public class Utilisation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne  //(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Machine machine;

	@OneToOne // (fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Lieu lieu;

	@OneToOne  //(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Responsable responsable;

	@NotNull
	private String nom_formation;
	@NotNull
	private Date date_debut_formation;
	@NotNull
	private Date date_fin_formation;
	
	private String ref_formation;
	
	private Date date_prise_pc;
	private Date date_rendu_pc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public String getNom_formation() {
		return nom_formation;
	}

	public void setNom_formation(String nom_formation) {
		this.nom_formation = nom_formation;
	}

	public Date getDate_debut_format() {
		return date_debut_formation;
	}

	public void setDate_debut_format(Date date_debut_format) {
		this.date_debut_formation = date_debut_format;
	}

	public Date getDate_fin_format() {
		return date_fin_formation;
	}

	public void setDate_fin_format(Date date_fin_format) {
		this.date_fin_formation = date_fin_format;
	}

	public String getRef_formation() {
		return ref_formation;
	}

	public void setRef_formation(String ref_formation) {
		this.ref_formation = ref_formation;
	}

	public Date getDate_prise_pc() {
		return date_prise_pc;
	}

	public void setDate_prise_pc(Date date_prise_pc) {
		this.date_prise_pc = date_prise_pc;
	}

	public Date getDate_rendu_pc() {
		return date_rendu_pc;
	}

	public void setDate_rendu_pc(Date date_rendu_pc) {
		this.date_rendu_pc = date_rendu_pc;
	}

}
