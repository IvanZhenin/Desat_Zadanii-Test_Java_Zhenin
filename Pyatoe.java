import java.util.Scanner;
public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод числа
		System.out.println("Введите целое число");
		int number = in.nextInt();
		
		// Вычисление
		int vivod = number + 2 - (number % 2); 
		
		// Вывод
       		System.out.println("Следующе четное число: " + vivod);
	}
}