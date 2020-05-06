public class AutoRefillFB extends RoomDecorator {
	protected Room type; 

	public static final int COST = 5;

	public AutoRefillFB(Room type) {
		this.type = type;
	}
 
	public String getDescription() {
		return type.getDescription() + " with an auto refill of the food bar";
	}

	@Override
	public int getCost() {
		return type.getCost() + COST;
	}
}
