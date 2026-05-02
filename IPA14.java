import java.util.*;
public class IPA14 {
    public static String[] getMovieByGenre(Movie[] mov,String searchGenre){
        String[] arr = new String[0];
        for(int i=0;i<mov.length;i++){
            if(mov[i].getGenre().equalsIgnoreCase(searchGenre)){
                if(mov[i].getBudget()>80000000){
                    arr=Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1]="High Budget Movie";
                }
                else{
                    arr=Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1]="Low Budget Movie";
                }
            }
        }

        return arr;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] m = new Movie[4];
        for(int i=0;i<m.length;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            m[i]=new Movie(a,b,c,d);
        }
        String search=sc.nextLine();
        String[] ans1=getMovieByGenre(m,search);
        for(int i=0;i< ans1.length;i++){
            System.out.println(ans1[i]);
        }
    }
}

class Movie{
    //Attributes
     String movieName;
     String company;
     String genre;
     int budget;

     //Constructor
     Movie(String movieName,String company,String genre,int budget){
         this.movieName=movieName;
         this.company=company;
         this.genre=genre;
         this.budget=budget;
     }
     //Getters
     String getMovieName(){
         return movieName;
     }
     String getCompany(){
         return company;
     }
     String getGenre(){
         return genre;
     }
     int getBudget(){
         return budget;
     }

     //Setters
    void setMovieName(String movieName){
         this.movieName=movieName;
    }
    void setCompany(String company){
         this.company=company;
    }
    void setGenre(String genre){
         this.genre=genre;
    }
    void setBudget(int budget){
         this.budget=budget;
    }

}

/*
Create class Movie with below attributes:

movieName - String
company - String
genre - String
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie
objects where the searchGenre String matches with the original array of Movie object's genre attribute
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie
 */