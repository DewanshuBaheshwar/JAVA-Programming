import java.util.Scanner;

public class AddTwo_Numbers {
    public static void main(String[] args)
    {
        System.out.println("Taking Inputn from the user:");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
       int first_number = sc.nextInt();
      //  float first_number = sc.nextInt();
        
     System.out.println("enter second number:");
       int second_number = sc.nextInt();

       // float second_number = sc.nextInt();


    int addition = first_number + second_number;
        System.out.println("Addition is : "+ addition);

    }
}
