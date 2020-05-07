// Because we extend IceCream, IceCreamDecorator is-a IceCream

/**
 * Using decorator pattern
 */
public abstract class RoomDecorator extends Room{
 @Override
 public abstract double getCost();
 public abstract String getDescription();
}
