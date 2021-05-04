package coffeeShop;

public class Main {

	public static void main(String[] args) {
			Customer customer1=new Customer(); 
			customer1.setId(15);
			customer1.setFirstName("Ömer");
			customer1.setLastName("Ergin");
			customer1.setDateOfBirth(2000);
			customer1.setNationalityId(Long.parseLong("12345678901"));;
			
			
			BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
			customerManager.save(customer1);

			
			
	}

}
