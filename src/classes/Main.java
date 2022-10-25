package classes;

public class Main {

	public static void main(String[] args) {
		
		
		CreditManager creditManager = new CreditManager(); //creditManager'a kadar bellegin STACK kisminda tutuluyor
		creditManager.Save();
		
		Customer customer = new Customer();	//<<<==================================================== // ORNEGINI, INSTANCE OLUSTURMAK
		customer.id = 85;																	    // ||
		customer.city = "Baku";		    														// ||								
																								// ||
																								// ||
																								// ||
		CustomerManager customerManager = new CustomerManager(customer);      // BURDAKI customer YUXARIDA NEW ELEDIYIMIZDIR		
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.taxNumber = "1000";
		company.companyName = "Wibty";
		company.id = 100;
		
		
		Person person = new Person();
		person.nationalIdentity = "11";
		
		CustomerManager customerManager2 = new CustomerManager(new Company());
		
		
	}

}
