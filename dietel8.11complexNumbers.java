package javaapplication1;


public class ComplexNumbers{
	private imaginaryPart1;
	private imaginaryPart2;
	private realPart1;
	private realPart2;
	private realFinal;
	private imaginaryFinal;



	public ComplexNumbers(){
		this(0,0,0,0);
	}

	public ComplexNumbers(double realPart1, double imaginaryPart1, double realPart2, double imaginaryPart2){
			this.realPart1 = realPart1;
			this.imaginaryPart1	=imaginaryPart1;
			this.realPart2 = realPart2;
			this.imaginaryPart2= imaginaryPart2;

	}

	public void addition(double realPart1, double imaginaryPart1, double realPart2, double imaginaryPart2){
			this.realFinal = realPart1	+ realPart2;
			this.imaginaryFinal	= imaginaryPart1+ imaginaryPart2;

	}
	public void subtraction(double realPart1, double imaginaryPart1, double realPart2, double imaginaryPart2){
			if(realPart1 > realPart2){
				this.realFinal= realPart1 - realPart2;
			}  else {
				this.realFinal = realPart2	- realPart1;
			}
			if(imaginaryPart1 > imaginaryPart2){
				this.imaginaryFinal= imaginaryPart1 - imaginaryPart2;
			}  else {
				this.imaginaryFinal = imaginaryPart2	- imaginaryPart1;
			}
	}

	public double getImaginaryFinal(){
		return imaginaryFinal;
	}
	public double getRealFinal(){
		return realFinal;
	}

	public toString(){
		String.format("%10s \t %10s\n%-2f \t %-2fi", "Real ", " Imaginary", realFinal, imaginaryFinal);
	}
}