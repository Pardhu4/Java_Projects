import java.sql.SQLOutput;
import java.util.*;
class ReverseStringFull{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= sc.nextLine();
        String[] words=str.trim().split("\\s+");
        for(int i= words.length-1;i>=0;i--){
            for(int j=words[i].length()-1;j>=0;j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}