import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int fun, qtd;
		double hora, salario;
		
		System.out.print("Digite o número de um funcionário: ");
		fun = sc.nextInt();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		qtd = sc.nextInt();
		
		System.out.print("Digite o valor da hora: ");
		hora = sc.nextDouble();
		
		salario = (double)qtd * hora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f",fun,salario);
		
		sc.close();
		
	}
}
