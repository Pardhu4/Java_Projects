import java.util.*;
class RockPaperScissors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char yesOrNo;
        String[] items ={"rock","paper","scissors"};
        String playerChoice;
        do{
        
        while(true){
        System.out.println("Enter your choice: Rock Paper Scissors");
        playerChoice=sc.nextLine().toLowerCase();
        if(playerChoice.equals("rock")||playerChoice.equals("paper")||playerChoice.equals("scissors")) 
        break;
        else {System.out.println("Enter the choice correctly");}
        }

        

        int  computerIndex = r.nextInt(items.length);
        String computerChoice = items[computerIndex];
        System.out.println(computerChoice);
        
        switch(playerChoice){
            case "rock":
            if(computerChoice.equals("paper")){
            System.out.println("You loose");}
            else if(computerChoice.equals("rock")){
            System.out.println("Its a draw");}
            else{
            System.out.println("You Win");}
            break;
            case "paper":
            if(computerChoice.equals("paper"))
            System.out.println("Its a draw");
            else if(computerChoice.equals("rock"))
            System.out.println("You win");
            else
            System.out.println("You loose");
            break;
            case "scissors":
            if(computerChoice.equals("paper"))
            System.out.println("You Win");
            else if(computerChoice.equals("rock"))
            System.out.println("You loose");
            else
            System.out.println("Its a draw");
            break;
            
        }
        System.out.println("Want to play again? Y/N");
        yesOrNo=sc.next().toLowerCase().charAt(0);
        sc.nextLine();
        if(yesOrNo=='N'||yesOrNo=='n')
        break;
        
    }
    while(yesOrNo=='Y'|| yesOrNo=='y');
        sc.close();
        
    }
}