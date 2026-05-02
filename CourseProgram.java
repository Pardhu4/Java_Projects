import java.util.*;
class CourseProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        course[] course = new course[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b= sc.nextLine();
            String c= sc.nextLine();
            int d= sc.nextInt(); sc.nextLine();
            int e= sc.nextInt(); sc.nextLine();
            course[i]= new course(a,b,c,d,e);
        }
        String admin = sc.nextLine();
        int hand = sc.nextInt();
        int ans1 = findAvgOfQuizByAdmin(course, admin);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("No course found");
        }
        course[] ans2 = sortCourseByHandsOn(course, hand);
        if(ans2!=null)
        {
            for(int i=0; i<ans2.length; i++)
            {
                System.out.println(ans2[i].getcourseName());
            }
        }
        else
        {
            System.out.println("No Course found with mentioned attribute.");
        }


    }
    public static int findAvgOfQuizByAdmin(course[] course, String ad){
        int sum=0,count=0;
        for(int i=0;i<course.length;i++){
            if(course[i].getcourseAdmin().equalsIgnoreCase(ad)){
                sum= sum+course[i].getquiz();
                count++;
            }
        }
        if(count>0){
            int avg =sum/count;
            return avg;
        }
        else{
            return 0;
        }

    }
    public static course[] sortCourseByHandsOn(course[] course, int h){

        course[] obj = new course[0];
        for(int i=0; i<course.length; i++)
        {
            if(course[i].gethandson()<h)
            {
                obj = Arrays.copyOf(obj, obj.length+1);
                obj[obj.length-1] = course[i];
            }
        }
        course val;
        for(int i=0;i<obj.length;i++)
        {
            for(int j=i+1; j<obj.length; j++)
            {
                if(obj[i].gethandson()>obj[j].gethandson())
                {
                    val = obj[i];
                    obj[i] = obj[j];
                    obj[j] = val;
                }
            }
        }
        if(obj.length>0)
        {
            return obj;
        }
        else
        {
            return null;
        }
    }
}

class course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;
    int getcourseId(){
        return this.courseId;
    }
    String getcourseName(){
        return this.courseName;
    }
    String getcourseAdmin(){
        return this.courseAdmin;
    }
    int getquiz(){
        return this.quiz;
    }
    int gethandson(){
        return this.handson;
    }
    course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseAdmin=courseAdmin;
        this.quiz=quiz;
        this.handson=handson;
    }
}


