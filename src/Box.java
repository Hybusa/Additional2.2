import java.util.ArrayList;
import java.util.List;

public class Box extends Shape {

    List<Shape> stored = new ArrayList<>();

    Box(double volume) {
        this.volume = volume;
    }

    private double calcVolume(List<Shape> stored) {
        double totalListVolume = 0;
        for (Shape shape : stored) {
            totalListVolume += shape.getVolume();
        }
        return totalListVolume;
    }

    public boolean add(Shape shape) {
        if ((calcVolume(stored) + shape.getVolume() > this.getVolume()))
            return false;
        else {
            stored.add(shape);
            this.volume -= shape.volume;
            return true;
        }
    }
}
