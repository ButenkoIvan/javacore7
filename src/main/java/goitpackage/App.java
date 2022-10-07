package goitpackage;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        Map<String,String> user = new HashMap<>();
        user.put("name","Ivan");
        user.put("lastname","Butenko");
        System.out.println(new Gson().toJson(user));
    }
}

