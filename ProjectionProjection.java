
public class ProjectionProjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentpopul = 312032486;
		long secinayr = 31536000;
		
		for (int i = 1; i <= 5; i++) {
			double births = secinayr / 7;
			double deaths = secinayr / 13;
			double immigrants = secinayr / 45;
			
			currentpopul += births + immigrants;
			currentpopul -= deaths;
			System.out.println("For year " + i + " current population is " + currentpopul);
		}
	}

}
