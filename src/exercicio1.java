import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub

		double qtd;

		 Scanner ler = new Scanner(System.in);

		System.out.printf("Informe a quantidade de meses: ");
		qtd = ler.nextDouble();

		System.out.println("A quantidade de " +qtd+ " meses é " +(qtd * 30)+" dias");
		
			
	}

}
