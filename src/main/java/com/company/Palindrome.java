package main.java.com.company;
import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {
        Palindrome.checkPalindrome();

    }

    private static void checkPalindrome() {


    double rem, sum = 0, tem, res = 0;

        System.out.println("Enter any number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        tem = num;

        while (tem > 0)
        {
            rem = tem % 10;
            res = (res * 10) + rem;
            tem = tem / 10;
        }

        if (num == res)
        {
            System.out.println("num is com.company.Palindrome");

            while (num > 0)
            {
                rem = num % 10;
                    if (rem%2 == 0)
                    {
                    sum = sum + rem;
                    }
                    num=num / 10;
            }
            if(sum > 25)
            {
                System.out.println("and the sum of even numbers is greater than 25 " +sum);
            }
            else
                {
                System.out.println("and the sum of even numbers is less than 25 " +sum);
                }
        }
        else{
                System.out.println("num is not com.company.Palindrome");
            }
    }
}