import java.util.*;
class ThreeRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range min:");
        int min=sc.nextInt();
        System.out.print("Enter range max:");
        int max=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=min;i<=max;i++){
            if(i%3==0&&i%2==0){
                System.out.println(i);
                count++;
                sum+=i;

            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Count: "+count);
    }
}