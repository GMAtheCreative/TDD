public class TaxCalculator{
	
	public double tenPercentCalculator(int earnings){
	
		earnings = 8000;
		double tax = 8000 * 0.1;

		return tax;
	}

	
	public double greaterThanBaseAmount(int earnings){

			int firstCut = earnings - 8_000;
			
			double tax1 = 8_000 * 0.1;
			double tax2 = 0;
		
			if (firstCut <= 8_000){
				tax2 += firstCut * 0.1;
			}

			else if (firstCut > 8_000 && firstCut < 33_951){
				tax2 += firstCut * 0.15;
			}

			else if (firstCut > 33_950 && firstCut < 82_251){
				tax2 += firstCut * 0.25;
			}
		
			else if (firstCut > 82_250 && firstCut < 171_551){
				tax2 += firstCut * 0.28;
			}

		
			else if (firstCut > 171_550 && firstCut < 372_951){
				tax2 += firstCut * 0.33;
			}
		
			else if (firstCut > 372_950){
				tax2 += firstCut * 0.35;
			}

		double tax = tax1 + tax2;

	return tax;
	}

}