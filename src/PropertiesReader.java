import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件的读取工具
 * @author Anatasia
 *
 */
public class PropertiesReader {
	public Map<String, String> getProperties(){
		Properties properties = new Properties();
		Map<String, String> map = new HashMap<String, String>();
		try {
			InputStream inputStream = getClass().getResourceAsStream("type.properties");
			properties.load(inputStream);
			Enumeration en = properties.propertyNames();
			while(en.hasMoreElements()){
				String key = (String) en.nextElement();
				String property = properties.getProperty(key);
				map.put(key, property);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return map;
	}
}
