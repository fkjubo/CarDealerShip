package CarDealership;

public class Employee {
	
	String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public void HandleCustomer(Customer cus, boolean finance, Vehicle vehicle, Employee emp) {
		if (finance== true) {
			
            double loanMoney = vehicle.getPrice() - cus.getCashOnHand();
            PreProcess(cus, loanMoney);
            TransactionComplete(cus, vehicle, emp);
            
		}else if(vehicle.getPrice() <= cus.getCashOnHand()){
			
			TransactionComplete(cus, vehicle, emp);
			
		}else {
			
			neeMoreMoney(cus,vehicle);
		}
		
	}
	
    private static void PreProcess(Customer cus, double loanMoney) {
		
		System.out.println("Congratulation "+ cus + " you have granted money with " + loanMoney+ " $");
		
	}

	private void neeMoreMoney(Customer cus, Vehicle vehicle) {
		
		System.out.println("Customer: "+ cus + " need more money for the "+ vehicle);
		
	}

	private static void TransactionComplete(Customer cus, Vehicle vehicle, Employee emp) {

       System.out.println("Congratulations, "+ cus+" You have pruchased the car with " + vehicle.getPrice()+" $");
       System.out.println();
       System.out.println("Car name: "+ vehicle.getMake());
       System.out.println("Car model: "+ vehicle.getModel());
       System.out.println("Car year: "+ vehicle.getYear());
       System.out.println("Car price: "+ vehicle.getPrice());
       System.out.println();
       System.out.println("Congratulatuons, "+ emp + " for your sell");

		
	}

}
