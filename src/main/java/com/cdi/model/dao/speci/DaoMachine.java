package com.cdi.model.dao.speci;

import java.util.ArrayList;

import org.hibernate.Session;

import com.cdi.model.entites.Machine;
import com.cdi.model.util.HibernateUtil;

public class DaoMachine implements IDaoMachine {

	// @Override
	public void createMachine(Machine machine) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(machine);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();

		}

	}

	/*************************************************************/

	// @Override
	public void updateMachine(Machine machine) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			//session.persist(machine);
			session.saveOrUpdate(machine);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();

		}

	}

	/*************************************************************/

	// @Override
	public void deleteMachine(Machine machine) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			System.out.println("Suppression machien...");
			session.remove(machine);
			session.getTransaction().commit();
			System.out.println("Fin de la Suppression machien...");
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();

		}

	}

	/*************************************************************/
	// @Override
	public Machine readMachine(int id) {

		Session session = null;
		Machine machine = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			machine = session.find(Machine.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return machine;
	}

	/*************************************************************/

	// @Override
	@SuppressWarnings({ "deprecation", "unchecked" })
	public Machine[] findAllMachine() {
		
		Session session = null;
		ArrayList<Machine> machines = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			machines = (ArrayList<Machine>) session.getNamedQuery("Machine.findAll").list();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (session != null)
				session.getTransaction().rollback();
		}
		return machines.toArray(new Machine[machines.size()]);
		
	}

	/*************************************************************/



}
