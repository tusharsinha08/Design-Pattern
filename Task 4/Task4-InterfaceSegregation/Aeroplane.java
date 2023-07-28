public class Aeroplane implements Vehicle, Movable, Flyable{
    private double price;
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void start(){
        System.out.println("the aeroplane has started.");
    }

    @Override
    public void stop(){
        System.out.println("the aeroplane stoped.");
    }

    @Override
    public void fly(){
        System.out.println("the plane take off.");
    }
}