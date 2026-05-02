import java.util.*;
class IPA19{
    public static Flowers findMinPriceByType(Flowers[] f,String str1){
        Flowers min = null;
        for(int i=0;i<f.length;i++){
            if(f[i].getType().equalsIgnoreCase(str1)&&f[i].getRating()>3){
                if(min==null||f[i].getPrice()< min.getPrice()){
                    min=f[i];
                }
            }
        }
        return min;


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Flowers[] f= new Flowers[4];
        for(int i=0;i<f.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            String e=sc.nextLine();
            f[i]=new Flowers(a,b,c,d,e);
        }
        String str1=sc.nextLine();
        Flowers f1=findMinPriceByType(f,str1);
        if(f1!=null){
            System.out.println(f1.getFlowerId());
        }
        else
            System.out.println("There is no flower with given type");
    }
}
class Flowers{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    //Constructor
    Flowers(int flowerId,String flowerName,int price,int rating,String type){
        this.flowerId=flowerId;
        this.flowerName=flowerName;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }

    //Setters
    void setFlowerId(int flowerId){
        this.flowerId=flowerId;
    }
    void setFlowerName(String flowerName){
        this.flowerName=flowerName;
    }
    void setPrice(int price){
        this.price=price;
    }
    void setRating(int rating){
        this.rating=rating;
    }
    void setType(String type){
        this.type=type;
    }

    //Getters
    int getFlowerId(){
        return flowerId;
    }
    String getFlowerName(){
        return flowerName;
    }
    int getPrice(){
        return price;
    }
    int getRating(){
        return rating;
    }
    String getType(){
        return type;
    }
}
/*
Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals



output:

213
 */