import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("[DNA Reverser and Translator]");
        System.out.print("Enter a sequence: ");
        String sequence = userInput.nextLine().toUpperCase();
        if(DNALib.validator(sequence))
        {
            sequence = DNALib.reverser(sequence);
            sequence = DNALib.inverser(sequence);
            sequence = DNALib.translator(sequence);
            System.out.println("Your DNA sequence reversed and translated is:\n" + sequence);
        }
        else
        {
            System.out.println("Your DNA sequence is not valid.");
        }

    }
}

