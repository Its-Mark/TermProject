/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

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
