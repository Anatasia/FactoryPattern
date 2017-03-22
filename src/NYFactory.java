/**
 * 新年系列人物
 * @author Anatsia
 *
 */
public class NYFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new NYBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new NYGirl();
	}

}
