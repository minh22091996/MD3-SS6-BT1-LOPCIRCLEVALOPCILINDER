package rikkei;

public class Cylinder extends Circle {
    public  double height = 2;
public Cylinder(){}
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
    return Math.PI * getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+super.toString();
    }
}
