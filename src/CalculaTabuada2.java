import java.util.Scanner;

public class CalculaTabuada2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer multiplicador = receberNumeroInteiro("Digite o número da tabuada que deseja calcular: ", scanner);
		
		imprimirTraço("-----------------------------------------------------");
		imprimirTabuada(multiplicador, 0);
		imprimirTraço("-----------------------------------------------------");
		
		
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
	
	static void imprimirTraço(String texto) {
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
