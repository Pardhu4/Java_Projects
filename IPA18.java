import java.util.*;
class IPA18{
    public static int searchAntennaByName(Anteena[] ant,String value){
        for(int i=0;i<ant.length;i++){
            if(ant[i].getAntennaName().equalsIgnoreCase(value)){
                return ant[i].getAntennaId();
            }
        }
        return 0;
    }
    public static Anteena[] sortAnteenaByVSWR(Anteena[] ant,double d){
        List<Anteena> list = new ArrayList<>();

        for (int i = 0; i < ant.length; i++) {
            if (ant[i].getAntennaVSWR() < d) {
                list.add(ant[i]);
            }
        }
        if (list.size() == 0)
            return null;

        // sort ascending by VSWR
        list.sort(Comparator.comparingDouble(Anteena::getAntennaVSWR));

        return list.toArray(new Anteena[0]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Anteena[] ant = new Anteena[4];
        for(int i=0;i<ant.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b= sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            ant[i]=new Anteena(a,b,c,d);
        }
        String pl=sc.nextLine();
        double d=sc.nextDouble();sc.nextLine();
        int ans1=searchAntennaByName(ant,pl);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There is no antenna with the given parameter");
        }

        Anteena[] ans2=sortAnteenaByVSWR(ant,d);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getProjectLead());
            }
        }
        System.out.println("No anteena found");
    }
}
class Anteena{
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    //Constructer
    public Anteena(int antennaId, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(int antennaId) {
        this.antennaId = antennaId;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }


}
/*
create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


searchAntennaByName :
---------------------------------------
This method will take an array of Antenna objects and the string value as input parameter.The method will find out Antenna name(String parameterpassed).
It will return Antennaid if found.if there is no Antenna that matches then the method will return zero.
The main method should print the antennaid,if the returned value is not 0.if the returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
--------------------------------------
This method will take an array of Antenna Objects and a double value as input.
This method will return an array of Antenna objects sorted in ascending orderof their antennaVSWR, which is less than VSWR(double value passed).

The main method should print name of the project leads from the returned array if the returned value is not null.if the returned value is null then main method
should print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found
 */