package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(customer.NationalityId, customer.Name, customer.Surname, customer.dateofBirth.getYear());
		
	}

}
