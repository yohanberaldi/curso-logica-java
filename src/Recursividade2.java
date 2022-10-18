import java.util.Scanner;

public class Recursividade2 {

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
		iterarEExibirPosicoesDoVetorString(vetor,0);
	}
	
	static void iterarEExibirPosicoesDoVetorString (String[] vetor, Integer i) {
		System.out.println(i + "." + vetor [i]);
		if (++i <vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, i);
		}
	}
	
	static Boolean verificaPosicaoValida (Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
		}
	}
