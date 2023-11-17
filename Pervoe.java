import java.util.Scanner;

public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Объявление переменных
		int chislo = 0;		
		
		// Ввод числа
		System.out.println("Введите целое число, программа выведет последнюю цифру");
		chislo = in.nextInt(); 
		
		// Вычисление
		int number = chislo % 10; 
		
		// Вывод
		System.out.println("Последняя цифра: " + number);
	}
}