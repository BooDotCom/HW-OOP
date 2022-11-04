public class WeatherStationList{
	
	public void placeholder(){
		
		WeatherStation ws[] = new WeatherStation[2];
		
		for(int i=0;i<ws.length;i++){
			ws[i] = new WeatherStation();
			ws[i].InputStation();
			WeatherList wl = new WeatherList();
			wl.WeatherData();
		}
		
		int min[] = {ws[0].getSense()};
		int max[] = {ws[0].getSense()};
		
		for(int i=0;i<ws.length;i++){
			if(min[0]>ws[i].getSense())
				min[0]=ws[i].getSense();
			if(max[0]<ws[i].getSense())
				max[0]=ws[i].getSense();
		}
		
		System.out.println("Minimum number of stations: "+min[0]);
		System.out.println("Maximum number of stations: "+max[0]);
		
		int sum=0;
		int avg=0;
		
		for(int i=0;i<ws.length;i++)
			sum +=ws[i].getSense();
		
		avg = sum/ws.length;
		
		System.out.println("Average number of sensors: "+avg);
		
	}
	
}