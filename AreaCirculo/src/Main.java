import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o Raio do círculo: ");
		
		double r, pi, A;
		r = sc.nextDouble();
		pi = 3.14159;
		A = pi * r * r;
		
		System.out.println("\n ==Dados Recebidos==");
		System.out.printf("O valor da área é: A = %.4f%n ", A);
		
		
		
		
		
		sc.close();
	}
}

