/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

public class RoachPalStrategy implements PaymentStrategy {
	private String emailId;
	private String password;


	/**
	 * Overloaded constructor
	 * @param emailId
	 * @param password
	 */
	public RoachPalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	/**
	 * Sends a message saying how youre paying
	 * @param payment
	 */
	public void pay(double payment) {
		System.out.println("Amount paid using a RoachPal account: $" + payment + ".");
	}

	/**
	 * @return the payment strat name
	 */
	@Override
	public String sayPS() {
		return "RoachPal";
	}
}
