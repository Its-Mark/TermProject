public class FoodBar extends RoomDecorator {
	protected Room type; 

	public static final double COST = 10.0;

	public FoodBar(Room t) {
		this.type = t;
 }

 	@Override
	public String getDescription() {
		return this.type.getDescription() + " with a food bar";
	}


	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
