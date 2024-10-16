package utilidades;

public class Funcoes_Uteis {
	
// Método criado para soma de dois números inteiros.
    public int soma(int a, int b) {
        return a + b; 
    }

// Método criado para desenhar triângulo com altura desejada, utilizando o comando "for" para a formação do mesmo.
    public void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println(); 
        }
    }

// Método para ler um arquivo, utilizando o "Scanner" para a a leitura do arquivo desejado, e ainda utiliza o comando "try catch" para criar uma exceção, onde caso o arquivo não seja encontrado.
    public void printArquivo(String arquivo) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(new java.io.File(arquivo));

//Comando "While" utilizado para leitura de cada linha e exibição após a leitura.
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine(); 
                System.out.println(linha); 
            }
            
            scanner.close();
            
//Exibição de mensagem caso a exceção seja ativada, exibindo a mensagem de "arquivo não encontrado"
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}
