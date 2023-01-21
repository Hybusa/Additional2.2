public class Ball extends SolidOfRevolution{

    Ball(double radius)
    {
        this.radius = radius;
        this.volume = Math.PI*4*Math.pow(radius,3)/3;
    }

}
