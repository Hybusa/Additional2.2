public class Main {
    public static void main(String[] args) {

        Box box = new Box(2546.24);
        System.out.println(box.getVolume());
        Cylinder cylinder = new Cylinder(4.58,8);

        if(box.add(cylinder))
            System.out.println("Shape added to the box");
        else
            System.out.println("Box is out of space");

        System.out.println(box.getVolume());

    }
}