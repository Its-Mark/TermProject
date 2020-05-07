/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

public class Suite extends Room {
 private static final double COST = 100.00;

 /**
  * Default constructor
  */
 public Suite() {
  description = "Suite";
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