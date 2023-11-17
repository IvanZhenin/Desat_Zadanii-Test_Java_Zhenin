import java.util.Scanner;

public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод числа
		System.out.println("Введите двузначное число");
		int number = in.nextInt(); 
		
		// Вычисление
		int itog = (number / 10) % 10; 
		
		// Вывод
       		System.out.println("Число десятков: " + itog);
	}
 }