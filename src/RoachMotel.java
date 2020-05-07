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
            System.out.println(rc.getColonyName() + "just checked into a " + roomType.toUpperCase() + " room.");
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

	@Override
	public String toString(){
	    String s = "";
	    for (Room r : rooms){
            s += "ROOMS OCCUPIED:\n" + r.getDescription() + "\n";
        }
	    return s;
    }

}
