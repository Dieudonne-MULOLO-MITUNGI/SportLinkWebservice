package com.cdi.model.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.cdi.model.enumeration.Disponible;
import com.cdi.model.enumeration.Fonctionnel;
import com.cdi.model.enumeration.Role;
import com.cdi.model.enumeration.Type;

@Entity
@Table(name = "Machine")
@NamedQuery(name = "Machine.findAll", query = "SELECT m FROM Machine m")
public class Machine implements Serializable {

	// private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull  // @Column(nullable = false) 
	@Enumerated(EnumType.STRING)
	private Role role;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Disponible disponible;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Fonctionnel fonctionnel;
	
	@NotNull
	private  int ram;
		
	@NotNull
	@Enumerated(EnumType.STRING)
	private Type type;

	private String reference;

	@NotNull
	private String os;
	
	private Date date_achat;

	@NotNull
	public Role getRole() {
		return role;
	}
	
	public Machine() {
		// TODO Auto-generated constructor stub
	}



	public void setRole(Role role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Disponible getDisponible() {
		return disponible;
	}

	public void setDisponible(Disponible disponible) {
		this.disponible = disponible;
	}

	public Fonctionnel getFonctionnel() {
		return fonctionnel;
	}

	public void setFonctionnel(Fonctionnel fonctionnel) {
		this.fonctionnel = fonctionnel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String refference) {
		this.reference = refference;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Date getDate_achat() {
		return date_achat;
	}
	
	// Nouvelles méthodes get et set 
	
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	

}
