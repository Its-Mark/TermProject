public class FoodBar extends RoomDecorator {
	protected Room type; 

	public static final int COST = 10;

	public FoodBar(Room type) {
		this.type = type;
 }
 
	public String getDescription() {
		return type.getDescription() + " with a food bar";
	}

	@Override
	public int getCost() {
		return type.getCost() + COST;
	}
}
