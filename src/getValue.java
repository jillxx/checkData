import java.util.Iterator;
import java.util.Map;


/**
 * @author Jill Xu
 *
 */
public class getValue {

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
		
		Iterator it = metaData.keySet().iterator();
		
		while(it.hasNext()) {
			String nextKey = (String)it.next();
			
			if(nextKey.equals(key)) {
				String nextValue = (String) metaData.get(nextKey);
				value = nextValue;
				break;
			}
		}
		
		return value;

	}
}