package Scanner;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		        // Create a scanner object to accept user inputs
		        Scanner ob = new Scanner(System.in);

		        String name;
		        System.out.println("Enter Person Name: ");
		        name = ob.next();

		        System.out.println("Enter age: ");
		        int age = ob.nextInt();

		        System.out.println("Enter gender: ");
		        String gender = ob.next();

		        System.out.println("Enter taxable income: ");
		        int income = ob.nextInt();

		        // Create a Person object and initialize values using setter methods
		        Person person = new Person();
		        person.setName(name);
		        person.setAge(age);
		        person.setGender(gender);
		        person.setIncome(income);

		        // Display person details using toString() method
		        System.out.println(person);

		        // Calculate tax using a TaxCalculation object
		        TaxCalculation calc = new TaxCalculation();
		        calc.calculateTax(person);

		        // Display person details after calculating tax
		        System.out.println("After calculating tax:");
		        System.out.println(person);

		        // Close the scanner
		        ob.close();
		    }


	}


