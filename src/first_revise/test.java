package first_revise;
import java.util.Scanner;
class coolingDevice{
    private int power;
    private String brand;
    coolingDevice(int power,String brand){
        this.power = power;
        this.brand = brand;
    }
    public int gerPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    void cool(){
        System.out.println("Starting to cooling .. ");

    }
    void printInfo(){
        System.out.println("the power is " + this.power);
        System.out.println("the brand is " + this.brand);
    }

 
}
class airCondition extends coolingDevice{
    private boolean inverter;
    airCondition(int power,String brand,boolean inverter){
        super(power,brand);
        this.inverter = inverter;
    }

    public boolean isInverter() {
        return inverter;
    }

    public void setInverter(boolean inverter) {
        this.inverter = inverter;
    }
    void dry(){
        System.out.println("dry model is starting ");
        
    }   
    void fanonly(){
        System.out.println("just only fans ");
    }     
    @Override
    void printInfo(){
        System.out.println("Show Air condition");
        super.printInfo();
        System.out.println("the inverter is : " + inverter);
    }
}
class fan extends coolingDevice{
    private int speed;
    fan(int power, String brand, int speed){
        super(power,brand);
        this.speed = speed;
    }
    void swing(){
        System.out.println("Swing model is start");

    }
     @Override
    void printInfo(){
        System.out.println("Show fan");
        super.printInfo();
        System.out.println("the Speed is : " + speed);
    }
}

public class test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n is : ");
        int n = sc.nextInt();
        sc.nextLine();
        airCondition[] airCondition = new airCondition[n];

        System.out.print("m is : ");
        int m = sc.nextInt();
        sc.nextLine();
        fan[] fan = new fan[m];

        for(int i = 0; i < n; i++){
            System.out.println("input " + (i+1));
            System.out.print("input power :  ");
            int power = sc.nextInt();
            sc.nextLine();
            System.out.print("input brand : ");
            String brand = sc.nextLine();
            System.out.print("input inverter : ");
            boolean inverter = sc.nextBoolean();
            sc.nextLine();
            airCondition[i] = new airCondition(power, brand, inverter);
        }

        for(int i = 0; i < m; i++){
            System.out.println("input " + (i+1));
            System.out.print("input power :  ");
            int power = sc.nextInt();
            sc.nextLine();
            System.out.print("input brand : ");
            String brand = sc.nextLine();
            System.out.print("input speed : ");
            int speed = sc.nextInt();
            fan[i] = new fan(power, brand, speed);
        }
        
        // print info 
        for(airCondition air : airCondition){
            air.printInfo();
        }
        System.out.println("---------------------");
        for(fan f : fan){
            f.printInfo();
        }
         for(airCondition air : airCondition){
            air.dry();
        }
        for(fan f : fan){
            f.swing();
        }
        
    }
}
