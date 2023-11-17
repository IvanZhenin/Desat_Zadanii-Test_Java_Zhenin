import java.util.Scanner;

public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод числа
		System.out.println("Введите трехзначное число");
		int number = in.nextInt(); 
		
		// Вычисление
		int digit1 = number % 10; 
       		int digit2 = (number / 10) % 10; 
      		int digit3 = (number / 100) % 10; 
		int sum = digit1+digit2+digit3;
		
		// Вывод
       		System.out.println("Сумма трехзначного числа: " + sum); 
	}
}