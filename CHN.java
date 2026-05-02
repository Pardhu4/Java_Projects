import java.util.*;
class CHN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=sc.nextLine().toLowerCase();
        if(str.startsWith("chn")){
            for(int i=str.length()-1;i>=3;i--){
                System.out.print(str.charAt(i));
            }
        }

    }
}