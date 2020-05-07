public class AutoRefillFB extends RoomDecorator {
	protected Room type; 

	public static final double COST = 5.0;

	public AutoRefillFB(Room t) {
		this.type = t;
	}

	@Override
	public String getDescription() {
		return this.type.getDescription() + " with an auto refill of the food bar";
	}

	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
