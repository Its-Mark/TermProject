public class RoomFactory {

	public RoomFactory(){}

	public Room getRoom(String type) {
		Room room = null;

		if (type.compareToIgnoreCase("Regular") == 0)
			room = new Regular();
		else if (type.compareToIgnoreCase("Deluxe") == 0)
		    room = new Deluxe();
		else if (type.compareToIgnoreCase("Suite") == 0)
		    room = new Suite();
		  
		return room;
	}

	public Room getRoom(String type, String[] ameneites){
		Room room = null;
		if (type.compareToIgnoreCase("Regular") == 0)
			room = new Regular();
		else if (type.compareToIgnoreCase("Deluxe") == 0)
			room = new Deluxe();
		else if (type.compareToIgnoreCase("Suite") == 0)
			room = new Suite();

		for(String a : ameneites){
			if(a.compareToIgnoreCase("spa") == 0)
				room = new Spa(room);
			else if (a.compareToIgnoreCase("foodbar") == 0)
				room = new FoodBar(room);
			else if(a.compareToIgnoreCase("shower") == 0)
				room = new SResistShower(room);
			else if(a.compareToIgnoreCase("auto refill food bar") == 0)
				room = new AutoRefillFB(room);
		}

		return room;

	}


}


