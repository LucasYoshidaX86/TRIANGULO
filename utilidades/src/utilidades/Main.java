package utilidades;

public class Main {

	public static void main(String[] args) {
		
//Criação de instância para chamar todos os métodos da classe Funcoes_Uteis.
		 Funcoes_Uteis util = new Funcoes_Uteis();

//Exibição de resultados da soma de dois números inteiros.
	        int resultadoSoma = util.soma(80, 1670);
	        System.out.println("Resultado da soma: " + resultadoSoma);

//Exibição de resultados para a criação do triângulo com altura desejada.
	        System.out.println("Triângulo de altura 4:");
	        util.triangulo(4);

//Exibição de resultados para a leitura de arquivos, colocando o caminho do arquivo desejado (Altere o caminho para leitura do arquivo).
	        String caminhoArquivo = "C:\\Users\\lucas\\OneDrive\\Desktop\\Rede de computadores\\Calcule os endereços de Rede, Broad.txt"; 
	        util.printArquivo(caminhoArquivo);
	    }

}
