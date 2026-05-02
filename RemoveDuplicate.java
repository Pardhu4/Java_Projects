import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            if(result.toLowerCase().indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}