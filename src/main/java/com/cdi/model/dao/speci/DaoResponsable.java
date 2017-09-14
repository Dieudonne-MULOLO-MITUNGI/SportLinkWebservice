package com.cdi.model.dao.speci;

import java.util.ArrayList;

import org.hibernate.Session;

import com.cdi.model.entites.Responsable;
import com.cdi.model.util.HibernateUtil;

public class DaoResponsable implements IDaoResponsable {

	//@Override
	public void createResponsable(Responsable reponsable)
	{

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(reponsable);
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
	public void updateResponsable(Responsable reponsable) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(reponsable);
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
	public void deleteResponsable(Responsable reponsable) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.remove(reponsable);
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
	public Responsable readResponsable(int id) {

		Session session = null;
		Responsable reponsable = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			reponsable = session.find(Responsable.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return reponsable;
	}

	/*************************************************************/

//	@Override
	@SuppressWarnings({ "deprecation", "unchecked" })
	public Responsable[] findAllResponsable() {
		Session session = null;
		ArrayList<Responsable> responsables = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			responsables = (ArrayList<Responsable>) session.getNamedQuery("Responsable.findAll").list();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return responsables.toArray(new Responsable[responsables.size()]);
	}

	

	/*************************************************************/


}
