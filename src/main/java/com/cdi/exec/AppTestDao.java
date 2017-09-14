package com.cdi.exec;

import java.util.Date;

import com.cdi.model.dao.speci.DaoMachine;
import com.cdi.model.entites.Machine;

public class AppTestDao {
	public static void main(String[] args) {
		/*DaoLieu doaLieu1 = new DaoLieu();
		DaoLieu doaLieu2 = new DaoLieu();

		Lieu lieu1 = new Lieu();
		lieu1.setCode_postal("59000");
		lieu1.setNom("APPLE-STORE");
		lieu1.setNumero("10");
		lieu1.setPays("FRANCE");
		lieu1.setPays("DE LA BASSEE");
		lieu1.setVille("Lille");
		doaLieu1.createLieu(lieu1);
		
	
		Lieu lieu2 = new Lieu();
		lieu2.setNom("nom 2");
		lieu2.setSalle("salle 2 ");
		doaLieu2.createLieu(lieu2);*/

	/****************************************************************/
		
		DaoMachine daoMachine1 = new DaoMachine();
		
		Machine machine1 = new Machine();
		machine1.setDate_achat(new Date(System.currentTimeMillis()));
		machine1.setOs("windows 7");
//		machine1.setRam(16);
		machine1.setReference("machine 1 avec date en util");
		//machine1.setType("developpement");
		daoMachine1.createMachine(machine1);
		
		
		/*Machine machine2 = new Machine();
		machine2.setDate_achat(new Date(System.currentTimeMillis()));
		machine2.setOs("windows 7");
		machine2.setRam(16);
		machine2.setDisponible(Disponible.non_disponible);
		machine2.setRefference("machine 2");
		machine2.setType("developpement");
		machine2.setFonctionnel(Fonctionnel.fonctionnel);
		daoMachine2.createMachine(machine2);*/

		
		
		
		
		

	}
}
