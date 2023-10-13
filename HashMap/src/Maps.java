import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
		//there is no order in hashmap.
		HashMap<String, Integer> empIds = new HashMap<>();
		
		//put
		empIds.put("Etem", 3102);
		empIds.put("John", 3456);
		empIds.put("Gerry", 4356);
		System.out.println(empIds);
		
		//get
		int id = empIds.get("Etem");
		System.out.println(id);
		
		//containsKey, containsValue
		System.out.println(empIds.containsKey("Etem"));
		System.out.println(empIds.containsValue(3101));
		
		
		empIds.put("Etem", 1086);
		System.out.println(empIds);
		
		//put if absent(not replaces just puts)
		empIds.putIfAbsent("John", 222);
		System.out.println(empIds);
		empIds.putIfAbsent("Steve", 222);
		System.out.println(empIds);
		
		//remove
		empIds.remove("John");
		System.out.println(empIds);
		
		
		
	}

}
