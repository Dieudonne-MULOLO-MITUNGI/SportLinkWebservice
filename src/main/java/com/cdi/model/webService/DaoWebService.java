package com.cdi.model.webService;

import javax.jws.WebService;

import com.cdi.model.dao.DoaCrud;
import com.cdi.model.dao.speci.DaoLieu;
import com.cdi.model.dao.speci.DaoMachine;
import com.cdi.model.dao.speci.DaoResponsable;
import com.cdi.model.dao.speci.DaoUtilisation;
import com.cdi.model.entites.Lieu;
import com.cdi.model.entites.Machine;
import com.cdi.model.entites.Responsable;
import com.cdi.model.entites.Utilisation;

@WebService(endpointInterface= "com.cdi.model.webService.IDaoWebService")
public class DaoWebService implements IDaoWebService {

	DaoLieu        daoLieu;
	DaoUtilisation daoUtilisation;
	DaoMachine     daoMachine;
	DaoResponsable daoResponsable;
	
	DoaCrud daoCrud;
	
	/********************************************************************************/
	/********************************************************************************/
	public DaoWebService() {
		
		daoCrud = new DoaCrud();
		
		daoLieu = new DaoLieu();
		daoUtilisation = new DaoUtilisation();
		daoMachine = new DaoMachine();
		daoResponsable = new DaoResponsable();
		
		
	}
	/********************************************************************************/
	/********************************************************************************/

	public void createLieu(Lieu lieu) {
		daoLieu.createLieu(lieu);
		
	}

	public void updateLieu(Lieu lieu) {
		daoLieu.updateLieu(lieu);
		
	}

	public void deleteLieu(Lieu lieu) {
		daoLieu.deleteLieu(lieu);
		
	}

	public Lieu readLieu(int id) {
		return daoLieu.readLieu(id);
	}

	public Lieu[] findAllLieu() {
		return daoLieu.findAllLieu();
	}

	public void createMachine(Machine machine) {
		daoMachine.createMachine(machine);
		
	}

	public void updateMachine(Machine machine) {
		daoMachine.updateMachine(machine);
		
	}

	public void deleteMachine(Machine machine) {
		daoMachine.deleteMachine(machine);
		
	}

	public Machine readMachine(int id) {
		return daoMachine.readMachine(id);
	}

	public Machine[] findAllMachine() {
		return daoMachine.findAllMachine();
	}

	public void createResponsable(Responsable responsable) {
		daoResponsable.createResponsable(responsable); 
		
	}

	public void updateResponsable(Responsable responsable) {
		daoResponsable.updateResponsable(responsable);
	}

	public void deleteResponsable(Responsable responsable) {
		daoResponsable.deleteResponsable(responsable);
		
	}

	public Responsable readResponsable(int id) {
		return daoResponsable.readResponsable(id); 
	}

	public Responsable[] findAllResponsable() {
		return daoResponsable.findAllResponsable();
	}

	public void createUtilisation(Utilisation utilisation) {
		daoUtilisation.createUtilisation(utilisation);
		
	}

	public void updateUtilisation(Utilisation utilisation) {
		daoUtilisation.updateUtilisation(utilisation);
		
	}

	public void deleteUtilisation(Utilisation utilisation) {
		daoUtilisation.deleteUtilisation(utilisation);
		
	}

	public Utilisation readUtilisation(int id) {
		return daoUtilisation.readUtilisation(id);
	}

	public Utilisation[] findAllUtilisation() {
		return daoUtilisation.findAllUtilisation();
	}
	public Object queryUniqueResultat(String query) {
		return daoCrud.queryUniqueResultat(query);
	}
	public Object[] queryListResultat(String query) {
		return daoCrud.queryListResultat(query);
	}
	public Object execNamedQueryUniqueResultat(String name) {
		return daoCrud.execNamedQueryUniqueResultat(name);
	}
	public Object[] execNamedQueryListResultat(String name) {
		return daoCrud.execNamedQueryListResultat(name); 
	}
	

	
}
