public class Spa extends RoomDecorator {
	protected Room type; 

	public static final int COST = 20;

	public Spa(Room type) {
		this.type = type;
	}
 
	public String getDescription() {
		return type.getDescription() + " with a spa";
	}

	@Override
	public int getCost() {
		return type.getCost() + COST;
	}
}
