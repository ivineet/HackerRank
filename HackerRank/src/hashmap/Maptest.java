package hashmap;

import java.util.Map;
import java.util.HashMap;

public class Maptest {
	
	public static Map<String, String> mapShare(Map<String, String> map) {
		  
		  if(map.containsKey("a")){
		      map.put("b", map.get("a"));
		  }
		  map.remove("c");
		  
		  return map;
	}

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "yadav");
		map.put("c", "yadav");
		
		System.out.println(map);
		
		mapShare(map);
		
		System.out.println(map);
	}
}
