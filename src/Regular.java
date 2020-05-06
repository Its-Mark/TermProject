public class Regular extends Room {
 private static final int COST = 50;
 
 public Regular() {
  description = "Regular Room";
 }

 @Override
 public int getCost() {
  return COST;
 }
}