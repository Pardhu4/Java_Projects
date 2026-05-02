import java.util.*;
class LastLetter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String str = sc.nextLine();
        String[] words=str.trim().split("\\s+");
        for(int i=0;i< words.length;i++){
            System.out.print(words[i].charAt(words[i].length()-1));
        }

    }
}