import java.util.*;
class IPA22{
    //Method1
    public static Associate[] associatesForGivenTechnology(Associate[] arr,String str){
        ArrayList<Associate>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTechnology().equalsIgnoreCase(str)&&arr[i].getExperienceInYears()%5==0){
                list.add(arr[i]);
            }
        }
        if(!list.isEmpty()){
            return list.toArray(list.toArray(new Associate[0]));
        }
        else
            return null;

    }

    //Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Associate[] asso=new Associate[5];
        for(int i=0;i<asso.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            asso[i]= new Associate(a,b,c,d);
        }
        String str=sc.nextLine();
        Associate[] ans1=associatesForGivenTechnology(asso,str);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getId());
            }
        }
        else{
            System.out.println("Wrong code");
        }
    }
}
class Associate{
    int id;
    String name;
    String technology;
    int experienceInYears;

    //Constructor

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    //Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}