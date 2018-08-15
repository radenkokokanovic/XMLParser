package com.example.XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFileDemo {

	
	
	 public static void main(String argv[]) {
		 
		 
		 //Create XML file
	      try {
	         DocumentBuilderFactory dbFactory =
	         DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	         
	         // root element
	         Element rootElement = doc.createElement("cars");
	         doc.appendChild(rootElement);

	         // supercars element
	         Element supercar = doc.createElement("supercars");
	         rootElement.appendChild(supercar);
	         
	         // supercars moj element
	         Element supercar2 = doc.createElement("supercars");
	         rootElement.appendChild(supercar2);
	         
	         
	         // setting attribute to element 
	         Attr attr2 = doc.createAttribute("kompanija");
	         attr2.setValue("MERCEDES");
	         supercar2.setAttributeNode(attr2);

	         // setting attribute to element
	         Attr attr = doc.createAttribute("company");
	         attr.setValue("Ferrari");
	         supercar.setAttributeNode(attr);

	         // carname element
	         Element carname = doc.createElement("carname");
	         Attr attrType = doc.createAttribute("type");
	         attrType.setValue("formula one");
	         carname.setAttributeNode(attrType);
	         carname.appendChild(doc.createTextNode("Ferrari 101"));
	         supercar.appendChild(carname);
	         
	         
	         // adding element to new superacar element
	         
	         Element carname3 = doc.createElement("carname");
	         Attr attrType3=doc.createAttribute("type");
	         attrType3.setValue("Best car");
	         carname3.setAttributeNode(attrType3);
	         carname3.appendChild(doc.createTextNode("Mercedes CLA 200"));
	         supercar2.appendChild(carname3);
	         
	         
	         
	         Element carname1 = doc.createElement("carname");
	         Attr attrType1 = doc.createAttribute("type");
	         attrType1.setValue("sports");
	         carname1.setAttributeNode(attrType1);
	         carname1.appendChild(doc.createTextNode("Ferrari 202"));
	         supercar.appendChild(carname1);
	         
	         
	         //Moje dodavanje elementa
	         Element carname2=doc.createElement("carname");
	         Attr attrType2=doc.createAttribute("type");
	         attrType2.setValue("Best or nothing");
	         carname2.setAttributeNode(attrType2);
	         carname2.appendChild(doc.createTextNode("Mercedes"));
	         supercar.appendChild(carname2);

	         // write the content into xml file
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("src/main/java/cars.xml"));
	         transformer.transform(source, result);
	         
	         
	      
	         // Output to console for testing
	         StreamResult consoleResult = new StreamResult(System.out);
	         transformer.transform(source, consoleResult);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	}