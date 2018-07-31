import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Algorithms {
	
	public static void main(String[] args) {
			Map map = new HashMap();
		  for(int i=1;i<999990;i++) {
			  String s =i+"";
			map.put(s,s+i);
		  };
		getValue gv = new getValue();
		
		long startTs = System.currentTimeMillis();    
		String value =gv.getValue(map,"600000");
		long endTs = System.currentTimeMillis();
		System.out.println("time spend in original solution is "+ (endTs - startTs)+ "ms");
	
		getValue1 gv1 = new getValue1();
		long startTs1 = System.currentTimeMillis();    
		String value1 =gv1.getValue(map,"600000");
		long endTs1 = System.currentTimeMillis();
		System.out.println("time spend in solution1 is "+ (endTs1 - startTs1)+ "ms");
		
		getValue2 gv2 = new getValue2();
		long startTs2 = System.currentTimeMillis();    
		String value2 =gv2.getValue(map,"600000");
		long endTs2 = System.currentTimeMillis();
		System.out.println(value2);
		System.out.println("time spend in solution2 is "+ (endTs2 - startTs2)+ "ms");

		getValue3 gv3 = new getValue3();
		long startTs3 = System.currentTimeMillis();    
		String value3 =gv3.getValue(map,"600000");
		long endTs3 = System.currentTimeMillis();
		System.out.println("time spend in solution3 is "+ (endTs3 - startTs3)+ "ms");
	}


	
	
}
