import java.util.Scanner;

public class file {
  public static void main(String[] args) {

      Scanner scanner = new Scanner (System.in);

      System.out.println("Which one do you prefer ? ");
      System.out.println("Write 1 to convert Kgs to Lbs");
      System.out.println("Write 2 to convert Lbs to Kgs");

      System.out.print("Write 1 or 2 ?  ");
      int which = scanner.nextInt();

      if (which == 1) {
          System.out.print("Enter your weight in Kgs ");
          double weightInKgs = scanner.nextDouble();
         double lbs = weightInKgs * 2.2;
          System.out.printf("Your weight in Lbs = %.2f " , lbs);
          
      } else if (which == 2) {

          System.out.print("Enter your number in lbs ");
          double weightInLbs = scanner.nextDouble();
          double kg = weightInLbs / 2.2;
          System.out.printf("Your weight in Kgs = %.2f " , kg);
          
      } else {
          System.out.println("You should write 1 or 2 based on your demand not something else");
      }
      
      scanner.close();

  }
}
