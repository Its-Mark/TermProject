/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

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