package com.cdi.model.dao.speci;

import java.util.ArrayList;

import org.hibernate.Session;

import com.cdi.model.entites.Lieu;
import com.cdi.model.util.HibernateUtil;

public class DaoLieu implements IDaoLieu {

	//@Override
	public void createLieu(Lieu lieu)
	{

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(lieu);
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
	public void updateLieu(Lieu lieu) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(lieu);
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
	public void deleteLieu(Lieu lieu) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.remove(lieu);
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
	public Lieu readLieu(int id) {

		Session session = null;
		Lieu lieu = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			lieu = session.find(Lieu.class, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return lieu;
	}

	/*************************************************************/

//	@Override
	@SuppressWarnings({ "deprecation", "unchecked" })
	public Lieu[] findAllLieu() {
		Session session = null;
		ArrayList<Lieu> lieux = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			lieux = (ArrayList<Lieu>) session.getNamedQuery("Lieu.findAll").list();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return lieux.toArray(new Lieu[lieux.size()]);
	}

	/*************************************************************/


}
