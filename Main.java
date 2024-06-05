import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] factor1 = new int[10];
        int[] factor2 = new int[10];
        int[] product = new int[10];
        int[] check = new int[10];
        int correct = 0;
        int incorrect = 0;
        System.out.println("Let's practice your multiplication facts!");
        for (int i = 0; i < 10; i++) {
            factor1[i] = (int) (Math.random() *15 + 1);
            factor2[i] = (int) (Math.random() *15 + 1);
            product[i] = factor1[i] * factor2[i];
            System.out.print(factor1[i] + " * " + factor2[i] + " =");
            int num = input.nextInt();
            if (num == product[i]) {
                check[i] = 1;
                correct++;
            } else {
                check[i] = 0;
                incorrect++;
            }
        }
        if (incorrect == 0) {
            System.out.println("Congrats, you got " + correct + " out of 10 problems correct. ");
        } else {
            System.out.println("Congrats, you got " + correct + " out of 10 problems correct. ");
            System.out.println("Here are the problems you missed. Please try again.");
            for (int k = 0; k < 10; k++) {
                if (check[k] == 0) {
                    System.out.print(factor1[k] + " * " + factor2[k] + " =");
                    int num = input.nextInt();
                    if (num == product[k]) {
                        check[k] = 1;
                        correct++;
                    } else {
                        check[k] = 0;
                        incorrect++;
                    }
                }
            }
        }
        if  (incorrect == 0) {
            System.out.print("Congrats, you got " + correct + " out of 10 problems correct. ");
        } else {
            System.out.println("Congrats, you got " + correct + " out of 10 problems correct. ");
            System.out.print("I'm sure you will do better next time!");
        }
    }
}