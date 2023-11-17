import java.util.Scanner;
public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод числа
		System.out.println("Введите число"); 
		int nomberUroka = in.nextInt(); 
		
		// Вычисления
		int minutes = (nomberUroka - 1) * 50 + (nomberUroka / 2) * 10;
       		int hours = 9 + minutes / 60;
        	minutes %= 60;
        
       		// Вывод
        	System.out.println("Время окончания урока: " + hours + ":" + (minutes < 10 ? "0" : "") + minutes);
	}
}