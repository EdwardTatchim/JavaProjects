import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Car {
	
	private String steeringWheel;
	private boolean gasPedal;
	
	
	
	// constructor method

	
	public Car(boolean mygasPedal,String steeringWheel)
	{
		this.gasPedal = mygasPedal;
		this.steeringWheel = steeringWheel;
	}
	
	public String getSteeringWheel(String value)
	{
		this.steeringWheel = value;
		return this.steeringWheel ;
	}
	//accessor method
	public boolean getGasPedal()
	{
		return this.gasPedal;
		
	}
	
	// mutator  method
	public void setGasPedal(boolean myGasPedal)
	{
		gasPedal = myGasPedal;
	}
	
	public boolean driveMethod(String direction)
	{
		
		if(direction.equals("forward") || direction.equals("backward"))
		  return true;
		else
		  return false;	
	}
	public boolean driveMethod(int speed)
	{
		return true;
		
	}
	public boolean driveMethod(int speed, String direction)
	{
		return true;
	}
	public boolean driveMethod(String direction, int speed)
	{
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car car = new Car();
         Car car2 = new Car(true);
		car.driveMethod("up", 5);
		car.driveMethod(5);
		
		
		
		PrintWriter outputStreamName;
		Scanner obj = null;
		try
		{
		outputStreamName = new PrintWriter(new
		                    FileOutputStream("testsfile.txt", true));
		
		              outputStreamName.println("this is it i second just printed");
		              outputStreamName.close();
		              
		              
		              obj = new Scanner(new FileInputStream("testsfile.txt"));

		}
		catch(FileNotFoundException e)
		{
			System.out.println("this is the error");
			
		}
		catch(Exception e)
		{
			System.out.println("this is my second error");
		}
		
		 String mytext =obj.nextLine();
		 System.out.println("my text is " + mytext);
		 obj.close();

	}

}
