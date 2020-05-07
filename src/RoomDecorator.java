// Because we extend IceCream, IceCreamDecorator is-a IceCream

public abstract class RoomDecorator extends Room{
 @Override
 public abstract double getCost();
 public abstract String getDescription();
}
