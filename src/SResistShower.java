public class SResistShower extends RoomDecorator {
	protected Room type; 

	public static final double COST = 25.0;

	public SResistShower(Room t) {
		this.type = t;
	}

	@Override
	public String getDescription() {
		return this.type.getDescription() + " with a spray-resistant shower";
	}

	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
