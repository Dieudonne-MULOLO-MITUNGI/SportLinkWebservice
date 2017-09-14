package com.cdi.model.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cdi.model.dao.speci.IDaoLieu;
import com.cdi.model.dao.speci.IDaoMachine;
import com.cdi.model.dao.speci.IDaoResponsable;
import com.cdi.model.dao.speci.IDaoUtilisation;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IDaoWebService extends IDaoLieu, IDaoMachine, IDaoResponsable, IDaoUtilisation {

	
	@WebMethod
	public Object queryUniqueResultat(String query);
	
	@WebMethod
	public Object[] queryListResultat(String query);
	
	@WebMethod
	public Object execNamedQueryUniqueResultat(String name);
	
	@WebMethod
	public Object[] execNamedQueryListResultat(String name);

}
