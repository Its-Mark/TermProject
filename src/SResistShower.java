public class SResistShower extends RoomDecorator {
	protected Room type; 

	public static final int COST = 25;

	public SResistShower(Room type) {
		this.type = type;
	}
 
	public String getDescription() {
		return type.getDescription() + " with a spray-resistant shower";
	}

	@Override
	public int getCost() {
		return type.getCost() + COST;
	}
}
