/**
 * 圣诞系列人物
 * @author Anatasia
 *
 */
public class MCFactory implements PersonFactory{

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
