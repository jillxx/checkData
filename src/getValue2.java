import java.util.Map;

public class getValue2 {

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
		
		if(metaData.containsKey(key)) {
			value = (String) metaData.get(key);
		}

		return value;
	}
	
}
