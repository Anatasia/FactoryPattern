/**
 * 模拟客户端client
 * @author Anatasia
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HairInterface left = new LeftHair();
//		left.draw();
		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
		
//		HairInterface left = factory.getHairByClass("LeftHair");
//		left.draw();
		HairInterface hair = factory.getHairByClassKey("in");
		hair.draw();
	}

}
