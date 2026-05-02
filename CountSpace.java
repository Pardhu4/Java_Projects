import java.util.*;
class CountSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence:");
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        if(count>=3){
            System.out.println(count);
        }
        else{
            System.out.println("NAN");
        }

    }
}