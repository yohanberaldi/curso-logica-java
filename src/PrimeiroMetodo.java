import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java SE", "Spring", "Java 00 Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for (int i=0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos [i]);
			}
		System.out.println("Curso escolhido: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String [] {"Cartão", "Boleto"};
		
		System.out.println("Selecione a forma de pagamento desejada: ");
		
		for (int i=0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
			}
		
		System.out.println("Forma de pagamento escolhida: ");
		Integer pagamentoEscolhido = scanner.nextInt();
		
		Boolean posicaoPagamentoValida = pagamentoEscolhido >= 0 && pagamentoEscolhido < cursos.length;
		
		if (!posicaoPagamentoValida) {
			posicaoInvalida();
			}
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursos[posicaoCursoEscolhido] + " e a forma de pagamento escolhida foi " + formasPagamento[pagamentoEscolhido] + ".");
		
		scanner.close();
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------------------------");
	}
	
	static void posicaoInvalida() {
		System.out.println("Posição Inválida. Digite novamente.");
		System.exit(1);
	}

}
