package ch4.sample01;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtilTV {
	public static String getBrandName() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("configTV.xml"));

			NodeList nl = doc.getElementsByTagName("Name");
			Node classNode = nl.item(0).getFirstChild();
			String Name = classNode.getNodeValue().trim();
			return Name;
		}
		catch(Exception e){
			e.printStackTrace(); return null;
		}
	}
}
