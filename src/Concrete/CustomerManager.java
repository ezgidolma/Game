package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService{

private ICustomerCheckService _customerCheckService;
	
	public CustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}
	
	@Override
	public void Add(Customer customer) throws NumberFormatException, RemoteException {
		if (_customerCheckService.CheckIfRealPerson(customer))
			System.out.println("Oyuncu " + customer.Name + " eklendi.");
		else
			System.out.println("Not a valid person");
	}

	@Override
	public void Delete(Customer customer) {
		System.out.println("Oyuncu" +customer.Name+"silindi .");
		
	}

	@Override
	public void Update(Customer customer) {
		System.out.println("Oyuncu" +customer.Name+"güncellendi .");
		
	}

}
