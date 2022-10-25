package circle;

public class WhiteCircle extends Circle {
    private String color = "white";
    public WhiteCircle(int radius){
        super(radius);
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public String toString() {
        return "WhiteCircle{" +
                "radius=" + getRadius()
                + "color=" + color
                + '}';
    }
}
