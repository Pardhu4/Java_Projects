import java.util.*;
class BankingSystem{
        static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("*******************");
        System.out.println("Welcome to the bank");
        System.out.println("*******************");
        int choice =0;
        double balance =0;

        while(true){
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Select an option from above (1-4): ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("your balance= "+balance+"$");
            break;
            case 2:
            balance += deposit();
            break;
            case 3:
            balance -=withdraw(balance);
            break;
            case 4:
            System.out.println("thanks for using our bank");
            break;
            default :
            System.out.println("Enter a valid choice");
        }
        if(choice==4)
        break;
    }

}



    static double balance(double balance){
        System.out.println("Your balance is :"+balance);
        return balance;
    }
    static double deposit(){
        System.out.println("Enter amount to deposit");
        double deposit = sc.nextDouble();
        if(deposit<0){
            System.out.println("You cant deposit negative amount..");
            return 0;
        }
        else{
        return deposit;
        }
            
    }
    static double withdraw(double balance){
        System.out.println("Enter amount to withdraw");
        double withdraw= sc.nextDouble();
        if(withdraw>balance){
            System.out.println("Insufficent balance");
            return 0;
        }
        else if(withdraw<0){
            System.out.println("You can not withdraw negative amount");
            return 0;
        }
        else{
        return withdraw;
        }
    }

}