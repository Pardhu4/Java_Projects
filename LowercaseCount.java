import java.util.*;
class LowerCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        char[] arr= string.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isLowerCase(arr[i])){
                count++;
            }
        }
        System.out.println("The number of lower cases in the string "+ string+" are "+count);

    }
}