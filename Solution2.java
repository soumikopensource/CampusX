import java.util.Scanner;

public class Solution2 {


    static int sumReturn(int n){

        int sum=0;
        int[] arr=new int[20];
        int i=0;
        while(n!=0){
            int rem=n%10;
            arr[i]=rem;
            i++;
            n/=10;
        }
       for(int k:arr){
           sum+=k;
       }
        return sum;
    }


    static int calCount(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;

        }
        return count;

    }



    //Driver code
    public static void main(String[] args) {
        int x;
        int n;
        int count;
        Scanner sc=new Scanner(System.in);

        x= sc.nextInt();
        n=sc.nextInt();

        String number=Integer.toString(x);
        String output="";
        for(int i=0;i<n;i++){
            output+=number;

        }
        int op=Integer.parseInt(output);
        int result=sumReturn(op);
        count=calCount(result);
        if(count==1){
            System.out.println(result);
        }
        while(count>1){
            result=sumReturn(result);
            if(calCount(result)>1){
                result=sumReturn(result);
            }
            count-=1;

        }


        System.out.println(result);



    }
}
