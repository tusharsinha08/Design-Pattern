public class Car implements Vehicle, Movable  {
    
    private double price;
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void start(){
        System.out.println("the car has started.");
    }

    @Override
    public void stop(){
        System.out.println("the car stoped.");
    }
    
}
