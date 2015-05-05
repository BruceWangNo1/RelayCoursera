package ClassInterfaceAndAbstract;

public interface FlyInterface
{
	public int takeOffTime = 0, landTime = 0;
	public double speed = 0;
	public void takeoffSetter(int takeOffTime);
	public int takeoffGetter();
	public void flySetter(double speed);
	public double flyGetter();
	public void landSetter(int landTime);
	public int landGetter();
}
