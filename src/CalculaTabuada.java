import java.util.Scanner;

public class CalculaTabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirMesmaLinha("Digite o número para calcular a tabuada: ");
		Double numeroDigitado = receberNumeroInteiroUsuario(scanner);
		
		imprimirTraco();
		
		imprimirTabuada(numeroDigitado, 0.0);
		
		scanner.close();
		
		}
	
	static void imprimirMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------------------------");
	}
	
	static Double receberNumeroInteiroUsuario (Scanner scanner) {
		Double numero = scanner.nextDouble();
		return numero;
	}
	
	static void imprimirTabuada(Double numeroDigitado, Double multiplicador) {
		Double valorMultiplicacao = numeroDigitado * multiplicador;		
		System.out.println(numeroDigitado + " x " + multiplicador + " = " + valorMultiplicacao);
		
			if (++multiplicador <=10.0) {
				imprimirTabuada(numeroDigitado, multiplicador);
				}
	}
	
}
