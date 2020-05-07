public class Regular extends Room {
 private static final double COST = 50.0;
 
 public Regular() {
  description = "Regular Room";
 }

 @Override
 public String toString() {
  return description;
 }

 @Override
 public double getCost() {
  return COST;
 }

 @Override
 public String getDescription() {
  return description;
 }


}