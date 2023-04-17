import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter height: ");
    double height = in.nextDouble();
    
    scanner out = new scanner(System.in);
    System.out.println("Enter weight: ");
    double weight = in.nextDouble();
    
    double BMI = weight / ((height / 100) * (height / 100));
    System.out.println("Your BMI is", BMI);
  }
}
