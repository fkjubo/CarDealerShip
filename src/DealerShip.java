import java.util.Scanner;

import CarDealership.Customer;
import CarDealership.Employee;
import CarDealership.Vehicle;

public class DealerShip {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// taking input from the customer
		
		System.out.println("Which car brand you want? ");
		String CusName= input.nextLine();
		
		Customer cus = new Customer();
		System.out.println("Please, enter the customer name: ");
		cus.setName(input.nextLine());
		System.out.println("Please, enter the customer address: ");
		cus.setAddress(input.nextLine());
		System.out.println("Please, enter the cash amount customer has on hand: ");
		cus.setCashOnHand(input.nextDouble());
		
		// stock information about the cars
		
		Vehicle car1 = new Vehicle("BMW", "Model 7", "2018", 35000);
		Vehicle car2 = new Vehicle("Toyota", "Corolla", "2018", 20000);
		Vehicle car3 = new Vehicle("Tesla", "Model 3", "2018", 50000);
		Vehicle car4 = new Vehicle("Mercedes", "Model S", "2018", 45000);
		Vehicle car5 = new Vehicle("Honda", "Accord", "2018", 25000);
		
		// employee information
		
		Employee emp = new Employee("Nishi");
		
		// choosing the car brand based on the customer input
		
		if (CusName.equals("BMW")) {
			
			cus.PurchaseCar(car1, emp, true);
			
		}else if (CusName.equals("Toyota")) {
			
			cus.PurchaseCar(car2, emp, false);
			
		}else if (CusName.equals("Tesla")) {
			
			cus.PurchaseCar(car3, emp, true);
			
		}else if (CusName.equals("Mercedes")) {
			
			cus.PurchaseCar(car4, emp, true);
			
		}else if (CusName.equals("Honda")) {
			
			cus.PurchaseCar(car5, emp, false);
			
		}else {
			
			System.out.println("Sorry, we don't have stock right now");
		}
		
		// closing the input scanner
		
		input.close();
		
		System.exit(0);
		
		
	}

}
