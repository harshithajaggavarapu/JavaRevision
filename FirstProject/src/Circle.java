public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI* this.radius * this.radius;
    }
    public double circumference(){
        return 2*Math.PI*this.radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Area is "+ c.area());
        System.out.println("Circumference is "+ c.circumference());
    }

}
