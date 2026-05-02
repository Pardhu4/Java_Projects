import java.util.*;
class LargestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence:");
        String str = sc.nextLine();
        String[] arr=str.trim().split("\\s+");
        int high=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            int length=arr[i].length();
            System.out.println(arr[i]+":"+length);
            if(arr[i].length()>high){
                high=arr[i].length();
                index=i;
            }
        }
        System.out.println("The longest word is '"+arr[index]+"' with a lenth of: "+high);
    }
}