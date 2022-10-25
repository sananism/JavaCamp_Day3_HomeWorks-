package classes;

public class CustomerManager {		// OPERATION TUTUCU CLASS

	
	private Customer _customer;    // BENI CALISTIRA BILMEK ICIN BANA 1 TANE MUSTERI VER !!  // BUNU ELEDIK CUNKI ASAGIDAKI customer'a SAVE'de ulasa bilmiyorduk cunki SAVE baska bir method
	public CustomerManager(Customer customer) {     // CONSTRUCTOR
		
		this._customer = customer;
		
	}

	
	
	public void Save() {  // BIZ ASLINDA BURDA MUSTERI NESNESINI PARAMETRE OLARAK GONDERIYORUZ
		System.out.println(" Customer Saved : " + _customer.id);
	}
	
	public void Delete() {  
		System.out.println(" Customer Deleted : " + _customer.id);
	}
}
