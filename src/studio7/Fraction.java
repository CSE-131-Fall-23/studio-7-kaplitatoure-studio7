package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
		// TODO Auto-generated method stub
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	


public int getNumerator() {
		return this.numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

public Fraction addFraction(Fraction other){
	int numerator = this.getNumerator()*other.getDenominator();
	int numerator2= other.getNumerator()* this.getDenominator();
	int denominator = this.getDenominator()*other.getDenominator();
	int totalFraction= (numerator + numerator2);
	return new Fraction(totalFraction, denominator);
	
}
}