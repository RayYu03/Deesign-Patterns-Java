package ch15;

/**
 * Created by RayYu on 2016/12/12.
 */
public class SharedString {
    private String content;
    private Color color;
    private Size size;

    public SharedString(String content){
        setContent(content);
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void display(){
        System.out.println("内容: " + this.content);
        System.out.println("颜色: " + this.color.getColor());
        System.out.println("大小: " + this.size.getValue());
    }

}
