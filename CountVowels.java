import java.util.*;
class CountVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c1=0,c2=0,c3=0;
        System.out.print("Enter a String:");
        String str=sc.nextLine().toLowerCase().trim();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    c1++;
                }
                else{
                    c2++;
                }
            }
            else if(Character.isDigit(ch)){
                c3++;
            }
        }
        System.out.println("Vowels "+c1);
        System.out.println("Consonants: "+c2);
        System.out.println("Digits: "+c3);
    }
}