package ch15;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Color {
    private String color;
    public Color(String color){
        setColor(color);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
