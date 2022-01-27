package dataDriven;

import java.io.FileReader;     
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ToReadDataFromJson {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader fr = new FileReader("./testResources/testData.json");

		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(fr);
		
		String data = jsonObj.get("client").toString();
		System.out.println(data);
	}

}
