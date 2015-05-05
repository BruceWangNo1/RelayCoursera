package ThreeParticipants;
import ClassInterfaceAndAbstract.AbstractEat;


public class Superman extends AbstractEat
{
	public int eatTime;
	
	public Superman()
	{
		super();
		this.eatTime = 0;
	}
	public Superman(int takeoffTime, double speed, int landTime, int eatTime)
	{
		super(takeoffTime, speed, landTime, eatTime);
	}
	
	@Override
	/*The Superman need 1 minite more to wash hands
	 */
	public void eatTimeSetter(int eatTime)
	{
		this.eatTime = eatTime+1;
	}
	@Override
	/*The Superman need 1 minite more to wash hands
	 */
	public int eatTimeGetter()
	{
		return this.eatTime+1;
	}
}
