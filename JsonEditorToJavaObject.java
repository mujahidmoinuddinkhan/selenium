

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class JsonEditorToJavaObject {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Type type = new TypeToken<List<Resp>>() {}.getType();

		// 1. JSON to Java object, read it from a file.
		List<Resp> items = gson.fromJson(new FileReader("I:\\newMy.json"), type);
		
		System.out.println(items);
		
	
	}
}
