package parser;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import model.Time;

public class Weather {
	private ArrayList<Time> times;
	

	public Weather() {
		DOMParserWeb parser = new DOMParserWeb("http://api.openweathermap.org/data/2.5/forecast?q=Toledo,es&mode=xml&APPID=601c9db344b44f9774ef76a4c07979b1&lang=sp");
		Document doc = parser.getDocumento();
		Element eleForecast = (Element)doc.getElementsByTagName("forecast").item(0);
		NodeList nodosTimes = eleForecast.getElementsByTagName("time");
		times = new ArrayList<Time>();
		for (int i=0;i<nodosTimes.getLength();i++) {
			Element nodoTime = (Element)nodosTimes.item(i);
			Time time = new Time();
			time.setFrom(nodoTime.getAttribute("from"));
			time.setTo(nodoTime.getAttribute("to"));
			Element eleclouds = (Element) nodoTime.getElementsByTagName("clouds").item(0);
			time.setProno(eleclouds.getAttribute("value"));
			Element elesymbol = (Element) nodoTime.getElementsByTagName("symbol").item(0);
			time.setIcono(elesymbol.getAttribute("var"));
			Element eleprecipitation = (Element) nodoTime.getElementsByTagName("precipitation").item(0);
			time.setPreci(eleprecipitation.getAttribute("probability"));
			Element eletemperature = (Element) nodoTime.getElementsByTagName("temperature").item(0);
			time.setMax(eletemperature.getAttribute("max"));
			time.setMin(eletemperature.getAttribute("min"));
			 
			times.add(time);
		}
		
	}

	public ArrayList<Time> getTimes() {
		return times;
	}
	
}
