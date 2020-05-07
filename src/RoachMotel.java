import java.util.ArrayList;


public class RoachMotel {
    private static RoachMotel instance = new RoachMotel();
    private final int NUM_ROOMS = 10;
    private ArrayList<Room> rooms;
    private RoomFactory rf;


    /**
     * Creates Roach Motel
     */
    private RoachMotel(){
        rooms = new ArrayList<>();
        rf = new RoomFactory();
    }

    /**
     * Singleton design pattern to create only 1 Roach Motel
     * @return
     */
    public static RoachMotel getInstance(){
       return instance;
    }

    public Room getRoom(int i){
        return rooms.get(i);
    }

    /**
     * Check if any rooms are available
     * @return
     */
    public boolean isVacant(){
        boolean iv = rooms.size() < NUM_ROOMS ? true : false;
        return iv;
    }

    /**
     * Checks in a roach colony to a room
     * @param rc = the colony that is checking in
     * @param roomType = the room they request
     * @param amenities = any amenities they request
     */
    public void checkIn(RoachColony rc, String roomType, String[] amenities){
        if(isVacant()){
            Room rm = rf.getRoom(roomType, amenities);
            rm.setRoomColony(rc);
            rooms.add(rm);
            System.out.println(rc.getColonyName() + " just checked into a " + roomType.toUpperCase() + " room.");
        }
        else {
            System.out.println("There are no available rooms... Try again next time chump.");
        }

    }

    /**
     * increase nights by one
     * Most efficient to set up a loop to increase nights for testing
     */
    public void increaseNight(){
        for(Room r : rooms){
            r.increaseTotalNights();
        }
    }

    /**
     * Checks out a Roach Colony from a room.
     * @param rmNum = room number checking out
     * @param ps = payment method
     * @return
     */
	public void checkOut(int rmNum, PaymentStrategy ps) {
	    Room o = rooms.get(rmNum);
	    RoachColony u = o.getRoomColony();
		System.out.println(u.getColonyName() + " is checking out. They stayed for " + o.getTotalNights() + " nights");
		Bill roomBill = new Bill(o);
		System.out.println("Paying with " + ps.sayPS() +  ".....");
		roomBill.payBill(ps);
		rooms.remove(rmNum);

	}

    /**
     * @return a string with all the room descriptions seperated in different lines
     */
	@Override
	public String toString(){
	    String s = "";
	    for (Room r : rooms){
            s +=  r.getDescription() + "\n";
        }
	    return s;
    }

    /**
     * Throws a party for a certain room.
     * Kills a % of roaches depending if they have the spray resistant shower or not
     * @param rmNum number
     */
    public void throwParty(int rmNum){
        Room rm = rooms.get(rmNum);
        RoachColony rc = rm.getRoomColony();
        int pop = rc.getPopulation();
        if(rm.getDescription().contains("spray-resistant shower")){
            System.out.println(rc.getColonyName() + " has a spray-resistant shower so some lives will be spared....");
            int change = pop - Math.floorDiv(pop,4);
            System.out.println("Their population is now: " + change);
            rc.setPopulation(change);
        } else {
            System.out.println(rc.getColonyName() +  " did not have a spray-resistant shower so rippy dippy....");
            int change = pop - Math.floorDiv(pop,2);
            System.out.println("Their population is now: " + change);
            rc.setPopulation(change);
        }

    }

}
