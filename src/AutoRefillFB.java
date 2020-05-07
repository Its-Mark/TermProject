public class AutoRefillFB extends RoomDecorator {
	protected Room type; 

	public static final double COST = 5.0;

	/**
	 * Overloaded constructor
	 * @param t
	 */
	public AutoRefillFB(Room t) {
		this.type = t;
	}

	/**
	 * @return gets description of the room with a artf
	 */
	@Override
	public String getDescription() {
		return this.type.getDescription() + " with an auto refill of the food bar";
	}

	/**
	 * @return the cost of the room with a arft
	 */
	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
