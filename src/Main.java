import java.util.Scanner;
//super class shape, subclasses rectangle, circle, triangle get area and perimeter.
public class Main {
    public static void main(String[] args) {
        rectangle recarea = new rectangle();
        System.out.println("Area and perimeter of rectangle.");
        recarea.calcArea(0);
        recarea.calcPerimitive(0);

        circle circlearea = new circle();
        System.out.println("Area and perimeter of circle.");
        circlearea.calcArea(0);
        circlearea.calcPerimitive(0);

        triangle trianglearea = new triangle();
        System.out.println("Area and perimeter of triangle.");
        trianglearea.calcArea(0);
        trianglearea.calcPerimitive(0);
    }
}
 class shape {
    public double calcArea(double area){
        return area;
    }
    public double calcPerimitive(double perimitive){
        return perimitive;
    }
}

class rectangle extends shape{
//    shape area = new shape();
    @Override
    public double calcArea(double area) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = read.nextDouble();
        System.out.println("Enter width: ");
        double width = read.nextDouble();
        System.out.println("The area of rectangle is : "+length*width);
        return length*width;
    }
    @Override
    public double calcPerimitive(double perimitive) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = read.nextDouble();
        System.out.println("Enter width: ");
        double width = read.nextDouble();
        System.out.println("The perimeter of rectangle is : "+2*(length+width));
        return 2*(length+width);
    }
}

class circle extends shape{
    @Override
    public double calcArea(double area) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = read.nextDouble();
        double pi = 3.14;
        System.out.println("The area of circle is : "+pi*r);
        return pi*r;
    }

    @Override
    public double calcPerimitive(double perimitive) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = read.nextDouble();
        double pi = 3.14;
        System.out.println("The perimeter of circle is : "+2*pi*r);
        return 2*pi*r;
    }
}

class triangle extends shape{
    @Override
    public double calcArea(double area) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter height :");
        double height = read.nextDouble();
        System.out.println("Enter base :");
        double base = read.nextDouble();
        System.out.println("The area of triangle is : "+(height*base)/2);
        return (height*base)/2;
    }

    @Override
    public double calcPerimitive(double perimitive) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter height :");
        double height = read.nextDouble();
        System.out.println("Enter base :");
        double base = read.nextDouble();
        System.out.println("Enter side :");
        double side = read.nextDouble();
        System.out.println("The perimeter of triangle is : "+(height+base+side));
        return height+base+side;
    }
}