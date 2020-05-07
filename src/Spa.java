public class Spa extends RoomDecorator {
	protected Room type; 

	public static final double COST = 20.0;

	public Spa(Room type) {
		this.type = type;
	}

	@Override
	public String getDescription() {
		return type.getDescription() + " with a spa";
	}

	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
