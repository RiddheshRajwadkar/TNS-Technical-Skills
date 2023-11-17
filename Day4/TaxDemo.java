package Day4;

import java.util.Scanner;

public class TaxDemo {
    public static void main(String[] args) {

        /*person1.setName("Riddhesh"); person1.setAge(22); person1.setGender("male");
        person1.setIncome(80000);*/

        String name,gender;
		int age,income;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Gender");
		gender=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enter Income");
		income=sc.nextInt();

        Person person1 = new Person(name, age, gender, income);
        System.out.println(person1);

        TaxCalculator tax1 = new TaxCalculator();
        tax1.calculateTax(person1);
        System.out.println(person1);
        sc.close();
    }
}
