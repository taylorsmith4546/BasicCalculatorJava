
public class Calculator {
  
   public Calculator() //constructor
   {}
  
  public int add (int a, int b) //method add
    
    return (a + b);
  }
  
  public int substract(int a, int b) //method substract
      
  
{
return a - b; 
}
  
public int multiply(int a, int b) //method multiply
      
  
{
return a * b; 
}
  
public int divide(int a, int b) //method divide
      
  
{
  if (b == 0)
  {
    System.out.println("Error! Dividing by zero is not allowed.");
  return 0;
  }
  else
  {
return a / b; 
  }
    
}
  
public int modulo(int a, int b) //method modulo
      
  
{
if (b == 0)
  {
    System.out.println("Error! Dividing by zero is not allowed.");
  return 0;
  }
  else
  {
return a % b; 
  }
 
}
  
  public static void main(String[] args) {//main method
  Calculator myCalculator = new Calculator ();//object myCalc.
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.substract(45, 11));
  }
    