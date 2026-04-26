package polymorphism;
class vehicle{
    private String brand;

    // Constructor mặc định
    public vehicle() {
    }
    
    // Constructor có tham số
    public vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    void start(){
        System.out.println("vehicle is start ..");
    }
}
class car extends vehicle{
    car(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("Car " + super.getBrand() + " starting with key.." );

    }
}
class motobike extends vehicle{
    motobike(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("motobike " + super.getBrand() + " starting with key.." );

    }
}
class bus extends vehicle{
    bus(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("Bus " + super.getBrand() + " starting with key.." );

    }
}



public class excercise {
        public static void main(String [] args){
            car mycar = new car("toyota");
            bus mybus = new bus("vin");
            motobike myMotobike = new motobike("honda");
            // cách 1 gọi, polymorphism
            // vehicle[] a = new vehicle[3];
            // a[0] = mycar;
            // a[1] = mybus;
            // a[2] = myMotobike;
            vehicle[] phuongtien = {mycar,mybus,myMotobike};
    
             for(vehicle d : phuongtien ){
                 d.start(); 
             }
        }


}
// vehicle a [0],[1],[2] đều có kiểu dữ liệu là vehicle, nhưng mình gán với mycar,mybus .. đều là kiểu dữ liệu con , đây chính là 
// polymorphism, và trường hợp này là upcasting 