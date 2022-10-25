package interfaces;

public class CustomerManager{
	
	private ICreditManager _creditManager;
	
	public CustomerManager(ICreditManager creditManager) {
		this._creditManager = creditManager;
		
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredit Verildi");
	}

}
