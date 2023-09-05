package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String S = "Bom dia X";
		S = S.replace("X", "senhora");
		S = S.toUpperCase();
		S = S.concat("!!!");
		
		
		System.out.println(S);
		System.out.println("Ricardo".toUpperCase());
		
		String Y = "Bom dia X"
				.replace("X", "Ricardo")
				.toUpperCase()
				.concat("!!");
		System.out.println(Y);
		
		//Tipos primitivos não tem o operador "."
		
	}

}
