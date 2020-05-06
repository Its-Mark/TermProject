public class Suite extends Room {
 private static final int COST = 100;
 
 public Suite() {
  description = "Suite";
 }

 @Override
 public int getCost() {
  return COST;
 }
}