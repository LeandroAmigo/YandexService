package parsers;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;

public class ParserFromXML implements InputParser {
  private static ParserFromXML instance;
 
  private ParserFromXML() {}

  public static ParserFromXML getInstance() {
    if(instance == null) {
      instance =  new ParserFromXML();
    }
    return instance;
  }

	@Override public String format(String text) throws ParserConfigurationException,IOException,SAXException{
	  Document document= getDocument(text);
	  NodeList nodeList = getNode(document);
    String content = getContenido(nodeList);
	  return content;
  }
  private Document getDocument(String text) throws ParserConfigurationException,IOException,SAXException{
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(new InputSource(new java.io.StringReader(text)));
    return doc;
  }


  private NodeList getNode(Document document){
    return document.getDocumentElement().getElementsByTagName("text");
  }

  private String getContenido(NodeList nodeList){
    return nodeList.item(0).getTextContent();
  }

 }
