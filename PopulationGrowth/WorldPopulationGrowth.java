public class WorldPopulationGrowth{
	public static void main(String... args){

		double currentWorldPopulation = 8_000_000_000l;
		double predictedWorldPopulation = 0;
		int year = 1;
		double numericalIncrease = 0;
		double percentageGrowthRate = 0.87;
		double numericalGrowthRate = 0l;

		System.out.println(currentWorldPopulation + "is the current population\n" + numericalGrowthRate + "is the current growth rate");
		
		System.out.println();
		System.out.println("year \tWorld population \tnumerical Increase");
		
		for(year = 1; year <= 75; year++){
			numericalGrowthRate = currentWorldPopulation * percentageGrowthRate;
			currentWorldPopulation += numericalGrowthRate;
			
			 predictedWorldPopulation = currentWorldPopulation + numericalGrowthRate;
			

			numericalIncrease = predictedWorldPopulation - currentWorldPopulation;

			System.out.printf("%d \t%8.1f \t\t%30.1f",year, predictedWorldPopulation, numericalGrowthRate );

			System.out.println();
		}

	}
}