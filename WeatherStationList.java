public class WeatherStationList{
	
	private int sum;
	private int avg;
	private int min;
	private int max;
	
	public void CalcSensors(){
		
		WeatherStation ws[] = new WeatherStation[2];
		
		for(int i=0;i<ws.length;i++){
			ws[i] = new WeatherStation();
			ws[i].InputStation();
			WeatherList wl = new WeatherList();
			wl.WeatherData();
		}
		
		min = ws[0].getSense();
		max = ws[0].getSense();
		
		for(int i=0;i<ws.length;i++){
			if(min>ws[i].getSense())
				min=ws[i].getSense();
			if(max<ws[i].getSense())
				max=ws[i].getSense();
		}
		
		System.out.println("Minimum number of stations: "+min);
		System.out.println("Maximum number of stations: "+max);
		
		for(int i=0;i<ws.length;i++)
			sum +=ws[i].getSense();
		
		avg = sum/ws.length;
		
		System.out.println("Average number of sensors: "+avg);
		
	}
	
}