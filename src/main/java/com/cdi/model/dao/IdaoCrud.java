package com.cdi.model.dao;

import java.util.List;

public interface IdaoCrud {

	public void create(Object object);
	public void update(Object object);
	public void delete(Object object);
	
	public Object read(int id,Class<?> c);
	
	public List<?> findAll();
	
	public Object queryUniqueResultat(String query);
	public Object[] queryListResultat(String query);
	
	public Object execNamedQueryUniqueResultat(String name);
	public Object[] execNamedQueryListResultat(String name);
	
	
}
