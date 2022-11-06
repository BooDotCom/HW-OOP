import java.util.Scanner;

public class WeatherStation{
	
	private String location;
	private String reportingbody;
	private int numsensors;
	
	public String getLoc(){
		return location;
	}
	
	public void setLoc(String Q){
		this.location = Q;
	}
	
	public String getBody(){
		return reportingbody;
	}
	
	public void setBody(String W){
		this.reportingbody = W;
	}
	
	public int getSense(){
		return numsensors;
	}
	
	public void setSense(int E){
		this.numsensors = E;
	}
	
	public void InputStation(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Location: ");
		String temp1= scanner.nextLine();
		setLoc(temp1);
		System.out.println("Reporting Body: ");
		String temp2 = scanner.nextLine();
		setBody(temp2);
		System.out.println("Number of sensors: ");
		int temp3 = scanner.nextInt();
		scanner.nextLine();
		setSense(temp3);
	}
	
}