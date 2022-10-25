package circle;

public class Circle {
    private int radius;
    private double pi = 3.14;
    public Circle(int radius){
       this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double defineSquare(){
        return this.pi * Math.pow(this.radius, 2);
    }

    public double defineCircleLength(){
        return 2 * this.pi * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius 
                + '}';
    }
}
