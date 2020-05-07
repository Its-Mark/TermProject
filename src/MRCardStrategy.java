/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

public class MRCardStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	/**
	 * default constructor
	 */
	public MRCardStrategy(){
		name = null;
		cardNumber = null;
		cvv = null;
		dateOfExpiry = null;
	}
	/**
	 * Overloaded constructor
	 * @param name
	 * @param cardNumber
	 * @param cvv
	 * @param dateOfExpiry
	 */
	public MRCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public String sayPS(){
		return "Master Roach Card";
	}

	@Override
	public void pay(double payment) {
		System.out.println("Amount paid with Master Roach credit card: $" + payment + ".");
	}
}
