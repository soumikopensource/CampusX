import java.util.Scanner;

public class Solution {


    static int count=0;

    static int numberCount(int number,int power) {


        if (number == 0) {
            return count;

        } else {
            count++;

            numberCount(number / power, power);


        }


        return (count/power);
    }






    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();


        System.out.println(numberCount(x,n));





    }
}
