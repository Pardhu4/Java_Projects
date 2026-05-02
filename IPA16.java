import java.util.*;
class IPA16{
    public static int findAvgVoyagesByPct(NavalVessel[] n,int percentage){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            int pct = (n[i].getNoOfVoyagesCompleted() * 100) / n[i].getNoOfVoyagesPlanned();

            if (pct >= percentage) {
                sum += n[i].getNoOfVoyagesCompleted();
                count++;
            }
        }
        if (count > 0)
            return sum / count;
        else
            return 0;
    }
    public static String findVesselByGrade(String p,NavalVessel[] n){
        for (int i = 0; i < n.length; i++) {

            if (n[i].getPurpose().equalsIgnoreCase(p)) {

                int pct = (n[i].getNoOfVoyagesCompleted() * 100) / n[i].getNoOfVoyagesPlanned();
                String grade;

                if (pct == 100)
                    grade = "Star";
                else if (pct >= 80)
                    grade = "Leader";
                else if (pct >= 55)
                    grade = "Inspirer";
                else
                    grade = "Striver";

                return n[i].getVesselName() + "%" + grade;
            }
        }

        return null;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NavalVessel[] n= new NavalVessel[4];
        for(int i=0;i<n.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            String e=sc.nextLine();
            n[i]= new NavalVessel(a,b,c,d,e);
        }
        int v= sc.nextInt();sc.nextLine();
        String p=sc.nextLine();

        int ans1=findAvgVoyagesByPct(n,v);
        System.out.println(ans1);
        String ans2=findVesselByGrade(p,n);
        if(ans2==null){
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        else
            System.out.println(ans2);
    }
}
class NavalVessel{
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;

    //Constructor
    NavalVessel(int vesselId,String vesselName,int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose){
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.purpose=purpose;
    }

    //Getters
    int getVesselId(){
        return vesselId;
    }
    String getVesselName(){
        return vesselName;
    }
    int getNoOfVoyagesPlanned(){
        return noOfVoyagesPlanned;
    }
    int getNoOfVoyagesCompleted(){
        return noOfVoyagesCompleted;
    }
    String getPurpose(){
        return purpose;
    }

    //Setters
    void setVesselId(int vesselId){
        this.vesselId=vesselId;
    }
    void setVesselName(String vesselName){
        this.vesselName=vesselName;
    }
    void setNoOfVoyagesPlanned(int noOfVoyagesPlanned){
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
    }
    void setNoOfVoyagesCompleted(int noOfVoyagesCompleted){
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
    }
    void setPurpose(String purpose){
        this.purpose=purpose;
    }
}

/*
Create a class NavalVessel with the below attributes:

vesselId – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String


Write getters, setters for the above attributes. Create constructor which takes parameter in the above
sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade
in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will
return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement
as mentioned below.The percentage for each navalVessel is calculated as
percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal
to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are
no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the
NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before
returning the object, the classification should be derived as mentioned below. This classification value should be assigned
to the object before returning. If any of the above conditions are not met, then the method should return null. The
classification attribute should be calculated based on the percentage calculation mentioned above.
If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should
be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer' otherwise the classification should
be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring
attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for
percentage and purpose.

Input
-------------------
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output
------------------
300
Yashwin%Inspirer
 */