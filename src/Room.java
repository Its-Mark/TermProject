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
    public void increaseTotalNights(int n){
        this.totalNights += n;
    }

    /**
     * Assign a roach colony to a room
     * @param rc
     */
    public void setRoomColony(RoachColony rc){
        this.roomColony = rc;
    }

    /**
     * Abstract method to get the cost depending on the room
     * @return
     */
    public abstract int getCost();
}
