package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
	
	void Add(Customer customer) throws NumberFormatException,RemoteException;
	void Delete(Customer customer);
	void Update(Customer customer);
	

}
