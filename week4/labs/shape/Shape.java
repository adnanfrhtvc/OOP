package org.example.week4.labs.shape;

enum fillType{
    FILLED,NOT_FILLED
}

class Shape {
    private String color;
    private fillType fillType;

    public Shape(String color,fillType fillType){
        this.color=color;
        this.fillType=fillType;
    }

    public void displayInfo(){
        System.out.println("color: "+color);
        System.out.println("fill type: "+fillType);
    }

    public double getArea(){
        return 0.0;
    }

}

class Circle extends Shape{
    private double radius;
    public Circle(String color,fillType fillType,double radius){
        super(color, fillType);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("radius: "+radius);
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference(double PI, double r){
        return 2*PI*r;
    }
    public double calculateCircumference(double r) {
        final double PI=3.14159;
        return 2*PI+r;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color,fillType fillType,double width, double height){
        super(color, fillType);
        this.width=width;
        this.height=height;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("width: "+width);
        System.out.println("height: "+height);
    }
    @Override
    public double getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", fillType.FILLED, 5.0);
        System.out.println("Circle Info:");
        circle.displayInfo();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference (with custom PI): " + circle.calculateCircumference(3.14159265359, circle.getRadius()));
        System.out.println("Circumference (with constant PI): " + circle.calculateCircumference(circle.getRadius()));

        System.out.println("\n");

        Rectangle rectangle = new Rectangle("Blue", fillType.NOT_FILLED, 4.0, 6.0);
        System.out.println("Rectangle Info:");
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.getArea());
    }
}