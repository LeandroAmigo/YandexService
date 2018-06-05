package parsers;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.xml.sax.SAXException;

public interface InputParser{
  String format(String text) throws ParserConfigurationException,IOException,SAXException;
}
