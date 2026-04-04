/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xmltestapril4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class XMLTestApril4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("Students.xml");

            Element rootElement = document.getDocumentElement();
            System.out.println(rootElement);

            NodeList nodeList = document.getElementsByTagName("student");

            System.out.println(nodeList);

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);
                if (node.getNodeType() == node.ELEMENT_NODE) {
                    Element e = (Element) node;

                    String id = e.getElementsByTagName("id").item(0).getTextContent();
                    String name = e.getElementsByTagName("name").item(0).getTextContent();
                    String age = e.getElementsByTagName("age").item(0).getTextContent();

                    System.out.println("ID : " + id + "  Name : " + name + "  Age : " + age);

                }

            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(XMLTestApril4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
