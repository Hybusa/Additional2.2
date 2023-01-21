public class Pyramid extends Shape {

    private final double s;
    private final double h;

    Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = s * h / 3;

    }
}

