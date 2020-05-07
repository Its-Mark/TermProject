/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

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