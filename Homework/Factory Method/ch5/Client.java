package ch5;

public class Client {
    public static void main(String[] args) {
        System.out.println("我要读GIF图片");

        GifReader gifReader = new GifReaderFactory().Producereader();
        gifReader.readPicture();

        System.out.println("我要读JPG图片");

        JpgReader jpgReader = new JpgReaderFactory().Producereader();
        jpgReader.readPicture();

    }
}
