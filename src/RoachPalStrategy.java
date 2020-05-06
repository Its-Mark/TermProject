
public class RoachPalStrategy implements PaymentStrategy {
	private String emailId;
	private String password;
	
	public RoachPalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	
	public void pay(int payment) {
		System.out.println("Amount paid using a RoachPal account: $" + payment + ".");
	}
}
