package ThreeParticipants;
import ClassInterfaceAndAbstract.FlyingObjects;


public class Airplane extends FlyingObjects
{
	public int fillFuelTime;
	
	public Airplane()
	{
		super();
		this.fillFuelTime = 0;
	}
	public Airplane(int takeoffTime, double speed, int landTime, int fillFuelTime)
	{
		super(takeoffTime, speed, landTime);
		this.fillFuelTime = 0;
	}
	
	public void fillFuelSetter(int fillFuelTime)
	{
		this.fillFuelTime = fillFuelTime;
	}
	public int fillFuelGetter()
	{
		return this.fillFuelTime;
	}
}
