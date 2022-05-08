package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	public String  firstName, lastName, email, comanyName, password;
	
	public void jsonReader() throws FileNotFoundException, IOException, ParseException 
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\data\\UserData.json";
		File srcFile = new File(path);
		
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		
		for(Object jObject : jArray )		
		{
			JSONObject person = (JSONObject) jObject ;
			firstName =  (String) person.get("firstName");
			System.out.println(firstName);
			lastName =  (String) person.get("lastName");
			System.out.println(lastName);
			email =  (String) person.get("email");
			System.out.println(email);
			comanyName =  (String) person.get("comanyName");
			System.out.println(comanyName);
			password =  (String) person.get("password");
			System.out.println(password);
		}
	}
}
