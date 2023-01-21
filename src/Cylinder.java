public class Cylinder extends SolidOfRevolution{

    double height;

    Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
        this.volume = Math.PI*Math.pow(radius,2)*height;
    }
}
