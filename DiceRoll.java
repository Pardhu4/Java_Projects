import java.util.*;
class DiceRoll{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("********************");
        System.out.println("Welcome to die roll");
        System.out.println("********************");        
        System.out.print("Enter number of die to roll:");
        int number = sc.nextInt();
        int total=0;
        if(number>0){
            for(int i=0;i<number;i++){
                int roll= rand.nextInt(1,7);
                Die(roll);
                System.out.println("You rolled "+roll);
                total+=roll;
        }
                System.out.println("Total sum of die roll is: "+total);
        }

        else{
            System.out.println("Can not roll "+number+" dies");

        }
    
            sc.close();

    }
    static void Die(int roll){
        String die1 ="""
                -------------
                |           |
                |           |
                |    ●      |
                |           |
                |           |
                -------------

                """;

        String die2 ="""
                -------------
                | ●         |
                |           |
                |           |
                |           |
                |        ●  |
                -------------

                """;

        String die3 ="""
                -------------
                | ●         |
                |           |
                |    ●      |
                |           |
                |        ●  |
                -------------

                """;

        String die4 ="""
                -------------
                | ●      ●  |
                |           |
                |           |
                |           |
                | ●      ●  |
                -------------

                """;
                
        String die5 ="""
                -------------
                | ●      ●  |
                |           |
                |     ●     |
                |           |
                | ●      ●  |
                -------------

                """;

        String die6 ="""
                -------------
                | ●      ●  |
                |           |
                | ●      ●  |
                |           |
                | ●      ●  |
                -------------

                """;

        switch(roll){
            case 1:
            System.out.print(die1);break;

            case 2:
            System.out.print(die2);break;

            case 3:
            System.out.print(die3);break;

            case 4:
            System.out.print(die4);break;

            case 5:
            System.out.print(die5);break;

            case 6:
            System.out.print(die6);break;

            default:
                System.out.print("Invalid roll");
        }
        
    }
}