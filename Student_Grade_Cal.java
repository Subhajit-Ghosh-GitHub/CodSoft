import java.util.*;

public class Student_Grade_Cal {
    static int summofarr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Subject No:--");
        int n = sc.nextInt();

        int[] marks = inputMarks_sum(sc, n);
      
        float avg = (float) summofarr / n; // Correctly calculate average

        // Display results based on average
        if (avg >= 90) {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("Your grade is: O");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("Your grade is: E");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("Your grade is: A+");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("Your grade is: A");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("Your grade is: B");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("Your grade is: C");
        } else {
            System.out.println("Your total score: " + summofarr);
            System.out.println("Average percentage: " + avg+" %");
            System.out.println("You failed in Exam....!!!");
        }

        System.out.println("'O' for Outstanding Result\n'E' for Excellent Result\n'A+' for Very Good Result\n'A' for Good Result\n'B' for Satisfactory Result\n'C' for Bad Result");
        sc.close();
    }

    // Method to input the marks and sum of them
    public static int[] inputMarks_sum (Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your " + (i + 1) + " subject marks out of 100:");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum=sum+arr[i];
        }
        summofarr=sum;
        return arr;
    }

    
}
