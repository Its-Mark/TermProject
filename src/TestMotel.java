import java.util.ArrayList;
public class TestMotel {


	public static void main(String args[]) {

		RoachMotel rm = RoachMotel.getInstance();
		String[] rm1a = {"Spa", "FoodBar"};
		PaymentStrategy ps1 = new MRCardStrategy("Ben Dover", "1234-5678-9101","123","10/12/25");
		PaymentStrategy ps2 = new RoachPalStrategy("eastSideRoach64920@roachinc.com","password");
		String[] rm2a = {"Spa", "Shower", "FoodBar"};
		RoachColony rc1 = new RoachColony("Dem Roaches", 20, 2.5);
		RoachColony rc2 = new RoachColony("East Side Roach", 15, 3.7);
		RoachColony rc3 = new RoachColony("Roaches", 14, 1.0);
		RoachColony rc4 = new RoachColony("west side roaches", 125, .9);
		RoachColony rc5 = new RoachColony("Secret techs", 1125, .7);
		RoachColony rc6 = new RoachColony("huge skip", 1412, 5.4);
		RoachColony rc7 = new RoachColony("pepegas", 15435, 1.3);
		RoachColony rc8 = new RoachColony("monkaS", 1513, .1);
		RoachColony rc9 = new RoachColony("Lame-os", 1513, .5);
		RoachColony rc10 = new RoachColony("Project Scuffed", 235, 3.2);
		//next line shouldnt work
		RoachColony rc11 = new RoachColony("East Side Roach", 5123, 1.2);

		rm.checkIn(rc1, "regular", rm1a);
		rm.checkIn(rc2,"Deluxe", rm2a);
		rm.checkIn(rc3,"Suite", rm2a);
		rm.checkIn(rc4,"Deluxe", rm2a);
		rm.checkIn(rc5,"regular", rm2a);
		rm.checkIn(rc6,"deluxe", rm2a);
		rm.checkIn(rc7,"suite", rm2a);
		rm.checkIn(rc8,"regular", rm2a);
		rm.checkIn(rc9,"dEluxe", rm2a);
		rm.checkIn(rc10,"suite", rm2a);
		rm.checkIn(rc11,"SuiTE", rm2a);

		System.out.println("INCREASING NIGHTS BY 10");
		for(int i = 0; i <= 10; i++){
			rm.increaseNight();
		}
		System.out.println("SUCCESSFULLY INCREASED NIGHTS");
		System.out.println("SHOWING ROOMS....");
		//System.out.println(rm.toString());
		System.out.println("############### TESTING CHECKOUT ###############");
		rm.checkOut(0, ps1);
		rm.checkOut(1, ps2);

	}
		/*MotelRoom mr = new BasicRoom();
		System.out.println(mr.getDescription()
				+ " $" + mr.cost());

		MotelRoom mr2 = new BasicRoom();
		mr2 = new FoodBar(mr2);
		mr2 = new Spa(mr2);
		mr2 = new RefillBar(mr2);
		System.out.println(mr2.getDescription()
				+ " $" + mr2.cost());

		MotelRoom mr3 = new BasicRoom();
		mr3 = new Spa(mr3);
		mr3 = new Shower(mr3);
		mr3 = new FoodBar(mr3);
		System.out.println(mr3.getDescription()
						+ " $" + mr3.cost());*/
//		                RoachMotel rm = RoachMotel.getInstance();
//		                rm.createRooms();
//		                System.out.println(rm);
//		                RoachColony rc1 = new  RoachColony("first colony",100,200);
//		                ArrayList amenities = new ArrayList();
//		                amenities.add("foodbar");
//		                amenities.add("spa");
//		                amenities.add("refillbar");
//		                amenities.add("shower");
//		                Room r1 = rm.checkIn(rc1,"Suite",amenities);
//		                System.out.println(rc1);
//		                System.out.println(rm);
//		                RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
//		                ArrayList amenities2 = new ArrayList();
//		                amenities2.add("foodbar");
//		                Room r2 = rm.checkIn(rc2,"Deluxe",amenities2);
//		                System.out.println(rc2);
//		                System.out.println(rm);
//		                rc2.party();
//		                System.out.println(rc2);
//		                Double cost = rm.checkOut(r2,3,"MasterRoach");
//		                System.out.println("cost:" + cost);
//		                System.out.println(rm);
//		                RoachColony rc3 = new RoachColony("third colony",300,0.3);
//		                Room r3 = rm.checkIn(rc3,"Regular",amenities2);
//		                RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
//		                Room r4 = rm.checkIn(rc4,"Regular",amenities2);
//		                RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
//		                Room r5 = rm.checkIn(rc5,"Deluxe",amenities2);
//		                RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
//		                cost = rm.checkOut(r3,3, "RoachPay");
//		                System.out.println("cost:" + cost);
//		                Room r9 = rm.checkIn(rc6,"Regular",amenities2);
//		            			}
		}