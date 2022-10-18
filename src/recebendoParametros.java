import java.util.Scanner;

public class recebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java SE", "Spring", "Java 00 Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		System.out.println("Curso escolhido: ");
		Integer posicaoEscolhidaCurso = scanner.nextInt();
		Boolean posicaoValida = true;
		
		verificaPosicaoValida(posicaoValida, posicaoEscolhidaCurso, cursos);
		//Boolean posicaoValida = posicaoEscolhida >= 0 && posicaoEscolhida < cursos.length;
		
		imprimirTraco();
		
		String[] formasPagamento = new String [] {"Cartão", "Boleto"};
		
		System.out.println("Selecione a forma de pagamento desejada: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		System.out.println("Forma de pagamento escolhida: ");
		Integer posicaoEscolhidaPagamento = scanner.nextInt();
		Boolean posicaoPagamentoValida=true;
		
		verificaPosicaoValida(posicaoPagamentoValida,posicaoEscolhidaPagamento, cursos);
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursos[posicaoEscolhidaCurso] + " e a forma de pagamento escolhida foi " + formasPagamento[posicaoEscolhidaPagamento] + ".");
		
		scanner.close();
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------------------------");
	}
	
	static void posicaoInvalida() {
		System.out.println("Posição Inválida. Digite novamente.");
		System.exit(1);
	}

	static void iterarEExibirPosicoesDoVetorString (String[] vetor) {
		for (int i=0; i < vetor.length; i++) {
			//System.out.println("[" + i + "]" + vetor [i]);
			System.out.println(i + "." + vetor [i]);
			}
	}
	
	static void verificaPosicaoValida (Boolean posicaoValida, Integer posicaoEscolhida, String[] cursos) {
			posicaoValida = posicaoEscolhida >= 0 && posicaoEscolhida < cursos.length;
			if (!posicaoValida) {
				posicaoInvalida();
			}
	}
}
