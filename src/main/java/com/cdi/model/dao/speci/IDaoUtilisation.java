package com.cdi.model.dao.speci;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cdi.model.entites.Utilisation;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IDaoUtilisation {

	@WebMethod
	public void createUtilisation(Utilisation utilisation);

	@WebMethod
	public void updateUtilisation(Utilisation utilisation);

	@WebMethod
	public void deleteUtilisation(Utilisation utilisation);

	@WebMethod
	public Utilisation readUtilisation(int id); 

	@WebMethod
	public Utilisation[] findAllUtilisation();


}
