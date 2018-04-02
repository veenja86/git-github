package bottel;

interface int1{
	void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class abc implements int1 {

	int speed;
	int gear;
	public void changeGear(int newGear)
	{
		gear=newGear;
	}
	public void  speedUp(int increment){
		speed=speed+increment;
	}
	public void printstages(){
		System.out.println("speed:"+ speed+ "Gear:"+gear);
	}
	public void applyBrakes(int decrement) {
		speed=speed-decrement;
		
	}
}
	
public class inter{
public static void main(String[] args) {
		abc in=new abc();
		in.changeGear(2);
		in.speedUp(2);
		in.applyBrakes(10);
		System.out.println("Present states of car:");
		in.printstages();
		
		System.out.println();
	}

}
