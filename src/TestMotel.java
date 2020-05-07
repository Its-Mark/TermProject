/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

import java.util.ArrayList;
public class TestMotel {


	public static void main(String args[]) {

		RoachMotel rm = RoachMotel.getInstance();
		String[] rm1a = {"Spa", "FoodBar"};
		PaymentStrategy ps1 = new MRCardStrategy("John Johnson", "1234-5678-9101", "123", "10/12/25");
		PaymentStrategy ps2 = new RoachPalStrategy("eastSideRoach64920@roachinc.com", "password");
		String[] rm2a = {"Spa", "Shower", "FoodBar","AUTO REFILL FOOD BAR"};
		RoachColony rc1 = new RoachColony("Dem Roaches", 1000, .5);
		RoachColony rc2 = new RoachColony("East Side Roach", 200, .7);
		RoachColony rc3 = new RoachColony("Roaches", 14, 1.0);
		RoachColony rc4 = new RoachColony("west side roaches", 125, .9);
		RoachColony rc5 = new RoachColony("Secret techs", 1125, .7);
		RoachColony rc6 = new RoachColony("huge skip", 1412, 5.4);
		RoachColony rc7 = new RoachColony("pepegas", 15435, 1.3);
		RoachColony rc8 = new RoachColony("monkaS", 1513, .1);
		RoachColony rc9 = new RoachColony("Lame-os", 1513, .5);
		RoachColony rc10 = new RoachColony("Project Scuffed", 235, 3.2);
		RoachColony rc11 = new RoachColony("kneive", 5123, 1.2);

		rm.checkIn(rc1, "regular", rm1a);
		rm.checkIn(rc2, "Deluxe", rm2a);
		rm.checkIn(rc3, "Suite", rm2a);
		rm.checkIn(rc4, "Deluxe", rm2a);
		rm.checkIn(rc5, "regular", rm2a);
		rm.checkIn(rc6, "deluxe", rm2a);
		rm.checkIn(rc7, "suite", rm2a);
		rm.checkIn(rc8, "regular", rm2a);
		rm.checkIn(rc9, "dEluxe", rm2a);
		rm.checkIn(rc10, "suite", rm2a);
		//NEXT ONE SHOULDN'T WORK B/C MOTEL CAPACITY
		rm.checkIn(rc11, "SuiTE", rm2a);

		System.out.println("INCREASING NIGHTS BY 11");
		for (int i = 0; i <= 10; i++) {
			rm.increaseNight();
		}
		System.out.println("SUCCESSFULLY INCREASED NIGHTS");
		System.out.println("SHOWING ROOMS....");
		System.out.println(rm.toString());
		System.out.println("############### TESTING CHECKOUT ###############");
		rm.checkOut(9, ps1);
		rm.checkOut(8, ps2);

		//SHOULD WORK NOW BECAUSE THERE IS AN EMPTY SPOT IN THE MOTEL
		rm.checkIn(rc11, "SuiTE", rm2a);

		System.out.println(rm.getRoom(0).getRoomColony().getColonyName() + " and " + rm.getRoom(1).getRoomColony().getColonyName() + " are throwing a party!");
		rm.throwParty(0);
		rm.throwParty(1);



	}
}