import java.util.*;

class Tax{
    public static void a(int income) {
        float tax;
        if (income > 1000000 && income <= 1200000) {
            tax = (income * 0.15f);
        } else if (income > 1200000 && income <= 1500000) {
            tax = (income * 0.20f);
        } else if (income > 1500000) {
            tax = (income * 0.30f);
        } else {
            tax = 0;
        }
        System.out.println("tax: " + tax);
    }

    public static void b(int income) {
        float tax;
        if (income > 700000 && income <= 1000000) {
            tax = (income * 0.10f);
        } else if (income > 1000000 && income <= 1200000) {
            tax = (income * 0.15f);
        } else if (income > 1200000 && income <= 1500000) {
            tax = (income * 0.20f);
        } else if (income > 1500000) {
            tax = (income * 0.30f);
        } else {
            tax = 0;
        }
        System.out.println("\ntax: " + tax);
    }

    public static void c(int income) {
        float tax;
        if (income < 300000) {
            tax = 0;
        } else if (income > 300000 && income <= 600000) {
            tax = (income * 0.05f);
        } else if (income > 600001 && income <= 900000) {
            tax = (income * 0.10f);
        } else if (income > 900001 && income <= 1200000) {
            tax = (income * 0.15f);
        } else if (income > 1200001 && income <= 1500000) {
            tax = (income * 0.20f);
        } else if (income > 1500001) {
            tax = (income * 0.30f);
        } else {
            tax = 0;
        }
        System.out.println("\n tax: " + tax);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tax = 0.0f;
        int age, income;
        String panNo;
        String name;

        System.out.print("\n enter your name: ");
        name = scanner.nextLine();
        System.out.print("\n enter your pan card number: ");
        panNo = scanner.nextLine();
        System.out.print("\n enter age: ");
        age = scanner.nextInt();
        System.out.print("enter your annual income: ");
        income = scanner.nextInt();

        if (age < 60) {
            c(income);
        } else if (age >= 60 && age < 80) {
            if (income < 700000) {
                System.out.println("\ntax=0");
            } else {
                b(income);
            }
        } else if (age >= 80) {
            if (income < 1000000) {
                System.out.println("\n tax=0:");
            } else {
                a(income);
            }
        }

        System.out.println("\nname is: " + name);
        System.out.println("\nage is: " + age);
        System.out.println("\npan card number: " + panNo);

        scanner.close();
    }
}



