package finalexam;

import java.util.List;

public class Day4 {
	public static int truckTour(List<List<Integer>> petrolpumps) {
	    // Write your code here
	    int index = 0;
	    long tank = 0, dis = 0;
	    
	    for (int i = 0; i < petrolpumps.size(); i++) { 
	    	long fuel = petrolpumps.get(i).get(0);
	    	dis = petrolpumps.get(i).get(1);
	    	
	    	long diff = fuel - dis;
	    	
	    	tank += diff;
	    	
	    	if(tank < 0) {
	    		index += 1;
	    		fuel = 0;
	    	}
	    	
	    }
	    return index;
	}

}
