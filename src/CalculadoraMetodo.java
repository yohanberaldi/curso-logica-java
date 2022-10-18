import java.util.Scanner;

public class CalculadoraMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirMesmaLinha("Digite o primeiro numero: ");
		Double primeiroNumero = receberNumeroInteiroUsuario(scanner);
		
		imprimirMesmaLinha("Digite o segundo numero: ");
		Double segundoNumero = receberNumeroInteiroUsuario(scanner);
		
		imprimir("Menu de operações:  ");
		imprimir("");
		imprimir("1 = Subtração");
		imprimir("2 = Soma");
		imprimir("3 = Multiplicação");
		imprimir("4 = Divisão");
		imprimir("");
		imprimirMesmaLinha("Digite uma opção >> ");
		
		Integer operador = scanner.nextInt();
		
		Double resultadoOperacao = 0.0;
		
		switch (operador) {
		case 1: resultadoOperacao = calculoSubtracao(primeiroNumero, segundoNumero);
		break;
		case 2: resultadoOperacao = calculoSoma(primeiroNumero, segundoNumero);
		break;
		case 3: resultadoOperacao = calculoMultiplicacao(primeiroNumero, segundoNumero);
		break;
		case 4: resultadoOperacao = calculoDivisao(primeiroNumero, segundoNumero);
		break;
		default:
			System.err.println("Digite um operador válido. ");
			System.exit(1);
				break;
		}
		
		imprimir("Resultado: " + resultadoOperacao);
		
		scanner.close();
		
		}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static Double receberNumeroInteiroUsuario (Scanner scanner) {
		Double numero = scanner.nextDouble();
		return numero;
	}
	
	static Double calculoSubtracao (Double primeiroNumero, Double segundoNumero) {
			Double resultado;
			resultado = primeiroNumero - segundoNumero;
			return resultado;
		}
	
	static Double calculoSoma ( Double primeiroNumero, Double segundoNumero) {
			Double resultado;
			resultado = primeiroNumero + segundoNumero;
			return resultado;
		}
	
	static Double calculoMultiplicacao (Double primeiroNumero, Double segundoNumero) {
			Double resultado;
			resultado = primeiroNumero * segundoNumero;
			return resultado;
		}
	
	static Double calculoDivisao (Double primeiroNumero, Double segundoNumero) {
			Double resultado;
			resultado = primeiroNumero / segundoNumero;
			return resultado;
		}
	}

