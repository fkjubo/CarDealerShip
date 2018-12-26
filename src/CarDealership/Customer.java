package CarDealership;

public class Customer {
	
	// declaring private variable
	
	private String name;
	private String address;
	private double CashOnHand;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", CashOnHand=" + CashOnHand + "]";
	}
    
	// getters and setters on private variables
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return CashOnHand;
	}
    
	// the cashOnhand discount is 500$
	
	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		CashOnHand = cashOnHand;
	}

	public void PurchaseCar(Vehicle vehicle, Employee emp, boolean finace) {
		
	   emp.HandleCustomer(this, finace, vehicle, emp);
		
	}
}
