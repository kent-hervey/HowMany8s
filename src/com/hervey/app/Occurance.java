package com.hervey.app;

public class Occurance {
	static int countEights(int numberRooms) {


		if(numberRooms>0) {
			int numberOfEightsFound =0;
			for(int counter=1; counter<numberRooms+1; counter++) {
				String counterAsString = Integer.toString(counter);
				for (int i=0; i<counterAsString.length(); i++) {
					if(counterAsString.charAt(i)=='8') {
						numberOfEightsFound++;
					}
				}
			}
			return numberOfEightsFound;

		}

		else {
			System.out.println("negative returned");
			return -100;
		}


	}
}
