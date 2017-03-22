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
}
