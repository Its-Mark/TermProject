public class Deluxe extends Room {
 private static final int COST = 75;
 
 public Deluxe() {
  description = "Deluxe Room";
 }

 @Override
 public int getCost() {
  return COST;
 }
}