import java.util.Iterator;
import java.util.Map;

public class getValue3 {
	/**
	 * This method returns the value associated to a key from a product metaData
	 * map.
	 * 
	 * @param metaData
	 *            Map object containing an assortment of product detail information.
	 * @param key
	 *            String value specifying a product detail in the metaData map.
	 * @return The value associated to the desired key from the metaData map.
	 */

	public String getValue(Map metaData, String key) {
		String value = null;
		
		Iterator<Map.Entry<?,?>> it = metaData.entrySet().iterator();
		Map.Entry<?, ?> entry;
		while(it.hasNext()) {
			entry = it.next();
			String nextKey = (String) entry.getKey();	
			if(nextKey.equals(key)) {
				String nextValue = (String) entry.getValue();
				value = nextValue;
			}
		}
		
		return value;

	}
}
