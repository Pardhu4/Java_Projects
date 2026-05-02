import java.util.*;

class IPA10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] arr=new Employee[4];
        for(int i=0;i<arr.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            boolean e=sc.nextBoolean();sc.nextLine();

            arr[i]=new Employee(a,b,c,d,e);
        }
        String branch=sc.nextLine();
        int ans1 = findCountOfEmployeesUsingCompTransport(arr,branch);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("No such Employees");
        }

        //2nd method
        Employee[] ans2 = {findEmployeeWithSecondHighestRating(arr)};
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getEmployeeId());
                System.out.println(ans2[i].getName());
            }
        }
        else
        {
            System.out.println("All Employees using company transport");
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee[] arr,String b){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i].getBranch().equalsIgnoreCase(b) && arr[i].getcompanyTransport()==true){
                count++;
            }

        }
        if(count>0){
            return count;
        }
        else{
            return 0;
        }

    }
    public static Employee  findEmployeeWithSecondHighestRating(Employee[] arr){
        Employee first =null;
        Employee second=null;
        for(int i=0;i< arr.length;i++){
            if(arr[i].getcompanyTransport()==false){
                if(first==null|| arr[i].getRating()>first.getRating()){
                    second=first;
                    first=arr[i];
                } else if ((second == null || arr[i].getRating() > second.getRating())
                        && arr[i].getRating() != first.getRating()) {
                    second=arr[i];
                }
            }
        }
        if(second!=null){
            return second;
        }
        else{
            return null;
        }
    }



    }









class Employee{

    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    Employee(int employeeId,String name, String branch, double rating, boolean companyTransport){
        this.employeeId=employeeId;
        this.name=name;
        this.branch=branch;
        this.rating=rating;
        this.companyTransport=companyTransport;
    }


    int getEmployeeId(){
        return employeeId;
    }
    String getName(){
        return name;
    }
    String getBranch(){
        return branch;
    }
    double getRating(){
        return rating;
    }
    boolean getcompanyTransport(){
        return companyTransport;
    }


    void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    void setName(String name){
        this.name=name;
    }
    void setBranch(String branch){
        this.branch=branch;
    }
    void setRating(double rating){
        this.rating=rating;
    }
    void setCompanyTransport(boolean companyTransport){
        this.companyTransport=companyTransport;
    }





}