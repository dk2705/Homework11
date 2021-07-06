package homework;

//parser of pom.xml (SAX) with test

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File("pom.xml");
        
        try{
            parser.parse(file, new PomSAXParser());
            System.out.println("File pom.xml has been parsed");
        }catch(IOException ex){
            System.out.println("No file pom.xml in your jar folder");
        }
        
        
    }
    
}
