package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoo = 542;
		int id = 56780;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos números reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_193.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //Ativo
	
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numerosDeVoo / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " recebe -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
