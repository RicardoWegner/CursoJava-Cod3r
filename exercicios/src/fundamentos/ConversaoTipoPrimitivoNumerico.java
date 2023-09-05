package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita
		System.out.println(a);
		
		float b = (float) 1.122222212312131223; //explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
	}
}
