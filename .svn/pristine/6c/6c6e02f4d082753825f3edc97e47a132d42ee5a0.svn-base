package com.cdi.model.dao.speci;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cdi.model.entites.Lieu;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IDaoLieu {

	@WebMethod
	public void createLieu(Lieu lieu);

	@WebMethod
	public void updateLieu(Lieu lieu);

	@WebMethod
	public void deleteLieu(Lieu lieu);

	@WebMethod
	public Lieu readLieu(int id);

	@WebMethod
	public Lieu[] findAllLieu();

}
