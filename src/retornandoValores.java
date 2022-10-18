import java.util.Scanner;

public class retornandoValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java SE", "Spring", "Java 00 Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoEscolhidaCurso = receberNumeroInteiroUsuario("Curso escolhido: ", scanner);
		
		Boolean posicaoValida = verificaPosicaoValida(posicaoEscolhidaCurso, cursos);
		
		if (!posicaoValida) {
			posicaoInvalida();
			}
		
		//verificaPosicaoValida(posicaoValida, posicaoEscolhidaCurso, cursos);
		//Boolean posicaoValida = posicaoEscolhida >= 0 && posicaoEscolhida < cursos.length;
		
		imprimirTraco();
		
		String[] formasPagamento = new String [] {"Cartão", "Boleto"};
		
		imprimir("Selecione a forma de pagamento desejada: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		Integer posicaoEscolhidaPagamento = receberNumeroInteiroUsuario("Forma de pagamento escolhida: ", scanner);
		
		Boolean posicaoPagamentoValida= verificaPosicaoValida(posicaoEscolhidaPagamento, formasPagamento);
		if (!posicaoPagamentoValida) {
			posicaoInvalida();
			}
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursos[posicaoEscolhidaCurso] + " e a forma de pagamento escolhida foi " + formasPagamento[posicaoEscolhidaPagamento] + ".");
		
		scanner.close();
	}
	
	static Integer receberNumeroInteiroUsuario (String texto, Scanner scanner) {
		imprimirMesmaLinha("Curso escolhido: ");
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static void imprimir (String texto) {
		System.out.println(texto);
	}
	
	static void imprimirMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirTraco() {
		imprimir("---------------------------------------------------------");
	}
	
	static void posicaoInvalida() {
		imprimir("Posição Inválida. Digite novamente.");
		System.exit(1);
	}

	static void iterarEExibirPosicoesDoVetorString (String[] vetor) {
		for (int i=0; i < vetor.length; i++) {
			//System.out.println("[" + i + "]" + vetor [i]);
			System.out.println(i + "." + vetor [i]);
			}
	}
	
//	static void verificaPosicaoValida (Boolean posicaoValida, Integer posicaoEscolhida, String[] cursos) {
//			posicaoValida = posicaoEscolhida >= 0 && posicaoEscolhida < cursos.length;
//			if (!posicaoValida) {
//				posicaoInvalida();
//			}
//	}
			
	static Boolean verificaPosicaoValida (Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
		}
	}
