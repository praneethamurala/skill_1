package com.ridesharing;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User Authentication
	        UserAuthentication auth = UserAuthentication.getInstance();
	        System.out.print("Enter your username to log in: ");
	        String username = scanner.nextLine();
	        auth.login(username);

	        // Request Vehicle
	        VehicleFactory vehicleFactory = new VehicleFactory();
	        System.out.print("Enter vehicle type (car, bike, scooter): ");
	        String vehicleType = scanner.nextLine();
	        Vehicle vehicle = vehicleFactory.createVehicle(vehicleType);
	        vehicle.ride();

	        // Choose Payment Method
	        PaymentFactory paymentFactory;
	        System.out.print("Choose payment method (creditcard, paypal, cash): ");
	        String paymentMethod = scanner.nextLine();

	        switch (paymentMethod.toLowerCase()) {
	            case "creditcard":
	                paymentFactory = new CreditCardFactory();
	                break;
	            case "paypal":
	                paymentFactory = new PayPalFactory();
	                break;
	            case "cash":
	                paymentFactory = new CashFactory();
	                break;
	            default:
	                throw new IllegalArgumentException("Unknown payment method: " + paymentMethod);
	        }

	        PaymentMethod payment = paymentFactory.createPaymentMethod();
	        payment.pay(50.0);  // Assume a fixed amount for the ride

	        scanner.close();
	    }

}
