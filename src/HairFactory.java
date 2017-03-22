import java.util.Map;
import java.util.Properties;

/**
 * 发型工程，生成发型
 * @author Anatasia
 *
 */
public class HairFactory {
	/**
	 * 根据类型创建对象
	 */
	
	public HairInterface getHair(String type){
		if("left".equals(type)){
			return new LeftHair();
		}else if("right".equals(type)){
			return new RightHair();
		}else{
			return null;
		}
	}
	/**
	 * 根据类的名称生产发型
	 * @param className
	 * @return
	 */
	public HairInterface getHairByClass(String className){
		try {
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 根据类的名称生产发型
	 * @param className
	 * @return
	 */
	public HairInterface getHairByClassKey(String key){
		try {
			
			Map<String, String> map = new PropertiesReader().getProperties();
			String className = map.get(key);
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
