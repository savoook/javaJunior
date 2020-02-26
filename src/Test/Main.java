package Test;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File Xml=new File("C:/Users/savoo/IdeaProjects/javaJunior/src/Test/Boxes.xml");
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(Xml);
        Node root = document.getDocumentElement();
        System.out.println("List of box: ");
        System.out.println();
        NodeList boxes = root.getChildNodes();
        for (int i = 0; i < boxes.getLength(); i++) {
            Node box = boxes.item(i);
            if (box.getNodeType() != Node.TEXT_NODE) {
                NodeList boxprophs = box.getChildNodes();
                for (int j = 0; j < boxprophs.getLength(); j++) {
                    Node boxproph = boxprophs.item(j);
                    if (boxproph.getNodeType() != Node.TEXT_NODE) {
                        System.out.println(boxproph.getNodeName() + ":" + boxproph.getChildNodes().item(0).getTextContent());
                    }
                }
            }
        }
    }
}
