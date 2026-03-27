package Arrays;

import java.util.Scanner;

/*  Min and Max Number in Array.
    Linear Search Method.
    Time Complexity is O(n).
*/
public class MinMaxSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = inputNumbers(sc);
        int min = minNumber(numbers);
        int max = maxNumber(numbers);
        System.out.printf("Minimum Number is %d and Maximum Number is %d",min,max);
    }

    public static int[] inputNumbers(Scanner sc){
        int[] numbers;
        System.out.print("How Many Number You want to Enter : ");
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Please Enter valid Values.");
            System.exit(0);
        }
        numbers= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("Enter Value of %d Number : ",i+1);
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static int minNumber(int[] numbers){
        int number = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < number){
                number = numbers[i];
            }
        }
        return number;
    }
    public static int maxNumber(int[] numbers){
        int number = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > number){
                number = numbers[i];
            }
        }
        return number;
    }

}
