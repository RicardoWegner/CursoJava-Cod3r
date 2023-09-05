package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 23;
		var salario = 12345.98;
		
		System.out.println("Nome: " 
				+ nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " 
				+ idade + "\nSalário: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e recebe um salário de R$ %.2f", nome, sobrenome, idade, salario);
		String frase= String.format("\nO senhor %s %s tem %d anos e recebe um salário de R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		System.out.println(frase.contains("senhor"));
		System.out.println(frase.indexOf("senhor"));
		System.out.println(frase.substring(3, 9));
		
	}
}
