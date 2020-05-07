public class Spa extends RoomDecorator {
	protected Room type; 

	public static final double COST = 20.0;

	/**
	 * default constructor
	 * @param type
	 */
	public Spa(Room type) {
		this.type = type;
	}

	/**
	 * returns description of the room with the spa
	 * @return
	 */
	@Override
	public String getDescription() {
		return type.getDescription() + " with a spa";
	}

	/**
	 * gives cost of the room with spa
	 * @return
	 */
	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
