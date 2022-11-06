public class WeatherList{
	
	private double sd;
	
      // class  object/instance
      // create an array of 60 weather
      // An array in Java is an object - it has its own attributes and methods
      // When we first create an array, it will be an array of null
      // its like buying a book shelf... u have the shelf, but not the books
	  public void WeatherData(){
		double Range[] =  {20, 45, 100};
		
		Weather readings[] = new Weather[60]; //line 17-21: generate data
		for (int i=0; i<readings.length; i++) {
			readings[i] = new Weather();  
			readings[i].generate(Range);
			readings[i].display();
		}
		System.out.println(" ");
	  
	  

		double min[] = {readings[0].getTemp(), readings[0].getHum(),
		readings[0].getWind(), readings[0].getPrep()};
	  
		double max[] = {readings[0].getTemp(), readings[0].getHum(),
		readings[0].getWind(), readings[0].getPrep()};
	  
		for(int i=0;i<readings.length;i++){//line 26-: finding min max
			if(min[0]>readings[i].getTemp())
				min[0]=readings[i].getTemp();
			if(max[0]<readings[i].getTemp())
				max[0]=readings[i].getTemp();
			if(min[1]>readings[i].getHum())
				min[1]=readings[i].getHum();
			if(max[1]<readings[i].getHum())
				max[1]=readings[i].getHum();
			if(min[2]>readings[i].getWind())
				min[2]=readings[i].getWind();
			if(max[2]<readings[i].getWind())
				max[2]=readings[i].getWind();
			if(min[3]>readings[i].getPrep())
				min[3]=readings[i].getPrep();
			if(max[3]<readings[i].getPrep())
				max[3]=readings[i].getPrep();
		}
	  
		System.out.println("Minimum temperature: " + min[0]);
		System.out.println("Maximum temperature: " + max[0]);
		System.out.println("Minimum humidity: " + min[1]);
		System.out.println("Maximum humidity: " + max[1]);
		System.out.println("Minimum wind speed: " + min[2]);
		System.out.println("Maximum wind speed: " + max[2]);
		System.out.println("Minimum precipitation: " + min[3]);
		System.out.println("Maximum precipitation: " + max[3]);
		System.out.println(" ");
	  
	  
	  double sum[]= new double[8];
	  
	  for(int i=0;i<readings.length;i++){
		  sum[0]+=readings[i].getTemp();
		  sum[1]+=readings[i].getHum();
		  sum[2]+=readings[i].getWind();
		  sum[3]+=readings[i].getPrep();
	  }
	  
	  double avg[]= new double[4];
	  avg[0]= sum[0]/readings.length;
	  System.out.println("Average temperature: " + avg[0]);
	  avg[1]= sum[1]/readings.length;
	  System.out.println("Average humidity: " + avg[1]);
	  avg[2]=sum[2]/readings.length;
	  System.out.println("Average wind speed: " + avg[2]);
	  avg[3]=sum[3]/readings.length;
	  System.out.println("Average precipitation: " + avg[3]);
	  System.out.println(" ");
	  
	  for(int i=0;i<readings.length;i++){
		  sum[4]+=Math.pow((readings[i].getTemp()+avg[0]),2);
		  sum[5]+=Math.pow((readings[i].getHum()+avg[1]),2);
		  sum[6]+=Math.pow((readings[i].getWind()+avg[2]),2);
		  sum[7]+=Math.pow((readings[i].getPrep()+avg[3]),2);
	  }
	  
	  sd=Math.sqrt((sum[4]/readings.length));
	  System.out.println("Temperature standard deviation: " + sd);
	  sd=Math.sqrt((sum[5]/readings.length));
	  System.out.println("Humidity standard deviation: " + sd);
	  sd=Math.sqrt((sum[6]/readings.length));
	  System.out.println("Wind Speed standard deviation: " + sd);
	  sd=Math.sqrt((sum[7]/readings.length));
	  System.out.println("Precipitation standard deviation: " + sd);
	  }
}