package last_rivise;
import java.io.*;
import java.util.Scanner;
class equidment{
    private String equid_name;
    private String catagory_name;
    private double price;
    
   equidment(String equid_name, String catagory_name,double price){
    this.equid_name = equid_name;
    this.catagory_name = catagory_name;
    this.price = price;
   } 

    public String getEquid_name() {
        return equid_name;
    }

    public void setEquid_name(String equid_name) {
        this.equid_name = equid_name;
    }

    public String getCatagory_name() {
        return catagory_name;
    }

    public void setCatagory_name(String catagory_name) {
        this.catagory_name = catagory_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toline(){
        return this.equid_name + " , " + this.catagory_name + " , "+ this.price;
  }

}

public class ex2_test2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        sc.nextLine();
        equidment[] equidment = new equidment[n];

        for(int i = 0 ; i< n;i++){
            System.out.println(" item " + (i+1));
            System.out.print("Input name : ");
            String name = sc.nextLine();
            System.out.print("Input catagory : ");
            String catagory = sc.nextLine();
            System.out.print("Input price : ");
            double price = sc.nextDouble();
            sc.nextLine();
            equidment[i] = new equidment(name, catagory, price);
        }
        try (FileWriter ab = new FileWriter("src/last_rivise/equid.txt")) {
            for(int i = 0; i < n; i++) {
                ab.write(equidment[i].toline() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
}
