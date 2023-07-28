abstract class Shape {
    public abstract double calculateArea();
    public abstract void display();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14*radius*radius;
    }

    @Override
    public void display(){
        System.out.println("Area = " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public void display(){
        System.out.println("Area = " + calculateArea());
    }
}
