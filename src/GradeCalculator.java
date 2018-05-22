import java.util.Scanner;

public class GradeCalculator{

    public static void main(String args[]) {
       
        
        int grade;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numeric grade out of 100: ");

        grade = input.nextInt();
        
       
       // 90 - 100 --> A
       if (grade == 100 || grade >= 90)
       {
           System.out.println("Grade an A");
       }
       
       // 80 - 89 --> B
       if (grade >= 80 && grade < 90) 
       {
           System.out.println("Grade a B");
       }
       
       // 70 - 79 --> C
       if (grade >= 70 && grade < 80) 
       {
           System.out.println("Grade a C");
       }
       
       // 60 - 69 --> D
       if (grade >= 60 && grade < 70) 
       {
           System.out.println("Grade a D");
       }
       
        // 0 - 59 --> F
       if (!(grade > 59)) 
       {
           System.out.println("Grade a F");
       }
   }
}
        