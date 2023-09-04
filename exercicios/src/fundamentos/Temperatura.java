package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		
		double Fahrenheit = 78.5;
		final int NumeroSubtracao = 32;
		final double NumeroDivisao = 5/9.0;
		
		double Celsius = (Fahrenheit - NumeroSubtracao) * NumeroDivisao;
		System.out.println(Celsius);
		
	}
}
