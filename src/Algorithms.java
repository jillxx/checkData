import java.util.HashMap;
import java.util.Map;

public class Algorithms {
	
	public static void main(String[] args) {
			Map map = new HashMap();
		    map.put("key1", "value1");
		    map.put("key2", "value2");
		    map.put("key3", "value3");
		    
		getValue gv = new getValue();
	
		String value =gv.getValue(map,"key1");
		
		System.out.println(value);
		
		getValue2 gv2 = new getValue2();
		String value2 =gv2.getValue(map,"key4");
		System.out.println(value2);
		
	}


	
	
}
