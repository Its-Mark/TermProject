public class Regular extends Room {
 private static final double COST = 50.0;

 /**
  * Default constructor
  */
 public Regular() {
  description = "Regular Room";
 }

 /**
  * @return the description of the room
  */
 @Override
 public String toString() {
  return description;
 }

 /**
  * @return the cost of the room
  */
 @Override
 public double getCost() {
  return COST;
 }

 /**
  * @return a string of the
  */
 @Override
 public String getDescription() {
  return description;
 }


}