package com.cdi.model.dao.speci;

import java.util.ArrayList;

import org.hibernate.Session;

import com.cdi.model.entites.Utilisation;
import com.cdi.model.util.HibernateUtil;

public class DaoUtilisation implements IDaoUtilisation {

	//@Override
	public void createUtilisation(Utilisation utilisation)
	{

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(utilisation);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}finally{
			if(session!= null)
				session.close();
				
				}

	}

	/*************************************************************/

	//@Override
	public void updateUtilisation(Utilisation utilisation) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(utilisation);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}finally{
			if(session!= null)
				session.close();
				
				}

	}

	/*************************************************************/

	//@Override
	public void deleteUtilisation(Utilisation utilisation) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.remove(utilisation);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}finally{
			if(session!= null)
				session.close();
				
				}

	}

	/*************************************************************/
//	@Override
	public Utilisation readUtilisation(int id) {

		Session session = null;
		Utilisation utilisation = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			utilisation = session.find(Utilisation.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return utilisation;
	}

	/*************************************************************/

//	@Override
	@SuppressWarnings({ "deprecation", "unchecked" })
	public Utilisation[] findAllUtilisation() {
		Session session = null;
		ArrayList<Utilisation> utilisations = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			utilisations = (ArrayList<Utilisation>) session.getNamedQuery("Utilisation.findAll").list();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return utilisations.toArray(new Utilisation[utilisations.size()]);
	}

}
