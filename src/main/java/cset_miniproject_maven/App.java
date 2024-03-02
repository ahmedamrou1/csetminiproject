package cset_miniproject_maven;
import org.apache.commons.validator.routines.CreditCardValidator;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        CreditCardValidator validator = new CreditCardValidator();
        System.out.println("Enter a 16 digit credit card number: ");
        String card = scanner.nextLine();
        boolean isvalid = validator.isValid(card);
        if (isvalid == true){
            System.out.println("Valid credit card");
        }
        else {
            System.out.println("Invalid credit card");
        }
        scanner.close();

    }
}
