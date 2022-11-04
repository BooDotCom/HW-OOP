import java.util.Random;

public class Weather { // a class consists of data + operation
    
    // data OR attributes
    private double temperature;
    private double wind;
    private double humidity;
    private double precipitation;
	
	public double getTemp(){
		return temperature;
	}
	
	public void setTemp(double n){
		this.temperature = n;
	}
	
	public double getWind(){
		return wind;
	}
	
	public void setWind(double b){
		this.wind = b;
	}
	
	public double getHum(){
		return humidity;
	}
	
	public void setHum(double v){
		this.humidity = v;
	}
	
	public double getPrep(){
		return precipitation;
	}
	
	public void setPrep(double c){
		this.precipitation = c;
	}
    
    // methods OR operation : must be tightly coupled to the data
	
	//constructors - no return type. Name is the same as class. Upon creating, constructor will be called
	//automatically and perform the instructions given.
	/*public Weather(){
		System.out.println("Constructor is called");
		temperature = 10;
		wind = 30;
	}*/
	
    public void generate(double Range[]) {
		Random rand = new Random();
        temperature = rand.nextDouble()* (Range[1]-Range[0])+ Range[0];
		precipitation = rand.nextDouble() * Range[2];
		wind = rand.nextDouble() * Range[0];
		humidity= rand.nextDouble() * Range[2];
		
    }
	
	public void display(){
		System.out.println("temperature: " + temperature);
		System.out.println("humidity: " + humidity);
		System.out.println("precipitation: " + precipitation);
		System.out.println("wind: " + wind);
	}
	
} 
//An array in Java is an object, hence it has different attributes
//Upon creating an array, it will contain nothing, hence the 'null' when displaying it