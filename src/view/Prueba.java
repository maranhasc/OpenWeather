package view;

import java.util.ArrayList;

import org.w3c.dom.Document;

import model.Time;
import parser.DOMParserWeb;
import parser.Weather;

public class Prueba {

	public static void main(String[] args) {
		
		Weather weather = new Weather();
		ArrayList<Time> dias = weather.getTimes();
		
		for (Time dia:dias) {
			System.out.println(dia);
		}

	}

}
