package ThreeParticipants;
import ClassInterfaceAndAbstract.FlyingObjects;


public class Bird extends FlyingObjects
{
	public int layEggsTime;
	public int eatTime;
	
	public Bird()
	{
		super();
		this.layEggsTime = 0;
		this.eatTime = 0;
	}
	public Bird(int takeoffTime, double speed, int landTime, int layEggsTime, int eatTime)
	{
		super(takeoffTime, speed, landTime);
		this.layEggsTime = layEggsTime;
		this.eatTime = eatTime;
	}
	
	public void layEggsTimeSetter(int layEggsTime)
	{
		this.layEggsTime = layEggsTime;
	}
	public int layEggsTimeGetter()
	{
		return this.layEggsTime;
	}
}
