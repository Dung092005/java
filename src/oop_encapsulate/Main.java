package oop_encapsulate;
class Sinhvien{
    // thuộc tinh attribute
    String ten;
    int tuoi;
    double diem; 
    Sinhvien(String t,int a,double d){                         
        ten = t; 
        tuoi = a;
        diem = d;
    }
    void show_thong_tin(){
        System.out.println("ten : " + ten + " tuoi : "+ tuoi + " diem : "+ diem);
    }
    boolean pass(){
        return diem >= 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien("dung",18,20);
        sv1.show_thong_tin();
        System.out.println(sv1.pass());
    }
}


// hàm constuctor là cái sinh vien ấy, nhưng nếu mày muốn đặt tên giống vs tên thuộc tính thì phải dùng this giống ts, còn ko thì cứ khai báo như trên


public class Ex11{
    static class Vector{
        private double x;
        private double y;

        public void SetCoo(double newx,double newy){
            x = newx;
            y = newy;
        }

        public Vector add(Vector v){
            Vector vec = new Vector();
            vec.x = x+v.x;
            vec.y = y+v.y;
            return vec;
        }
        public Vector sub(Vector v){
            Vector vec = new Vector();
            vec.x = x-v.x;
            vec.y = y-v.y;
            return vec;
        }
        public Vector mul(Vector v){
            Vector vec = new Vector();
            vec.x = x*v.x;
            vec.y = y*v.y;
            return vec;
        }
        public void Print(){
            System.out.println("Coordone vector :\nx"+x+"\ny"+y);
        }
    }
    public static void main(String[] args){
            Vector V1 = new Vector();
            Vector V2 = new Vector();
            V1.SetCoo(3, 5);
            V2.SetCoo(5, 9);

            Vector addvec = V1.add(V2);
            Vector subvec = V1.sub(V2);
            Vector mulvec = V1.mul(V2);
            System.out.println("Vector 1: \n");
            V1.Print();
            System.out.println("Vector 2: \n");
            V2.Print();
            System.out.println("Addition: \n");
            addvec.Print();
            System.out.println("Substraction: \n");
            subvec.Print();
            System.out.println("multiplication: \n");
            mulvec.Print();



        }

}