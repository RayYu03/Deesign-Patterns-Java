package ch5;

public class JpgReaderFactory implements ImageReaderFactory{

	public JpgReader Producereader() {
		System.out.println("创建jpgReader");
		return new JpgReader();
	}

}
