import java.util.*;
class evenDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        int count =0;
        int n=number;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                count++;
            }
            n=n/10;
        }
        if(count>2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}