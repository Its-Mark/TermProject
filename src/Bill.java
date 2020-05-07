import java.util.ArrayList;

public class Bill {
    private Room room;

    /**
     * Default constructor never used because there is no "default bill"
     */
    public Bill(){
        room = null;
    }

    /**
     * Constructor for the bill for Room r;
     * @param r
     */
    public Bill(Room r){
        room = r;
    }

    /**
     * Pays the bill for the room
     * @param ps
     */
    public void payBill(PaymentStrategy ps){
        double total = room.getCost() * room.getTotalNights();
        ps.pay(total);
    }

}
