package ClassInterfaceAndAbstract;


public class FlyingObjects implements FlyInterface
{
	public static String matchDate;
	public static final String Location = "China";
	public int takeoffTime = 0;
	public int landTime = 0;
	public double speed = 0;
	
	public FlyingObjects()
	{
		this.takeoffTime = 0;
		this.speed = 0;
		this.landTime = 0;
	}
	public FlyingObjects(int takeoffTime, double speed, int landTime)
	{
		this.takeoffTime = takeoffTime;
		this.speed = speed;
		this.landTime = landTime;
	}
	
	public void takeoffSetter(int takeoffTime)
	{
		this.takeoffTime = takeoffTime;
	}
	public int takeoffGetter()
	{
		return this.takeoffTime;
	}
	public void flySetter(double speed)
	{
		this.speed = speed;
	}
	public double flyGetter()
	{
		return this.speed;
	}
	public void landSetter(int landTime)
	{
		this.landTime = landTime;
	}
	public int landGetter()
	{
		return this.landTime;
	}
}
