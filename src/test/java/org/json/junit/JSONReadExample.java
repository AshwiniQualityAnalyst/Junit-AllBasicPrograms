package org.json.junit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class JSONReadExample {

	@Test
	public void GetNameandAge() throws FileNotFoundException, IOException, ParseException
	{
		// parsing file "JSONExample.json" 
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\10645280\\eclipse-workspace\\JSON-Unit-Test\\resources\\sample1.json"));
		// typecasting obj to JSONObject 
		JSONObject jo = (JSONObject) obj;

		// getting firstName and lastName 
		String firstName = (String) jo.get("firstName"); 
		String lastName = (String) jo.get("lastName"); 
		System.out.println(firstName);
		System.out.println(lastName);

		// getting age 
		long age = (Long) jo.get("age");
		System.out.println(age);
		System.out.println("***************");

	}

	@Test
	public void GetAddress() throws FileNotFoundException, IOException, ParseException
	{
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\10645280\\eclipse-workspace\\JSON-Unit-Test\\resources\\sample1.json"));
		JSONObject jo = (JSONObject) obj;
		//getting address 
		Map address = ((Map)jo.get("address"));
		// iterating address Map
		Iterator<Map.Entry> itr = address.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry pair = itr.next();
			System.out.println(pair.getKey() +" : " + pair.getValue());
		}
		System.out.println("***************");
	}

	@Test
	public void GetPhoneNumbers() throws FileNotFoundException, IOException, ParseException
	{
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\10645280\\eclipse-workspace\\JSON-Unit-Test\\resources\\sample1.json"));
		JSONObject jo = (JSONObject) obj;
		// getting address 
		Map address = ((Map)jo.get("address")); 

		// iterating address Map 
		Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
		while (itr1.hasNext()) { 
			Map.Entry pair = itr1.next(); 
			System.out.println(pair.getKey() + " : " + pair.getValue()); 
		} 

		// getting phoneNumbers 
		JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 

		// iterating phoneNumbers 
		Iterator itr2 = ja.iterator(); 

		while (itr2.hasNext())  
		{ 
			itr1 = ((Map) itr2.next()).entrySet().iterator(); 
			while (itr1.hasNext()) { 
				Map.Entry pair = itr1.next(); 
				System.out.println(pair.getKey() + " : " + pair.getValue()); 
			} 
		} 

	}
}
