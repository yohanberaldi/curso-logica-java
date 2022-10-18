import java.util.Scanner;

public class EscolhendoBonsNomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String cursoEscolhido = receberCursoDoUsuario(scanner);
		
		imprimirTraco();
		
		String formaPagamentoEscolhida = receberFormaDePagamentoDoUsuario(scanner);
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento escolhida foi " + formaPagamentoEscolhida + ".");
		
		scanner.close();
	}
	
	static String receberFormaDePagamentoDoUsuario(Scanner scanner) {
		
		String[] formasPagamento = new String [] {"Cartão", "Boleto"};
		imprimir("Selecione a forma de pagamento desejada: ");
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		Integer posicaoEscolhidaPagamento = receberIndiceValidoDoUsuario(formasPagamento, "Forma de pagamento escolhida: ", scanner);
		return formasPagamento[posicaoEscolhidaPagamento];
	}
	
	static String receberCursoDoUsuario(Scanner scanner){
		
		String[] cursos = new String[] {"Java SE", "Spring", "Java 00 Avançado"};
		imprimir("Escolha dentre os cursos abaixo: ");
		iterarEExibirPosicoesDoVetorString(cursos);
		Integer posicaoEscolhidaCurso = receberIndiceValidoDoUsuario(cursos, "Curso escolhido: ", scanner);
		return cursos[posicaoEscolhidaCurso];
	}
	
	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner){
		
		Integer posicaoEscolhida = receberNumeroInteiroUsuario(texto, scanner);
		
		Boolean posicaoValida = verificaPosicaoValida(posicaoEscolhida, vetor);
		
		if (!posicaoValida) {
			posicaoInvalida();
			}
		
		return posicaoEscolhida;
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
