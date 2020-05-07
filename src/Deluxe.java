public class Deluxe extends Room {
 private static final double COST = 75.0;

 /**
  * Default constructor
  */
 public Deluxe() {
  description = "Deluxe Room";
 }

 /**
  * @return the cost of the room
  */
 @Override
 public double getCost() {
  return COST;
 }

 /**
  * @return the description of the room
  */
 @Override
 public String getDescription() {
  return description;
 }

}