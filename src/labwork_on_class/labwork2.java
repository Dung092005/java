package labwork_on_class;
import java.util.Scanner;
class Vector{
    private double x;
    private double y;
 
 
    public void setvector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Vector add(Vector v){
        Vector vec = new Vector();
        vec.setvector(this.x+v.x, this.y+v.y);
        return vec;   
    }
    public Vector subtract(Vector v){
        Vector vec = new Vector();
        vec.setvector(this.x -v.x, this.y - v.y);
        return vec;
    }
    public Vector multiply(Vector v){
        Vector vec = new Vector();
        vec.setvector(this.x*v.x, this.y*v.y);
        return vec;
    }
    void output(){
        System.out.println("(" + x +"," + y +")"); 
    }

}
class motobike{
    double fuel;
    double speed;
    String license;
    motobike(double fuel, double speed, String license){
        this.fuel = fuel;
        this.speed = speed;
        this.license = license;
    } 
    public void setmoto(double fuel, double speed, String license){
        this.fuel = fuel;
        this.speed = speed;
        this.license = license;
    }
    public void accelerate(double d){
        this.speed += d;
    }
    public void deccelerate(double d){
        this.speed -= d;
        if(this.speed ==0){
            this.speed = 0; 
        }
    }

    public void display(){
        System.out.println ("fuel : "+fuel);
        System.out.println ("speed : " + speed);
        System.out.println ("license : "+ license);
    }

}
class car{
    private String manufacturer;
    private String model;
    private float pro_expen;
    private int pro_time;
    private int wheel_num;
    car(String manufacturer, String model, float pro_expen, int pro_time, int wheel_num){
        this.manufacturer = manufacturer;
        this.model = model;
        this.pro_expen = pro_expen;
        this.pro_time = pro_time;
        this.wheel_num = wheel_num;

    }
    public void setcar(String manufacturer, String model, float pro_expen, int pro_time, int wheel_num){
        this.manufacturer = manufacturer;
        this.model = model;
        this.pro_expen = pro_expen;
        this.pro_time = pro_time;
        this.wheel_num = wheel_num;

    }
    public float price(){
        return 2*pro_expen*(float)Math.sqrt(pro_time);
    }
    public void print() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Production Expense: " + pro_expen);
        System.out.println("Production Time: " + pro_time);
        System.out.println("Wheel Number: " + wheel_num);
        System.out.println("Selling Price: " + price());
        System.out.println("---------------------------");
    }
}
public class labwork2{
    public static void main(String[] args){
        // ex 1 
        // Vector v1 = new Vector();
        // v1.setvector(10,20);
        // Vector v2 = new Vector();
        // v2.setvector(20,30);
        // Vector sum =v1.add(v2);
        // sum.output();
        // Vector sub = v1.subtract(v2);
        // sub.output();
        // Vector mul = v1.multiply(v2);
        // mul.output();
        // ex 2
        // motobike m = new motobike(232,323 , "addda");
        // System.out.println("HERE IS THIS INFO : ");
        // m.display();
        // m.accelerate(20);
        // m.display();
        // m.deccelerate(40);
        // m.display();
        //ex3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        car[] cars = new car[n];
        sc.nextLine();
        for(int i = 0; i<n; i++){
            System.out.println("Enter infor for new car: " + (i+1));
            String manufacturer = sc.nextLine();
            sc.nextLine();

            System.out.println("Model: ");
            String model = sc.nextLine();

            System.out.println("pro_expen");
            float pro_expen = sc.nextFloat();

            System.out.println("pro_time");
            int pro_time = sc.nextInt();

            System.out.print("Wheel Number: ");
            int wheels = sc.nextInt();

            cars[i] = new car(manufacturer,model,pro_expen,pro_time,wheels);

            
            
        }
        for(int i = 0; i< n; i++ ){
            cars[i].print();
        }
        sc.close();
        
        }





        }






