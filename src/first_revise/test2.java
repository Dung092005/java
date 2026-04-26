package first_revise;
import java.io.*;
import java.util.Scanner;
class car{
    private String brand;
    private String name;
    private int horsepower;
    private int price;
    car(String brand, String name, int horsepower, int price){
        this.brand = brand;
        this.name = name;
        this.horsepower = horsepower;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }
    public int getHorsepower() {
        return horsepower;
    }
    public int getPrice() {
        return price;
    }
    String toLine(){
        return this.brand + " , " + this.name + "," + this.horsepower + " , " + this.price;
    }
    
}


public class test2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        car[] car = new car[n];
        for(int i = 0 ; i< n ; i++){
            System.out.println("Input data of car repectively " + (i+1));
            String brand = sc.nextLine();
            String name = sc.nextLine();
            int horsepower = sc.nextInt();
            sc.nextLine();
            int price = sc.nextInt();
            car[i] = new car(brand, name, horsepower, price);
        }   
        if(n<1){
            System.out.println("there no car");
            return;
        }

        
        try(FileWriter fa = new FileWriter("src/first_revise/output.txt");
            BufferedWriter fb = new BufferedWriter(fa)) 
        {
            for(int i = 0; i< n;i++){
                fb.write(car[i].toLine());
                fb.newLine();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
