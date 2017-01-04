package ch13;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Client {
    public static void main(String[] args){
        Component text = new TextView();
        text.display();

        System.out.println("--------------------------------------");
        ScrollBarDecorator scrollBarDecorator = new ScrollBarDecorator(text);
        scrollBarDecorator.display();

        System.out.println();

        Component picture = new PictureView();
        picture.display();

        System.out.println("--------------------------------------");
        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(picture);
        blackBorderDecorator.display();

    }

}
