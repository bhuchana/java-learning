package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements RaFortuneService {

	
	String data[]=
			{"ramdom fortune 1",
					"ramdom fortune 2",
					"ramdom fortune 3",
			};
	
     private Random random=new Random(); 
	
	@Override
	public String getFortune() {
      int i=random.nextInt(data.length);
		return data[i];
	}
	

}
