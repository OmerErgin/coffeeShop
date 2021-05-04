package coffeeShop;

public class NeroCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService ) {
		this.customerCheckService=customerCheckService;
	}
	
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to DB: " +customer.firstName);
		}
		else {
			System.out.println("Not a valid person");
			
		}
		
	}
	
}
