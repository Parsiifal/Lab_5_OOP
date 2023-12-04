import functions.*;
import functions.basic.*;
import java.io.*;
import functions.TabulatedFunction;
import functions.TabulatedFunctions;

public class Main
{
	public static void main(String[] args) throws InappropriateFunctionPointException
	{

		FunctionPoint[] b = {new FunctionPoint(0.0, 1.2),
							 new FunctionPoint(1.0, 3.8),
							new FunctionPoint(2.0, 15.2)};
		ArrayTabulatedFunction tab = new ArrayTabulatedFunction(b);

		FunctionPoint[] b2 = {new FunctionPoint(0.0, 1.2),
				new FunctionPoint(1.0, 3.8),
				new FunctionPoint(2.0, 15.2)};
		ArrayTabulatedFunction tab2 = new ArrayTabulatedFunction(b2);

		boolean bool = tab2.equals(tab);
		System.out.println(bool);

	}

	public static void printFunctionValues(TabulatedFunction function) // функция для вывода значений функции
	{
		System.out.println("Значения функции:");

		for (int i = 0; i < function.getPointsCount(); i++)
		{
			double x = function.getPointX(i);
			double y = function.getPointY(i);
			System.out.println("f(" + x + ") = " + y);
		}
		System.out.println();
	}
}