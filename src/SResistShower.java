/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

public class SResistShower extends RoomDecorator {
	protected Room type; 

	public static final double COST = 25.0;

	/**
	 * default constructor
	 * @param t
	 */
	public SResistShower(Room t) {
		this.type = t;
	}

	/**
	 * @return the description of the room with the sresist shower
	 */
	@Override
	public String getDescription() {
		return this.type.getDescription() + " with a spray-resistant shower";
	}

	/**
	 * @return the cost of the room with the sresist shower
	 */
	@Override
	public double getCost() {
		return type.getCost() + COST;
	}
}
