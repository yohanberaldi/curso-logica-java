import java.util.Scanner;

public class CalculaTabuada2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer multiplicador = receberNumeroInteiro("Digite o n�mero da tabuada que deseja calcular: ", scanner);
		
		imprimirTra�o("-----------------------------------------------------");
		imprimirTabuada(multiplicador, 0);
		imprimirTra�o("-----------------------------------------------------");
		
		
		scanner.close();
		
	}
	
	static Integer receberNumeroInteiro(String texto, Scanner scanner) {
		imprimirMesmaLinha(texto);
		Integer numeroInteiro = scanner.nextInt();
		return numeroInteiro;
	}
	
	static void imprimirMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirTra�o(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirTabuada (Integer multiplicador, Integer multiplo) {
		Integer resultado = multiplo * multiplicador;
		System.out.println(multiplicador +" x " + multiplo + " = " + resultado);
			if (++multiplo <= 10) {				
				imprimirTabuada(multiplicador, multiplo);
			}
	}

}
