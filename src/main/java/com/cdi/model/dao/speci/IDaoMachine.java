package com.cdi.model.dao.speci;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cdi.model.entites.Machine;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IDaoMachine {

	@WebMethod
	public void createMachine(Machine machine);

	@WebMethod
	public void updateMachine(Machine machine);

	@WebMethod
	public void deleteMachine(Machine machine);

	@WebMethod
	public Machine readMachine(int id);

	@WebMethod
	public Machine[] findAllMachine();


}
