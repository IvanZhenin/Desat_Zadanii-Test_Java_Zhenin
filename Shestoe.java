import java.util.Scanner;
public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод числа
		System.out.println("Введите число");
		int number = in.nextInt(); 
		
		// Вычисление часов и минут
		int hours = (number / 60) % 24; 
       		int minutes = number % 60; 

        	// Вывод
       		System.out.println("Часы: " + hours);
      		System.out.println("Минуты: " + minutes);
	}
}