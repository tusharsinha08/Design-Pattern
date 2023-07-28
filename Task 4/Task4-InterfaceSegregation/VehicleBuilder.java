public class VehicleBuilder {
    public static Car buildCar(){
        Car car = new Car();
        car.setPrice(4.6);
        car.start();

        return car;
    }

    public static Aeroplane buildAeroplane(){
        Aeroplane plane = new Aeroplane();
        plane.setPrice(100.50);
        plane.start();
        plane.fly();

        return plane;
    }
}
