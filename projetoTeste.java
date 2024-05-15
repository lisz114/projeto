import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a temperatura em Fahrenheit que deseja transformar em Celsius: ");
		float fah = ler.nextFloat();
		
		float celsius = (float) ((fah - 32)/1.8);
		
		System.out.printf("Temperatura em Celsius: %.2f º", celsius);
		
		ler.close();
	}

}
