import ThreeParticipants.Airplane;
import ThreeParticipants.Bird;
import ThreeParticipants.Superman;

//This is the assignment from Coursera which requires us to do some programming to implement
//interface class abstract definition setter getter static final @Override
//This is a relay game consisting three objects: A380, weka, and Ironman
//This is the program to calculate the average speed of the relay.
public class FlyingObjectsWorld
{
	public static void main(String args[])
	{
		Airplane A380 = new Airplane(0, 20, 100, 10);//One more fillfuelTime
		Bird weka = new Bird(100, 10, 200, 10, 10);//Two more layEggsTime and eatTime
		Superman Ironman = new Superman(300, 40, 300, 10);//One more eatTime
		
		int totalTime;
		double totalDistance;
		double averageSpeed;
		
		totalTime = Ironman.landTime - A380.takeoffTime;
		totalDistance = A380.speed * (A380.landTime - A380.takeoffTime -A380.fillFuelTime)+
				weka.speed * (weka.landTime - weka.takeoffTime - weka.layEggsTime - weka.eatTime)+
				Ironman.speed * (Ironman.landTime - Ironman.takeoffTime - Ironman.eatTime);
		
		averageSpeed = totalDistance/(double)totalTime;
		
		System.out.printf("The average speed of the relay is %.2f.", averageSpeed);
	}
}
