package com.cdi.model.dao.speci;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cdi.model.entites.Responsable;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IDaoResponsable {

	@WebMethod
	public void createResponsable(Responsable responsable);

	@WebMethod
	public void updateResponsable(Responsable responsable);

	@WebMethod
	public void deleteResponsable(Responsable responsable);

	@WebMethod
	public Responsable readResponsable(int id);

	@WebMethod
	public Responsable[] findAllResponsable();


}
