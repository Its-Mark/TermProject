
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
