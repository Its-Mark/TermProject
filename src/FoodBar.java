public class FoodBar extends RoomDecorator {
	protected Room type; 

	public static final double COST = 10.0;

	/**
	 * Overloaded constructor
	 * @param t
	 */
	public FoodBar(Room t) {
		this.type = t;
	}

	/**
	 * @return the description of the room with a foodBar
	 */
 	@Override
	public String getDescription() {
		return this.type.getDescription() + " with a food bar";
	}


	/**
	 * @return the cost of the room with a food bar
	 */
	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
