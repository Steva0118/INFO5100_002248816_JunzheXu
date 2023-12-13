package resource;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import java.io.*;

public class XmlParser {

    public static void main(String[] args) throws Exception {
        File xmlFile = new File("src/resource/books.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);

        doc.getDocumentElement().normalize();
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("Book");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Published Year : " + eElement.getElementsByTagName("publishedYear").item(0).getTextContent());
                System.out.println("Number Of Pages : " + eElement.getElementsByTagName("numberOfPages").item(0).getTextContent());

                NodeList authors = eElement.getElementsByTagName("author");
                for (int count = 0; count < authors.getLength(); count++) {
                    Node node1 = authors.item(count);
                    if (node1.getNodeType() == node1.ELEMENT_NODE) {
                        Element author = (Element) node1;
                        System.out.println("Author : " + author.getTextContent());
                    }
                }
            }
        }

        // Adding a new book
        Node bookShelf = doc.getFirstChild();

        Element newBook = doc.createElement("Book");
        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode("New Java Book"));
        Element year = doc.createElement("publishedYear");
        year.appendChild(doc.createTextNode("2023"));
        Element pages = doc.createElement("numberOfPages");
        pages.appendChild(doc.createTextNode("400"));
        Element authors = doc.createElement("authors");
        Element author = doc.createElement("author");
        author.appendChild(doc.createTextNode("New Author"));

        authors.appendChild(author);
        newBook.appendChild(title);
        newBook.appendChild(year);
        newBook.appendChild(pages);
        newBook.appendChild(authors);

        bookShelf.appendChild(newBook);

        // Printing the modified XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult consoleResult = new StreamResult(System.out);
        transformer.transform(source, consoleResult);



    }
}
