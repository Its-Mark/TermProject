public class RoomFactory {
	public Room getRoom(String type) {
		Room room = null;
		  
		if (type.equals("Regular"))
			room = new Regular();
		else if (type.equals("Deluxe"))
		    room = new Deluxe();
		else if (type.equals("Suite"))
		    room = new Suite();
		  
		return room;
	}

}


