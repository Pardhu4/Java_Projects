import java.util.*;
class QuizProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("****************************************");
        System.out.println("***Welcome to the \"Ultimate Quiz\"***");
        System.out.println("****************************************");
        System.out.println("");
        String[] questions ={"1.Who invented Java Programming?",
        "2.Which statement is true about Java?",
        "3.Which component is used to compile, debug and execute the java programs?",
        "4.Which one of the following is not a Java feature?"};
        String [][] options ={{"a) Guido van Rossum ","b) James Gosling"," c) Dennis Ritchie" ,"d) Bjarne Stroustrup"},
        {"a) Java is a sequence-dependent programming language"," b) Java is a code dependent programming language"," c) Java is a platform-dependent programming language " ,"d) Java is a platform-independent programming language"},
        {" a) JRE", "b) JIT"," c) JDK"," d) JVM"},
        {"a) Object-oriented"," b) Use of pointers"," c) Portable"," d) Dynamic and Extensible"}};
        char answers[]={'b','d','c','b'};
        char[] guess= new char[4];
        int score =0;
            for( int i =0;i<options.length;i++){
                System.out.println(questions[i]);
                for(int j =0;j<options.length;j++){
                    System.out.println(options[i][j]);
                    
            }
            while(true){
                System.out.println("Select an option:");
                    guess[i] = sc.next().toLowerCase().charAt(0);
                    if(guess[i]== 'a'|| guess [i]=='b'||guess[i]== 'c'||guess[i]== 'd')
                    break;
                    else
                    System.out.println("Choose only from 'a,b,c,d'");
            }
                    
        }
        for(int i =0;i<guess.length;i++){
            if(guess[i]==answers[i])
            score++;
        }
        if(score<2)
        System.out.println("********** You have failed **********");
        else if(score==2)
        System.out.println("********** You have passed **********");
        else
        System.out.println("**********You are a top scorrer in the test  **********");
        
        System.out.println("The final score is: "+score+" out of 4");
        
        sc.close();
    }
}