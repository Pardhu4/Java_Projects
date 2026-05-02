import java.util.*;
class Words_Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String str = sc.nextLine();
        String[] countWords=str.trim().split("\\s+");
        int count = countWords.length;
        System.out.println(count);
    }
}