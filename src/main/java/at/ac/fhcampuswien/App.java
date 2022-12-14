package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.print("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`" + System.lineSeparator()
);
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner( System.in);
        //System.out.print("Bitte gib zwei ganze Zahlen ein:\n");
        int count1 = scan.nextInt();
        int count2 = scan.nextInt();
        int sum = count1 + count2;
        System.out.print(sum + System.lineSeparator());
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.print("Before Swap:" + System.lineSeparator() + "x:" + " y: ");
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.print("After Swap:" + System.lineSeparator() +  "x: " + x + System.lineSeparator() +
                "y: " + y + System.lineSeparator());

    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x - y < 0) {
            //boolean b = x - y > 0;
            System.out.print("n1: n2: n2 > n1"+ System.lineSeparator());
        }
        else if (x - y > 0) {
            System.out.print("n1: n2: n1 > n2"+ System.lineSeparator());
        }
        else {
            System.out.print("n1: n2: n1 == n2"+ System.lineSeparator());
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int x = s.nextInt();

        if (x >= 0 && x < 20000)
        {
            System.out.println("Poor Sales Revenue");
        } else if (x >= 20000 && x < 50000)
        {
            System.out.println("Average Sales Revenue");
        } else if (x >= 50000 && x < 80000)
        {
            System.out.println("Good Sales Revenue");
        } else if (x >= 80000 && x < 100000)
        {
            System.out.println("Excellent Sales Revenue");
        } else {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int x = s.nextInt();

        switch (x) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
        public void leapyear() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int x = scan.nextInt();

        if ((x % 4 == 0) && x % 100 != 0)
        {
            System.out.print("Leapyear" + System.lineSeparator());
        }
        else if ((x % 4 == 0) && (x % 100 == 0) && (x % 400 == 0))
        {
            System.out.print("Leapyear" + System.lineSeparator());
        }
        else
        {
            System.out.print("Not a Leapyear" + System.lineSeparator());
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int x = scan.nextInt();
        int y = 0;

        while (x != 0)
        {
            int z = x % 10;
            y = y * 10 + z;
            x = x/10;
        }
        System.out.println(y);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}