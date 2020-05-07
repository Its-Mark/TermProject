public abstract class Room {
    protected RoachColony roomColony;
    protected int totalNights;
    protected String description;

    /**
     * Getter Method for number of nights
     * @return
     */
    public int getTotalNights() {
        return this.totalNights;
    }

    /**
     * Setter Method to increase nights stayed by "n"
     */
    public void increaseTotalNights(){
        this.totalNights ++;
    }

    /**
     * Assign a roach colony to a room
     * @param rc
     */
    public void setRoomColony(RoachColony rc){
        this.roomColony = rc;
    }

    /**
     * @return the roach colony that is in the room.
     */
    public RoachColony getRoomColony(){
        return this.roomColony;
    }
    /**
     * Abstract methods depending on the rooms.
     * @return
     */
    public abstract double getCost();

    public abstract String getDescription();

}
