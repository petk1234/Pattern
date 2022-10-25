package circle;

public class BlackCircle extends Circle {
    private String color = "black";
    public BlackCircle(int radius){
        super(radius);
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public String toString() {
        return "BlackCircle{" +
                "radius=" + getRadius()
                + "color=" + color 
                + '}';
    }
}