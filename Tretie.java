import java.util.Scanner;

public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Вввод числа
		System.out.println("Введите двузначное число");
		int number = in.nextInt();
		
		// Вычисление
		int num2 = (number/10)%10*10; 
        	int itog = number - num2;
        
      		// Вывод результата
       		System.out.println("Число десятков: " + (float)itog);
	}
}