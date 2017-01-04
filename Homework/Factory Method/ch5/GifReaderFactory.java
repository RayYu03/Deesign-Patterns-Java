package ch5;

public class GifReaderFactory implements ImageReaderFactory{

	public GifReader Producereader() {
		System.out.println("创建GifReader");
		return new GifReader();	
	}

}
