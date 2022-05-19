import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UserDataHashMapAndHashTable {

	public static void main(String[] args) {
		
		//HashMap<String,String> userMap = new HashMap<String,String>();
		Map<String,String> userMap = new HashMap<String,String>();
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Bangalore");
		userMap.put(null,"pune");
		userMap.put(null,"Hyderabad"); //only one null key and multiple null values in hashmap
		userMap.put("compName",null);
		userMap.put("country",null);
		
//		System.out.println(userMap);
		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());
		
		//using EntrySet:
		for(Map.Entry m: userMap.entrySet()) {
			System.out.println(m.getKey()+" : " +m.getValue());
		}
		
		//using Iterator:
		Iterator it = userMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Hashtable:
		Hashtable<String,Integer> productTable = new Hashtable<String,Integer>();
		productTable.put("Macbook", 2000);
		productTable.put("Windows HP", 1000);
		productTable.put("Apple iPhoneX", 1500);
		//productTable.put(null, null); //no null key and null values allowed in hashtable
		
		System.out.println(productTable);
		System.out.println(productTable.get("Macbook"));
		
		for(Map.Entry m: productTable.entrySet()) {
			System.out.println(m.getKey()+" : " +m.getValue());
		}
		
		//using Iterator:
		Iterator<String> it1 =productTable.keySet().iterator();
		while(it.hasNext()) {
			String key = it1.next();
			int value = productTable.get(key);
			System.out.println("Key = "+key+" value = " +value);
		}
				
	//Difference between HashMap and HashTable:
		//hashmap:
				//is non synchronized -- not thread safe...
				// one null key, multiple null values
		//hashtable:
			// is synchronized -- thread safe..
			// doesn't allow any null key, null values
		
		

	}

}
