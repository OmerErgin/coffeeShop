package coffeeShop;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		try {KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();
		return mernisValidation.TCKimlikNoDogrula(customer.nationalityId, customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		}
		catch (Exception e) {
			return false;
		}
		
		}

}
