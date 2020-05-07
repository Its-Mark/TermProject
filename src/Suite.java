public class Suite extends Room {
 private static final double COST = 100.00;
 
 public Suite() {
  description = "Suite";
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