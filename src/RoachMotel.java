import java.util.ArrayList;

public class RoachMotel {
    private static RoachMotel instance = null;
    private static final int NUM_ROOMS = 10;
    private Room[] rooms;

    /**
     * Creates Roach Motel
     */
    private RoachMotel(){
        rooms = new Room[NUM_ROOMS];
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
        return rooms.length < NUM_ROOMS;
    }



}
