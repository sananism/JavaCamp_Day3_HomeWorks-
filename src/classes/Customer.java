package classes;

public class Customer {            // OZELLIK TUTUCU CLASS
	
	public Customer(){			 // CONSTRUCTOR // YAPICI BLOCK
	//	System.out.println(" Customer object started");   // customer NESNESI NEW'LENDIKDE CALISIR
		
	}
	
	int id;
	String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

		
}
