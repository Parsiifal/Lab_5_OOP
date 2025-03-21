import functions.*;
import functions.basic.*;
import java.io.*;
import functions.TabulatedFunction;
import functions.TabulatedFunctions;

public class Main
{
	public static void main(String[] args) throws InappropriateFunctionPointException
	{
		FunctionPoint a = new FunctionPoint(2, 6);
		FunctionPoint b = new FunctionPoint(2,6);

		double[] x = {1,2,4};
		double[] y = {1,6,23};

		ArrayTabulatedFunction arr = new ArrayTabulatedFunction(x,y);

		FunctionPoint[] points = {new FunctionPoint(3, 4),
									new FunctionPoint(8,16),
									new FunctionPoint(9, 34)};

		FunctionPoint[] points2 = {new FunctionPoint(1, 4),
									new FunctionPoint(8,16),
									new FunctionPoint(9, 34)};

		ArrayTabulatedFunction arr2 = new ArrayTabulatedFunction(points);

		LinkedListTabulatedFunction link = new LinkedListTabulatedFunction(points);
		LinkedListTabulatedFunction link2 = new LinkedListTabulatedFunction(points2);


		LinkedListTabulatedFunction link3 = (LinkedListTabulatedFunction) link2.clone();

		System.out.println(link2.equals(arr2));

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