import java.util.Scanner; 

public class Milesperhour {

	private int distance, hours, minutes;
	private double mph;

	public Milesperhour()
	{
		changeNums(0,0,0);
	}

	public Milesperhour(int d, int h, int m)
	{
		changeNums(d, h, m);
	}

	public void changeNums(int temp_d, int temp_h, int temp_m)
	{
		distance = temp_d;
		hours = temp_h;
		minutes = temp_m;
	}

	public void calcMPH()
	{
	mph = distance/(hours + minutes/60.0);
		System.out.println("The miles per hour is " + mph);
	}

} 

