import java.util.ArrayList;

public class RoachMotel {
    private static RoachMotel instance = null;
    private static final int NUM_ROOMS = 10;
    private ArrayList<Room> rooms;

    /**
     * Creates Roach Motel
     */
    private RoachMotel(){
        rooms = new ArrayList<>(NUM_ROOMS);
    }

    /**
     * Singleton design pattern to create only 1 Roach Motel
     * @return
     */
    public static RoachMotel getInstance(){
        if (instance == null){
            instance = new RoachMotel();
        }
        return instance;
    }

    /**
     * Check if any rooms are available
     * @return
     */
    public boolean isVacant(){
        return rooms.size() < NUM_ROOMS;
    }

    public Room checkIn(RoachColony rc, String roomType, String[] amenities){

    }

	public void createRooms() {
		// TODO Auto-generated method stub
		
	}

	public Double checkOut(Room r3, int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
