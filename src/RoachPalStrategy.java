
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
