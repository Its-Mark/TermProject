// Because we extend IceCream, IceCreamDecorator is-a IceCream
/**
 * Term Project
 * Due: 5/7/2020
 * @author Mark Garcia mark.garcia.8001@gmail.com
 * @author Brandon Wiitannen brandon.wiitannen01@student.csulb.edu
 */

/**
 * Using decorator pattern
 */
public abstract class RoomDecorator extends Room{
 @Override
 public abstract double getCost();
 public abstract String getDescription();
}
