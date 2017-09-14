package com.cdi.model.dao;

import java.util.List;
//import java.util.*;

import org.hibernate.Session;

import com.cdi.model.util.HibernateUtil;

public class DoaCrud implements IdaoCrud {

	//@Override 
	public void create(Object object)
	{

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(object);
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
	public void update(Object object) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.merge(object);
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
	public void delete(Object object) {

		Session session = null;

		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			session.remove(object);
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
	public Object read(int id, Class<?> c) {

		Session session = null;
		Object object = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			object = session.find(c, id);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return object;
	}

	/*************************************************************/

//	@Override
	public List<?> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*************************************************************/
	/*************************************************************/

//	@Override
	public Object queryUniqueResultat(String query) {
		Session session = null;
		Object object = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			
			object = session.createNativeQuery(query).getSingleResult();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return object;
	}

	/*************************************************************/
	/*************************************************************/
	public Object[] queryListResultat(String query){
	
		Session session = null;
		List<?> list = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			
			list = session.createNativeQuery(query).getResultList();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return list.toArray(new Object[list.size()]);
	}
	
	/*************************************************************/

//	@Override
	public Object execNamedQueryUniqueResultat(String name) {
		
		Session session = null;
		Object object = null;
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			
			object = session.createNamedQuery(name).getSingleResult();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return object;
	}
	
	/*************************************************************/
	public Object[] execNamedQueryListResultat(String name){
		Session session = null; 
		List<?> list = null; 
		try {

			session = HibernateUtil.buildSessionFactory().openSession();
			session.beginTransaction();
			
			list = session.createNamedQuery(name).getResultList();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null)
				session.getTransaction().rollback();
		}
		return list.toArray(new Object[list.size()]);
	}

}
