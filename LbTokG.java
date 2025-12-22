import java.util.*;

class LbTokG{
    Scanner sc = new Scanner(System.in);

    void converter(){
    System.out.println("Enter weight in LBS");
    double weight = sc.nextFloat();
    double convertedWeight = 0.453592*weight; 
    System.out.println(weight+" in kgs is"+convertedWeight);
    }
}
class kGToLb{
    Scanner sc = new Scanner(System.in);

    void converter(){
    System.out.println("Enter weight in kG");
    double weight = sc.nextFloat();
    double convertedWeight = 2.20462*weight; 
    System.out.println(weight+" in Lbs is"+convertedWeight);
    }
}
class WeightConverter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char choice ='Y';
do{
LbTokG convert = new LbTokG();
kGToLb convert1 = new kGToLb();

System.out.println("1. LB to Kg");
System.out.println("2. KG to LB");

System.out.print("Choose one option from above (1/2): ");
int option  = sc.nextInt();
sc.nextLine();

if(option==1){
convert.converter();
}
else if(option==2){
convert1.converter();
}
else{
    System.out.println("select a valid choice");
}

System.out.println("Want to use again? (Y/N)");
choice=sc.next().toLowerCase().charAt(0);
if(choice =='n'){
break;
}
else{
continue;
}
} while(choice=='y');
System.out.println("Thankyou for using our calculator...");
sc.close();

}

}