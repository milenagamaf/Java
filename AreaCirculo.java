import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double circulo,raio,pi,result;
		
		circulo = sc.nextDouble();
		raio = Math.pow(circulo, 2);
		pi = 3.14159;
		result = pi*raio;
		
		System.out.printf("A = %.4f",result);
				
		
		sc.close();
	}

}
