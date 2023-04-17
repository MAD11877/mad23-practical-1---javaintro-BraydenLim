import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {     
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    
    scanner out = new scanner(System.in);
    double weight = in.nextDouble();
    
    double BMI = weight / (height * height);
    System.out.println("Your BMI is", BMI);
  }
}
