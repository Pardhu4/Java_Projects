import java.util.Scanner;
import java.util.Random;
class SlotMachine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        float balance =1000;
        float bet;
        String[] slots={"✌️","🤡","🍍"};
        String resultSlot[]= new String [3];
        char playerChoice = 'Y';
        System.out.println("********************************");
        System.out.println("Welcome to the java Slot Machine");
        System.out.println("********************************");
        do{
            System.out.println("Current balance: "+balance);
            while(true){
            System.out.print("Enter the bet amount:");
            bet = sc.nextFloat();
            if(bet<0 || bet>balance)
            System.out.println("Enter vaild bet");
            else
            break;
            }
            System.out.println("Spinning.....");
            for(int i =0;i<3;i++){
                resultSlot[i]=slots[rand.nextInt(slots.length)];
                System.out.print(resultSlot[i]+" ");
            }
            System.out.println();
                if(resultSlot[0].equals(resultSlot[1])&& resultSlot[1].equals(resultSlot[2])){
                System.out.println("You won $200");
                balance+=200;
                }
                else {
                System.out.println("You lost");
                balance -=bet; 
                }
                if (balance <= 0) {
                System.out.println("Game over! You ran out of money!");
                break;
                }
            System.out.println("Want to bet again? Y/N");
            playerChoice =sc.next().charAt(0);
        
        } while(playerChoice == 'Y' || playerChoice == 'y');
        System.err.println("Your final balance is:$ "+balance);
        sc.close();
    
    }
    
}
