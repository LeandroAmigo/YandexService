package services;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.xml.sax.SAXException;

public interface Service {
  String getMeaning(String term) throws ParserConfigurationException,IOException,SAXException;
}
