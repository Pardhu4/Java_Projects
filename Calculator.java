import java.util.Scanner;
class Calc{
    Scanner sc = new Scanner(System.in);
    
    void operations(double num1, double num2, String op, char choice){
    do{
    double add=0;
    double sub=0;
    double mul=0;
    double div=0;

        switch(op){
            case "+" : add= num1+num2; System.out.println(add);break;
            case "-" : sub= num1-num2;  System.out.println(sub);break;
            case "*" : mul= num1*num2; System.out.println(mul);break;
            case "/" : div= num1/num2; System.out.println(div);break;

            default:System.out.println("select a proper operator");
        }
        
        System.out.println("Want to use again? (y/n)");
        choice = sc.next().toLowerCase().charAt(0);
        if(choice=='N')
        break;
        
    }while(choice=='y');
    System.out.println("Thanks for using our calculator..");
}

}


class Calculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Calc key = new Calc();

    System.out.print("Enter first number:");
    double num1=sc.nextDouble();
    System.out.print("Enter second number:");
    double num2=sc.nextDouble();
    System.err.print("Select an operator :' + - * /' ");
    String op=sc.next();
    char choice='y';

    key.operations(num1,num2,op,choice);
    sc.close();
    }
    
    
}
