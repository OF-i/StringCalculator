package is.ru.StringCalculator;

public class Calculator{

  public static int add(String numbers)
  {
    if(numbers.equals(""))
    {
      return 0;
    }
    else
    {
      if(numbers.contains(","))
      {
        String[] arguments = numbers.split(",");
        if(arguments.length > 2)
        {
        	throw new IllegalArgumentException("The function only takes 0, 1 or 2 numbers");
        }
        return parse(arguments[0]) + parse(arguments[1]);
      }
      return parse(numbers);
    }
  }
  private static int parse(String num)
  {
	  return Integer.parseInt(num);
  }
}
