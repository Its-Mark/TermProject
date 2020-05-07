public class Deluxe extends Room {
 private static final double COST = 75.0;
 
 public Deluxe() {
  description = "Deluxe Room";
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